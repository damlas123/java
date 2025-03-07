public class Yazilimci extends Calisan{
	private String diller;
	public void setdiller(String diller) {
		this.diller=diller;
	}
	public String getDiller()
	{
		return diller;
	}
	public Yazilimci(String name,String soyad,int id,String diller) {
		super(name,soyad,id);
		this.diller=diller;
	}
	public void format_At(String isletim_sistemi) {
		System.out.println(getName()+isletim_sistemi+"yüklüyor..");
	}

	@Override
	public void bilgilerigoster() {
		
		super.bilgilerigoster();
		System.out.println("\n Yazilimcinin bildiği diller:"+diller);
	}
}