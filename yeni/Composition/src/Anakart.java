public class Anakart{
	private String model;
	private String uretici;
	private int yuva_sayisi;
	private String isletim_sistemi;
	
	public void setModel(String model) {
		this.model=model;
	}
	public String getModel() {
		return model;
	}
	public void setUretici(String uretici) {
		this.uretici=uretici;
	}
	public String getUretici() {
		return uretici;
	}
	public void setYuva_sayisi(int yuva_sayisi) {
		this.yuva_sayisi=yuva_sayisi;
	}
	public int getYuva_sayisi() {
		return yuva_sayisi;
	}
	public void setİsletim_sistemi(String isletim_sistemi) {
		this.isletim_sistemi=isletim_sistemi;
	}
	public String getİsletim_sistemi() {
		return isletim_sistemi;
	}
	public Anakart(String model,String uretici,int yuva_sayisi,String isletim_sistemi) {
		this.model=model;
		this.uretici=uretici;
		this.yuva_sayisi=yuva_sayisi;
		this.isletim_sistemi=isletim_sistemi;
	}
	public void isletim_sistemi_yukle(String isletim_sistemi) {
		this.isletim_sistemi=isletim_sistemi;
		System.out.println("İşletim sistemi başarılı bir şekilde yüklendi  "+isletim_sistemi);
	}
}