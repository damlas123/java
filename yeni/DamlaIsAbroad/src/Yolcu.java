public class Yolcu implements IYolcu{
    private String kart;
    private String kontrol;
    private String doc;
    public void setKart(String kart) {
    	this.kart=kart;
    }
    public String getkart() {
    	return kart;
    }
    
    public void setkontrol(String kontrol) {
    	this.kontrol=kontrol;
    }
    public String getKontrol() {
    	return kontrol;
    }
    public void setdoc(String doc) {
    	this.doc=doc;
    }
    public String getdoc() {
    return doc;
    }
    Yolcu(String kart,String kontrol,String doc) {
    	this.kart=kart;
    	this.kontrol=kontrol;
    	this.doc=doc;
    			
    }
	@Override
	public boolean vize() {
		if(kart=="A" || kart=="C" || kart=="D") {
			return true;
		}
		return false;
	}

	@Override
	public boolean yasak() {
		if(kontrol=="Gecti"){
			return true;
		}
		return false;
	}

	@Override
	public boolean belgekontrolu() {
		if(doc=="Tam") {
			return true;
		}
		return false;
	}
	
}