

public class Main{
	public static void main(String[] args) {
		Sekil [] sekiller=new Sekil[3];
		Daire daire1=new Daire(20,20,"yeşil",2);
		Daire daire2=new Daire(19,21,"turuncu ", 5);
		Dikdortgen dikdortgen1=new Dikdortgen(70,55,"cyan",3,6);
		sekiller[0]=daire1;
		sekiller[1]=daire2;
		sekiller[2]=dikdortgen1;
		for(int i=0;i<3;i++) {
			System.out.println(sekiller[i].alanHesapla());
		}
		
	}
}