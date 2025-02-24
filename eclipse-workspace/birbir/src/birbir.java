import java.util.Scanner;

public class birbir{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int age=scanner.nextInt();
		scanner.nextLine();
		String name =scanner.nextLine();
		System.out.println(age);
		System.out.println(name);
		scanner.close();
	}
}