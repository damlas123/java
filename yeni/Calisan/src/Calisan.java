public class Calisan{
	public String name;
	public int maas;
	public String departman;
	

	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setMaas(int maas) {
		this.maas=maas;
	}
	public int getMaas() {
		return maas;
	}
	public void setDepartman(String departman) {
		this.departman=departman;
	}
	public String getDepartman() {
		return departman;
	}
	public void calis() {
		System.out.println("calisan.java calisiyor");
	}
	
	public Calisan(String name,int maas,String departman) {
		this.name=name;
		this.maas=maas;
		this.departman=departman;
	}

	public void bilgilerigoster() {
		System.out.println("Name:"+this.name+"\nSalary:"+this.maas+"\nDepartman:"+this.departman+"\n");
	}
	public void Departman_change(String yeni_departman) {
		this.departman=yeni_departman;
		System.out.println("Departman degistirildi");
	}
    
	
}