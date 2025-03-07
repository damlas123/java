public class Calisan{
	private String name;
	private String soyad;
	private int id;
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setSurname(String soyad) {
		this.soyad=soyad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getYas() {
		return id;
	}
	public Calisan(String name, String soyad,int id) {
		this.name=name;
		this.soyad=soyad;
		this.id=id;
	}
	
	public void bilgilerigoster() {
		System.out.println("Bilgiler:\nAd:"+name+"\nSoyadi:"+soyad+"\nID:"+id);
	}
	
	
}