public class Abone{
	public String isim;
	public int bakiye;
	public String sehir;
	public void dogalgaz_kullan(int miktar) {
		if((this.bakiye-miktar)<0) {
			System.out.println("Yeterli bakiye yok");
		}
		else {
			this.bakiye-=bakiye;
		}
		if(this.bakiye<=0) {
			System.out.println("Bakiyeniz bitmiştir.En yakın aboneye gidip kredi yükleyiiniz");
		}
		else {
			System.out.println("Yeni bakiye"+bakiye);
		}
	}

	public void bakiye_ogren(int bakiye) {
		System.out.println("Bakiye:"+bakiye);
	}

}