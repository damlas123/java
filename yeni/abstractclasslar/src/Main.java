import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1-Kare alanı\n2-Daire alanı\n3-Ucgen alanı\n");
            String islem = scanner.nextLine();
            if (islem.equals("q")) break;

            switch (islem) {
                case "1":
                    System.out.println("Enter line");
                    int l = scanner.nextInt();
                    scanner.nextLine(); // nextInt() sonrası nextLine() ile boş satırı atla
                    Kare yeni = new Kare("", l);
                    yeni.alan_hesapla();
                    break;
                case "2":
                    System.out.println("Yarıçapı giriniz:");
                    int r = scanner.nextInt();
                    scanner.nextLine(); // nextInt() sonrası nextLine() ile boş satırı atla
                    Daire yeni1 = new Daire("", r);
                    yeni1.alan_hesapla();
                    break;
                case "3":
                    System.out.println("3 kenar giriniz:");
                    int l1 = scanner.nextInt();
                    int l2 = scanner.nextInt();
                    int l3 = scanner.nextInt();
                    scanner.nextLine(); // nextInt() sonrası nextLine() ile boş satırı atla
                    Ucgen yeni2 = new Ucgen("", l1, l2, l3);
                    yeni2.alan_hesapla();
                    break;
                default:
                    System.out.println("Geçersiz seçenek!");
                    break;
            }
        }
        scanner.close();
    }
}
