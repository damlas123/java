public class Main{
	public static void main(String[] args) {
		Matematik.factoriel fac= new Matematik().new factoriel();
		fac.fac_hesapla();
		Matematik.Asal sayi=new Matematik(). new Asal();
		System.out.println("sayi asal mı:"+sayi.asalmi(991));
		Matematik.Daire_alan sayi1=new Matematik().new Daire_alan();
		
		System.out.println("Alan:"+sayi1.daire_alan(3.78));
	}
}