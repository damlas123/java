import java.util.Arrays;
import java.util.Scanner;

public class Main{
	  static Scanner scanner = new Scanner(System.in);

	public static int[] array_olustur(int len) {
		int i;
		
		int[] ar=new int[len];
		
		for(i=0;i<len;i++) {
			ar[i]=scanner.nextInt();
		}
	
		return ar;
	}
	public static void array_sort(int[] ar) {
		Arrays.sort(ar);
	}
	public static  void array_yazdir(int len, int[] ar) {
		for(int i=0;i<len;i++) {
			System.out.println((i+1)+". eleman: "+ar[i]);
		}
	}
	public static void main(String[] args) {
		int[] a=array_olustur(5);
		array_sort(a);
		array_yazdir(5,a);
		scanner.close();
	}
}