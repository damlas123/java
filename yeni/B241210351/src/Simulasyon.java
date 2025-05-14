import java.util.ArrayList;
import java.util.List;

public class Simulasyon {

    public static void main(String[] args) {

        List<String> gezegenlertxt = DosyaOkuma.dosyayiOku("gezegen.txt");
        List<String> kisilertxt = DosyaOkuma.dosyayiOku("kisiler.txt");
        List<String> araclartxt = DosyaOkuma.dosyayiOku("uzayaraci.txt");

        List<Gezegen> gezegenler = new ArrayList<>();
        for (String satir : gezegenlertxt) {
            gezegenler.add(new Gezegen(satir));
        }

        List<UzayAraci> araclar = new ArrayList<>();
        for (String satir : araclartxt) {
            String[] parcala = satir.split("#");
            String ad = parcala[0];
            String cikisAd = parcala[1];
            String varisAd = parcala[2];
            String tarih = parcala[3];
            int mesafe = Integer.parseInt(parcala[4].trim());

            Gezegen cikis = gezegenBul(gezegenler, cikisAd);
            Gezegen varis = gezegenBul(gezegenler, varisAd);

            UzayAraci arac = new UzayAraci(ad, cikis, varis, mesafe, tarih, "Bekliyor");
            araclar.add(arac);
        }

        List<Kisi> kisiler = new ArrayList<>();
        for (String satir : kisilertxt) {
            Kisi kisi = new Kisi(satir);
            kisiler.add(kisi);
            for (UzayAraci arac : araclar) {
                if (arac.getUzayAraciAdi().equals(kisi.uzayAraci)) {
                    arac.yolcuEkle(kisi);
                    break;
                }
            }
        }

        for (UzayAraci a : araclar) {
            if (a.durumkontrol()) {
                a.setDurum("IMHA");
            }
            if(a.getKalanSure()==0) {
            	a.setDurum("Varış");
            }
        }

        boolean devam = true;
        while (devam) {

            devam = false;
            ekranTemizle();

            for (Gezegen g : gezegenler) g.zamanIlerle();

            for (UzayAraci a : araclar) {
                if (!a.getDurum().equals("IMHA") && a.getKalanSure() > 0) {
                    a.ilerlet();
                    devam = true;
                }
            }

            for (Kisi k : kisiler) {
                k.birSaatYasat();
            }

            for (UzayAraci a : araclar) {
                if (!a.getDurum().equals("IMHA")) {
                    if (a.durumkontrol()) {
                        a.setDurum("IMHA");
                    }
                }
                if (a.getKalanSure() == a.getBaslangicSuresi() - 1) { 
                    a.getCikisGezegeni().nufusazalt();
                }

                if (a.getKalanSure() == 0 && !( a.getDurum().equals("IMHA"))) {
                    a.getVarisGezegeni().nufusartir();
                    a.setDurum("Varış");
                }
            }

            System.out.println();
            System.out.println("Gezegenler:");
            System.out.printf("%-15s%-20s%-20s%-20s%-20s\n", "", "--- X ---", "--- Y ---", "--- Z ---", "--- V ---");
            System.out.printf("%-15s", "Tarih");
            for (Gezegen g : gezegenler) {
                System.out.printf("%-20s", g.zaman.getTarih());
            }
            System.out.println();
            System.out.printf("%-15s", "Nüfus");
            for (Gezegen g : gezegenler) {
                System.out.printf("%-20s", g.getNufus());
            }
            System.out.println("\n");

            System.out.println("Uzay Araçları:");
            System.out.printf("%-10s%-15s%-10s%-10s%-20s%-20s\n", "Araç Adı", "Durum", "Çıkış", "Varış", "Hedefe Kalan Saat", "Hedefe Varacağı Tarih");
            for (UzayAraci a : araclar) {
                if (a.getDurum().equals("IMHA")) {
                    System.out.printf("%-10s%-15s%-10s%-10s%-20s%-20s\n", 
                        a.getUzayAraciAdi(), "IMHA", a.getCikisGezegeni().ad, a.getVarisGezegeni().ad, "--", "--");
                } else if (a.getDurum().equals("Varış")) {
                    System.out.printf("%-10s%-15s%-10s%-10s%-20s%-20s\n", 
                        a.getUzayAraciAdi(), "Vardı", a.getCikisGezegeni().ad, a.getVarisGezegeni().ad, "0", a.getVarilacakTarih());
                } else {
                    System.out.printf("%-10s%-15s%-10s%-10s%-20d%-20s\n", 
                        a.getUzayAraciAdi(), a.getDurum(), a.getCikisGezegeni().ad, a.getVarisGezegeni().ad, a.getKalanSure(), a.getVarilacakTarih());
                }
            }

            try { Thread.sleep(100); } catch (InterruptedException e) {}
        }
    }

    public static Gezegen gezegenBul(List<Gezegen> gezegenler, String ad) {
        for (Gezegen g : gezegenler) {
            if (g.ad.equals(ad)) return g;
        }
        return null;
    }

    public static void ekranTemizle() {
        for (int i = 0; i < 30; i++) System.out.println();
    }
}
