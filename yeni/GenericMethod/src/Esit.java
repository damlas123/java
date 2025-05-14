
public class Esit extends Aday {
	Esit(int turkce,int matematik,int fen ,int sosyal){
		super(turkce,matematik,fen,sosyal);
	}
	@Override
	int hesapla() {
		
		return getTurkce()*5+getFen()*3+getMatematik()*5+getSosyal()*4;
	}
}
