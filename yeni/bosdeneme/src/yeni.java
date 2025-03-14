import java.util.Scanner;

public class yeni{
	public static void main(String[] args){
		Scanner scanner= new Scanner(System.in);
		int country=scanner.nextInt();
		switch(country){
			case 1:
			System.out.println("Trükiye");break;
			case 2:System.out.println("Almanya");break;
			default:System.out.println( "unkown");break;
		}
		scanner.close();
	}
}