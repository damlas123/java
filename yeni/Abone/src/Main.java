public class Main{
	public static void main(String[] args) {
		Abone abone=new Abone();
		abone.isim="Damla soylemez";
		abone.bakiye=200;
		//abone.sehir="ankara";
		abone.dogalgaz_kullan(200);
		gelismis abone1= new gelismis("Damla",200,"Ankara");
		abone1.bakiye_ogren();
		abone1.dogalgaz_kullan(200);
	}
	
}