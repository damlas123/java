public class Yonetici extends Calisan{
	private int sorumlu_kisi;
	public void setKisi(int sorumlu) {
		sorumlu_kisi=sorumlu;
	}
	public int getKisi() {
		return sorumlu_kisi;
	}
	public Yonetici(String name,String soyad,int id,int sorumlu_kisi) {
		super(name,soyad,id);
		this.sorumlu_kisi=sorumlu_kisi;
	}
	
	@Override
	public void bilgilerigoster() {
		super.bilgilerigoster();
		System.out.println("Sorumlu kisi sayisi:"+sorumlu_kisi);
	}
}