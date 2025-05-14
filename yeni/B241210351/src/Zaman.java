/** 
 * 
 * @author Damla Söylemez damla.soylemez@ogr.sakarya.edu.tr
 * @since 16.04.2024
 * <p> 
 *  Tarihi yöneten zaman sınıfı.
 * </p> 
 */ 

public class Zaman {
    private int gun;   
    private int ay;    
    private int yil;   
    private int saat; 
    private int gunsaati; 

    public Zaman(String tarihStr, int gunsaati) {
        String[] parcala = tarihStr.split("\\.");
        this.gun = Integer.parseInt(parcala[0]);
        this.ay = Integer.parseInt(parcala[1]);
        this.yil = Integer.parseInt(parcala[2]);
        this.saat = 0;
        this.gunsaati = gunsaati;
    }

    public void ilerlet() {
        saat++;
        if (saat >= gunsaati) {
            saat = 0;
            gun++;
            if (gun > 30) {
                gun = 1;
                ay++;
                if (ay > 12) {
                    ay = 1;
                    yil++;
                }
            }
        }
    }

    public String getTarih() {
        return gun + "." + ay + "." + yil;
    }

    public String getSaat() {
        return (saat < 10 ? "0" + saat : saat) + ":00";
    }

    @Override
    public String toString() {
        return getTarih() + " - " + getSaat();
    }
}
