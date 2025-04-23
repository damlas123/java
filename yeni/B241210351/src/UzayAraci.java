
/** 
* 
* @author Damla Söylemez
* @since 19.04.2024
* <p> 
*  Uzay Araçlarını okuyup durumlarını belirliyorum. 
* </p> 
*/ 

import java.util.ArrayList;
import java.util.List;

class UzayAraci {
    private String uzayAraciAdi;
    private Gezegen varisGezegeni;
    private Gezegen cikisGezegeni;
    private int hedefeKalanSure;
    private String varilacakTarih;
    private String durum = "Bekliyor";
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

    public void setDurum(String durum) {
        this.durum = durum;
    }

    public void yolcuEkle(Kisi kisi) {
        yolcular.add(kisi);
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

    @Override
    public String toString() {
        return "Araç Adı: " + uzayAraciAdi +
               "\nDurum: " + durum +
               "\nÇıkış: " + cikisGezegeni.ad +
               "\nVarış: " + varisGezegeni.ad +
               "\nHedefe Kalan Saat: " + hedefeKalanSure +
               "\nHedefe Varacağı Tarih: " + varilacakTarih + "\n";
    }
}

