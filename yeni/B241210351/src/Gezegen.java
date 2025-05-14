/** 
 * 
 * @author damla söylemez damla.soylemez@ogr.sakarya.edu.tr
 * @since 22.04.2025
 * <p> 
 *  Gezegenlerin zamanını yöneten ve nüfusu takip eden sınıf.
 * </p> 
 */ 

public class Gezegen {
    String ad;
    int gunSaat;
    Zaman zaman;
    private int nufus = 0;

    public Gezegen(String veri) {
        String[] gezegenler = veri.split("#");
        this.ad = gezegenler[0];
        this.gunSaat = Integer.parseInt(gezegenler[1]);
        this.zaman = new Zaman(gezegenler[2], gunSaat);
    }

    public void zamanIlerle() {
        zaman.ilerlet();
    }

    public String zamanBilgisi() {
        return zaman.toString();
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
        return ad + " - " + zamanBilgisi() + " - Nüfus: " + nufus;
    }
}
