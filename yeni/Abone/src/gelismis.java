public class gelismis{
	private String isim;
	private int bakiye=120;
	private String sehir;
	
	public void setIsim(String isim) {
		this.isim=isim;
	}
	public String getIsim() {
		return isim;
	}
	public void setsehir(String sehir) {
		this.sehir=sehir;
	}
	public String getSehir() {
		return sehir;
				
	}
	public gelismis(String isim,int bakiye,String sehir) {
		this.isim=isim;
		if(bakiye>=0 && bakiye<=120) {
			this.bakiye=bakiye;
					
		}
		else {
			System.out.println("yetersiz bakiye");
		}
		this.sehir=sehir;
	}
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

	public void bakiye_ogren() {
		System.out.println("Bakiye:"+bakiye);
	}

}