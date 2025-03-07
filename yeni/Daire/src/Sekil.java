abstract public class Sekil{
	private double konumX;
	private double konumY;
	private String renk;
	
	public Sekil(double konumX,double konumY,String renk) {
		this.konumX=konumX;
		this.konumY=konumY;
	    this.renk=renk;
	}
	public void setKonumX(double konumX) {
		this.konumX=konumX;
	}
	public double getKonumX() {
		return konumX;
	}
	public void setKonumY(double konumY) {
		this.konumY=konumY;
	}
	
	public double getKonumY() {
		return konumY;
	}
	
	public void setRenk(String renk) {
	this.renk=renk;
	}
	public String getRenk() {
		return renk;
	}
	public void konumdegistir(double x,double y) {
		this.setKonumX(x);
		this.setKonumY(y);
	}
	 public abstract double alanHesapla();
	public String toString() {
        return "konumu = (" + this.getKonumX() + "," + this.getKonumY() + ") - rengi= " + this.getRenk();
    }
}
