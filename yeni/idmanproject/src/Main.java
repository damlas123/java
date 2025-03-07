import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Hareketler:\n1-Burpee\n2-Pushup\n3-Situp\n4-Squat\n");
		System.out.println("bir idman oluşturunuz:");
		
		System.out.println("burpee sayisini giriniz:");
		int burpee=scanner.nextInt();
		System.out.println("Pushup sayisini giriniz:");
		int pushup=scanner.nextInt();
		System.out.println("situp sayisini giriniz:");
		int situp=scanner.nextInt();
		System.out.println("Squat sayısını giriniz:");
		int squat=scanner.nextInt();
		Idman idman=new Idman(burpee,pushup,situp,squat);
		
		
	}
}