
/** 
* 
* @author damla söylemez damla.soylemez@ogr.sakarya.edu.tr

* @since 22.04.2025
* <p> 
*  dosyadan verileri çeken sınıf
* </p> 
*/ 

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
class DosyaOkuma {
    private static final String BASE_PATH = "veriler/";

    public static List<String> dosyayiOku(String dosyaAdi) {
        List<String> satirlar = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(BASE_PATH + dosyaAdi))) {
            String veri;
            while ((veri = br.readLine()) != null) {
                satirlar.add(veri);
            }
        } catch (IOException e) {
            System.err.println("Dosya okunamadı: " + dosyaAdi);
            e.printStackTrace();
        }
        return satirlar;
    }
}
