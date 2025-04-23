/** 
* 
* @author damla söylemez damla.soylemez@ogr.sakarya.edu.tr
* @since 22.04.2024 
* <p> 
*  main metodumun olduğu bu sınıf porgramı çalıştırmak için yazıldı.
* </p> 
*/ 

import java.util.ArrayList;
import java.util.List;

public class Simulasyon {
    public static void main(String[] args) {
        List<String> gezegenlertxt= DosyaOkuma.dosyayiOku("veriler/gezegen.txt");
        List<String> kisilertxt = DosyaOkuma.dosyayiOku("veriler/kisiler.txt");
        List<String> araclartxt = DosyaOkuma.dosyayiOku("veriler/uzayaraci.txt");

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

            String durum = "Bekliyor";

            Gezegen cikis = gezegenBul(gezegenler, cikisAd);
            Gezegen varis = gezegenBul(gezegenler, varisAd);

            UzayAraci arac = new UzayAraci(ad, cikis, varis, mesafe, tarih, durum);
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
        }

      
        System.out.println("Gezegenler:");
        for (Gezegen g : gezegenler) {
            System.out.println("--- " + g.ad + " ---");
            System.out.println("Tarih: " + g.tarih);
            System.out.println("Nüfus: " + g.getNufus());
            System.out.println();
        }

        System.out.println("Uzay Araçları:");
        for (UzayAraci a : araclar) {
            System.out.println(a);
        }
    }

    public static Gezegen gezegenBul(List<Gezegen> gezegenler, String ad) {
        for (Gezegen g : gezegenler) {
            if (g.ad.equals(ad)) return g;
        }
        return null;
    }
}
