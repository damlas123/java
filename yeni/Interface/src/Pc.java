public class Pc implements Interface{
	private boolean askerlik;
    private boolean adli_Sicil;
    public Pc(boolean askerlik,boolean adli_Sicil) {
    	this.askerlik=askerlik;
    	this.adli_Sicil=adli_Sicil;
    }
	@Override
	public void askerlikdurumu() {
		if(askerlik) {
			System.out.println("Askerlik yapıldı");
		}
		
		else
			System.out.println(	"Askerlik yapılmadı");
	}
	@Override
	public void adli_sicil() {
		if(adli_Sicil) {
			System.out.println("Adli sicil kaydı var");
		}
		
		else
			System.out.println(	"Adli sicil kaydı  yapılmadı");
	}
}