/** 
 * 
 * @author Damla Söylemez
 * @since 19.04.2024
 * <p> 
 *  Uzay araçlarının hareketini ve durumunu yönetir.
 * </p> 
 */ 

import java.util.ArrayList;
import java.util.List;

public class UzayAraci {
    private String uzayAraciAdi;
    private Gezegen varisGezegeni;
    private Gezegen cikisGezegeni;
    private int hedefeKalanSure;
    private String varilacakTarih;
    private String durum;
    private List<Kisi> yolcular = new ArrayList<>();

    public UzayAraci(String uzayAraciAdi, Gezegen cikisGezegeni, Gezegen varisGezegeni, int hedefeKalanSure, String varilacakTarih, String durum) {
        this.uzayAraciAdi = uzayAraciAdi;
        this.varisGezegeni = varisGezegeni;
        this.cikisGezegeni = cikisGezegeni;
        this.hedefeKalanSure = hedefeKalanSure;
        this.varilacakTarih = varilacakTarih;
        this.durum = durum;
    }

    public String getUzayAraciAdi() {
        return uzayAraciAdi;
    }

    public String getDurum() {
        return durum;
    }
    
    public void setCikisGezegeni(Gezegen cikisGezegeni) {
    	this.cikisGezegeni=cikisGezegeni;
    }
    public Gezegen getCikisGezegeni() {
    	return cikisGezegeni;
    }
    
    public void setvarisGezegeni(Gezegen varisGezegeni) {
    	this.varisGezegeni=varisGezegeni;
    }
    public Gezegen getVarisGezegeni() {
    	return varisGezegeni;
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }

    public void yolcuEkle(Kisi kisi) {
        yolcular.add(kisi);
    }
    
    public void setVarilacakTarih(String varilacakTarih) {
    	this.varilacakTarih=varilacakTarih;
    }
    public String getVarilacakTarih() {
    	return varilacakTarih;
    }
    

public int getBaslangicSuresi() {
    return hedefeKalanSure + 1; 
}

    public boolean durumkontrol() {
        for (Kisi k : yolcular) {
            if (k.yasiyorMu()) {
                this.durum = "Bekliyor";
                return false;
            }
        }
        this.durum = "IMHA";
        return true;
    }


    public void ilerlet() {
        if (durum.equals("IMHA") || hedefeKalanSure <= 0) return;

        hedefeKalanSure--;

        if (hedefeKalanSure == 0) {
            durum = "Varış";
            varisGezegeni.nufusartir();
        }
    }

    public int getKalanSure() {
        return hedefeKalanSure;
    }

    @Override
    public String toString() {
        if (durum.equals("IMHA")) {
            return "Araç Adı: " + uzayAraciAdi +
                   "\nDurum: IMHA\nÇıkış: " + cikisGezegeni.ad +
                   "\nVarış: " + varisGezegeni.ad +
                   "\nHedefe Kalan Saat: --" +
                   "\nHedefe Varacağı Tarih: --\n";
        }

        return "Araç Adı: " + uzayAraciAdi +
               "\nDurum: " + durum +
               "\nÇıkış: " + cikisGezegeni.ad +
               "\nVarış: " + varisGezegeni.ad +
               "\nHedefe Kalan Saat: " + hedefeKalanSure +
               "\nHedefe Varacağı Tarih: " + varilacakTarih + "\n";
    }
}
