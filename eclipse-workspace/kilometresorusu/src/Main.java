import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("enter km:");
		double km=scanner.nextDouble();
		System.out.println("Enter the money that your car spend over the km:");
		double fuel=scanner.nextDouble();
		double money=km*fuel;
		System.out.println("The total money:"+money);
		scanner.close();
		
	}
}