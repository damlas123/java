public class Daire extends Sekil{
	int yaricap;
	
	Daire(String isim,int yaricap){
		super(isim);
		this.yaricap=yaricap;
	}
	Daire(String isim){
		super(isim);
	}
	@Override
	void alan_hesapla() {
		System.out.println("Daire'nin alanı:"+(Math.PI*yaricap*2));
	}
}