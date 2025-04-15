
public abstract class Kisi {
   private String ad;
   private String soyad;
   private Adres adres;
   void setAd(String ad) {
	   this.ad=ad;
			  
   }
   String getAd() {
	   return ad;
   }
   void setSoyad(String soyad) {
	   this.soyad=soyad;
			  
   }
   String getSoyad() {
	   return soyad;
   }
   
   void setAdres(Adres adres) {
	   this.adres=adres;
			  
   }
   Adres getAdres() {
	   return adres;
   }
   Kisi(String ad,String soyad,Adres adres){
	   this.ad=ad;
	   this.soyad=soyad;
	   setAdres(adres);
   }
   
   @Override
   public String toString() {
	   return "Kisi{"+
   "ad="+ad+'\''+
   ", soyad'"+soyad+", ev adresi="+adres.toString();
   }
   
}
