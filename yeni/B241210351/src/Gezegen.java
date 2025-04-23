/** 
* 
* @author damla söylemez damla.soylemez@ogr.sakarya.edu.tr
* @since 22.04.2025
* <p> 
*  gezegenleri tarihleri ve saatlerini alıp en sonda yazdıran sınıf.
* </p> 
*/ 

class Gezegen {
    String ad;
    int gunSaat;
    String tarih;

    private int nufus = 0;

    public Gezegen(String veri) {
        String[] gezegenler = veri.split("#");
        this.ad = gezegenler[0];
        this.gunSaat = Integer.parseInt(gezegenler[1]);
        this.tarih = gezegenler[2];
    }

    public void nufusartir() {
        nufus++;
    }

    public void nufusazalt() {
        if (nufus > 0) nufus--;
    }

    public int getNufus() {
        return nufus;
    }

    @Override
    public String toString() {
        return ad + " - Gün: " + gunSaat + " saat - Tarih: " + tarih;
    }
}
