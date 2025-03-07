import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your height:");
		double boy=scanner.nextDouble();
		System.out.println("Enter your weight:");
		double kilo=scanner.nextDouble();
		double sonuc =kilo/(boy*boy);
		System.out.println("Your index is:"+sonuc);
	    scanner.close();
	}
	
}