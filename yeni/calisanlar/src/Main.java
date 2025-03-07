import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("1 - Yönetici işlemleri\n2 - Yazılımcı işlemleri\n3 - 'q' ile çıkış\n");
            String islem = scanner.nextLine();

            if (islem.equals("q")) {
                System.out.println("Programdan çıkılıyor...");
                break;
            }

            switch (islem) {
                case "1":
                    Yonetici yeni = new Yonetici("Damla", "Soylemez", 65, 10);
                    System.out.println("1 - Bilgileri görüntüle\n2 - Çıkış için 'q'");
                    String islemler = scanner.nextLine();

                    if ("1".equals(islemler)) {
                        yeni.bilgilerigoster();
                    } else if ("q".equals(islemler)) {
                        System.out.println("Yönetici işlemlerinden çıkılıyor...");
                        break;
                    }
                    break;

                case "2":
                    Yazilimci yeni1 = new Yazilimci("Deniz", "Erdem", 67, "Java, C, Python");
                    System.out.println("1 - Bilgileri göster\n2 - İşletim sistemine format at\n3 - Çıkış için 'q'\n");
                    String islemler2 = scanner.nextLine();

                    if ("1".equals(islemler2)) {
                        yeni1.bilgilerigoster();
                    } else if ("2".equals(islemler2)) {
                        System.out.println("İşletim sistemini giriniz:");
                        String isletimSistemi = scanner.nextLine();
                        yeni1.format_At(isletimSistemi);
                    } else if ("q".equals(islemler2)) {
                        System.out.println("Yazılımcı işlemlerinden çıkılıyor...");
                        break;
                    }
                    break;

                default:
                    System.out.println("Geçersiz işlem! Lütfen tekrar deneyin.");
            }
        }
        scanner.close();
    }
}
