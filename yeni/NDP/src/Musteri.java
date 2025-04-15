
public class Musteri extends Kisi  {
    private String sicilno;
    
    void setSicilno(String sicilno) {
    	this.sicilno=sicilno;
    }
    String getSicilno() {
    	return sicilno;
    			
    }
	Musteri(String ad, String soyad, Adres adres,String sicilno) {
		super(ad, soyad, adres);
		this.sicilno=sicilno;
	}
}
