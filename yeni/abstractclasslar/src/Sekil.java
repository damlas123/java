public abstract class Sekil{
	private String isim;
	public void setisim(String isim) {
		this.isim=isim;
	}
	public String getisim() {
		return isim;
	}
	Sekil(String isim){
		this.isim=isim;
	}
	abstract void alan_hesapla();
}