public class Main{
	public static void main(String[] args) {
		Resolition resolition= new Resolition(1920,1254);
		Ekran ekran= new Ekran("vx324","Asus",25,resolition);
		
		Kasa kasa= new Kasa("erg","Asus","polimetal");
		Anakart anakart= new Anakart("amdryzen6","Asus", 8,"linux");
		Bilgisayar bilgisayar = new Bilgisayar(ekran,anakart,kasa);
		
		bilgisayar.getKasa().bilgisayari_Ac();
		bilgisayar.getanakart().isletim_sistemi_yukle(	"Windows");
		
		
	}
}