
public class Sayisal extends Aday {
	Sayisal(int turkce,int matematik,int fen ,int sosyal){
		super(turkce,matematik,fen,sosyal);
	}
@Override
int hesapla() {

	return getFen()*4+getMatematik()*5+getSosyal()*3+getTurkce()*5;
}
}
