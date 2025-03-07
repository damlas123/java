import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int a,b;
		System.out.println("Enter first line:");
		a=scanner.nextInt();
		System.out.println("Enter second line:");
		b=scanner.nextInt();
		double c=Math.sqrt(a*a+b*b);
		System.out.println("The hypotenus is:"+c);
		scanner.close();
	}
}