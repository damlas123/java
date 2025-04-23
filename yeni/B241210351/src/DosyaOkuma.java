
/** 
* 
* @author damla söylemez damla.soylemez@ogr.sakarya.edu.tr
* @since 22.04.2025
* <p> 
*  dosyadan verileri çeken sınıf
* </p> 
*/ 

import java.util.ArrayList;
import java.util.List;

class DosyaOkuma {
    public static List<String> dosyayiOku(String dosyaAdi) {
        List<String> satirlar = new ArrayList<>();
        try (java.io.BufferedReader br = new java.io.BufferedReader(new java.io.FileReader(dosyaAdi))) {
            String satir;
            while ((satir = br.readLine()) != null) {
                satirlar.add(satir);
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        return satirlar;
    }
}
