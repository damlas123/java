public class Bilgisayar{
	private Ekran monitor;
	private Anakart anakart;
	private Kasa kasa;
	
	public void setMonitor(Ekran monitor) {
		this.monitor=monitor;
	}
	public Ekran getMonitor() {
		return monitor;
	}
	public void setanakart(Anakart anakart) {
		this.anakart=anakart;
	}

	public Anakart getanakart() {
		return anakart;
	}
	public void setKasa(Kasa kasa) {
		this.kasa=kasa;
	}
	public Kasa getKasa() {
		return kasa;
	}
	public Bilgisayar(Ekran ekran, Anakart anakart,Kasa kasa) {
		this.monitor=ekran;
		this.anakart=anakart;
		this.kasa=kasa;
	}

}