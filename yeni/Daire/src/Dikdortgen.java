public class  Dikdortgen extends Sekil{
	private double kenar1;
	private double kenar2;
	public Dikdortgen(double konumX,double konumY,String renk,double kenar1,double kenar2) {
		super(konumX,konumY,renk);
		this.kenar1=kenar1;
		this.kenar2=kenar2;
	}
	public void setKenar1(double kenar1) {
		this.kenar1=kenar1;
	}
	public double getKenar1() {
		return kenar1;
	}
	public void setKenar2(double kenar2) {
		this.kenar2=kenar2;
	}
	public double getKenar2() {
		return kenar2;
	}
	
	@Override
	public double alanHesapla() {
		return this.kenar1*this.kenar2;
	}
}