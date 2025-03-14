import java.util.Scanner;

public class Main{
	public static Scanner scanner=new Scanner(System.in);
	public static Singer singer=new Singer();
    public static void islemler() {
    	System.out.println("İşlemler\n1-Şarkıcıları görüntüle\t2-Şarkıcı ekle\t3-Şarkıcı sil\t4-Güncelle\t5-Bul\n");
    }
	public static void main(String[] args) {
		islemler();
		System.out.println("İşlem girin");
		int a=scanner.nextInt();
		while(true) {
		switch(a) {
		case 1:singer.bastir();System.out.println("İşlem girin");
		 a=scanner.nextInt();break;
		case 2:
			System.out.println("Şarkıcı adı");
			scanner.nextLine();
			String i=scanner.nextLine();
			singer.ekle(i);
			System.out.println("İşlem girin");
			a=scanner.nextInt();
			break;
		
		case 3:
			System.out.println("Şarkıcı ismi:");
			scanner.nextLine();
			String in=scanner.nextLine();
			singer.sil(in);	
			System.out.println("İşlem girin");
			a=scanner.nextInt();
		default:break;
	}}}
}