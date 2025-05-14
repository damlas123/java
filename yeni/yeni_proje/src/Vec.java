import java.util.Scanner;

public class Vec{
	private String isim;
	private int i,j,k;
	public Vec(String isim) {
		this.isim=isim;
        
		Scanner scanner=new Scanner(System.in);
		this.i=scanner.nextInt();
		this.j=scanner.nextInt();
		this.j=scanner.nextInt();
		scanner.close();
		
	}
	public void Setisim(String isim) {
		this.isim=isim;
	}
	public String getisim() {
		return isim;
	}
	
	public void Seti(int i) {
		this.i=i;
	}
	public int geti() {
		return i;
	}
	public void Setj(int j) {
		this.j=j;
	}
	public int getj() {
		return j;
	}
	public void Setk(int k) {
		this.k=k;
	}
	public int getk() {
		return k;
	}
}