import java.util.Scanner;

public class Matematik{
	public double PI=Math.PI;
	public class factoriel{
		Scanner yeni=new Scanner(System.in);
		int fac=1;
		int i=2;
		int sayi=yeni.nextInt();
		public void fac_hesapla() {

			while(i<sayi) {
				fac*=i;
				i++;
			}

		}
		
	}
	public class Asal{
		public boolean asalmi(int sayi) {
			int i = 2;
			while(i<=sayi/2) {
				if(sayi%i==0) {
					return false;
				}
	           i++;
			}
			return true;
		}
	}
	public class Daire_alan{
		public double daire_alan(double yaricap) {
			return yaricap*yaricap*PI;
		}
	}
}