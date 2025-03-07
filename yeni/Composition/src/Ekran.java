public class Ekran{
	private String model;
	private String uretici;
	private int boyut;
	private Resolition resolition;
	
	
	public void getModel(String model) {
		this.model=model;
}

public String getmodel() {
	return model;
}
    public void setUretici(String uretici) {
    	this.uretici=uretici;

    }
    public String getUretici() {
    	return uretici;
    }
    public void setBoyut(int boyut) {
    	this.boyut=boyut;
    }
    public int getboyut() {
    	return boyut;
    }
    public void setResolition(Resolition resolition) {
    	this.resolition=resolition;
    }
    public Resolition getResolition() {
    	return resolition;
    }
    public Ekran(String model,String uretici,int boyut,Resolition resolition) {
    	this.resolition=resolition;
    	this.boyut=boyut;
    	this.uretici=uretici;
    	this.model=model;
    }
    
}