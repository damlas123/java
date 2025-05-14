
public abstract class Aday {
 protected int turkce;
 protected int matematik;
 protected int fen;
 protected int sosyal;
 
  Aday(int turkce,int matematik,int fen ,int sosyal) {
	 this.fen=fen;
	 this.turkce=turkce;
	 this.matematik=matematik;
	 this.sosyal=sosyal;
 }

public int getTurkce() {
	return turkce;
}

public void setTurkce(int turkce) {
	this.turkce = turkce;
}

public int getMatematik() {
	return matematik;
}

public void setMatematik(int matematik) {
	this.matematik = matematik;
}

public int getFen() {
	return fen;
}

public void setFen(int fen) {
	this.fen = fen;
}

public int getSosyal() {
	return sosyal;
}

public void setSosyal(int sosyal) {
	this.sosyal = sosyal;
}
 abstract int hesapla() ;
}
