public class Kare extends Sekil{
	int kenar;
	void setKenar(int kenar) {
		this.kenar=kenar;
	}
	int getKenar() {
		return kenar;
	}
	Kare(String isim,int kenar){
		super(isim);
		this.kenar=kenar;
	}
	Kare(String isim){
		super(isim);
	}
	@Override
	void alan_hesapla() {
		System.out.println(getisim()+"'in alani:"+(kenar*kenar));
	}
}