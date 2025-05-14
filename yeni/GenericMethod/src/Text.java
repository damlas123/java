
public class Text {
 public static <E extends Aday> E birincikim(E e1,E e2) {
	 if(e1.hesapla()>e2.hesapla()) {
		 return e1;
	 }
	 else {
		 return e2;
	 }
 }
 public static void main(String[] args) {
 Sayisal s1=new Sayisal(30,30,30,30);
 Sayisal s2= new Sayisal(25,25,25,25);
 Esit es1=new Esit(15,25,35,35);
 Esit es2=new Esit(35,35,25,15);
 
 Sayisal a=birincikim(s1,s2);
 Esit b=birincikim(es1,es2);

 System.out.println("Sayısal  Birinci:   "+a.hesapla());
 System.out.println("Eşit ağırlık Birinci:    "+b.hesapla());
 
}
}
