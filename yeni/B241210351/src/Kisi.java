/** 
 * 
 * @author Damla Söylemez damla.soylemez@ogr.sakarya.edu.tr
 * @since 16.04.2025
 * <p> 
 *  Kişilerin özelliklerini tutar ve ömür durumunu kontrol eder.
 * </p> 
 */ 

public class Kisi {
    String isim;
    int yas;
    int kalanOmur;
    String uzayAraci;

    public Kisi(String veri) {
        String[] kisiler = veri.split("#");
        this.isim = kisiler[0];
        this.yas = Integer.parseInt(kisiler[1]);
        this.kalanOmur = Integer.parseInt(kisiler[2]);
        this.uzayAraci = kisiler[3];
    }

    public boolean yasiyorMu() {
        return kalanOmur > 0;
    }

    public void birSaatYasat() {
        if (kalanOmur > 0) kalanOmur--;
    }

    @Override
    public String toString() {
        return isim + " - Yaş: " + yas + " - Kalan Ömür: " + kalanOmur + " - Uzay Aracı: " + uzayAraci;
    }
}
