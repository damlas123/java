public class Idman{
	private int bushep;
	private int pushup;
	private int situp;
	private int squat;
	
	public Idman(int bushep, int pushup,int situp,int squat){
		this.bushep=bushep;
		this.pushup=pushup;
		this.situp=situp;
		this.squat=squat;
				
	}
	
	public void setbushep(int sayi) {
		bushep=sayi;
	}
	public int getbushep() {
		return bushep;
	}
	public void setpushup(int sayi) {
		pushup=sayi;
	}
	public int getpushup() {
		return pushup;
	}
	public void setsitup(int sayi) {
		situp=sayi;
	}
	public int getsitup() {
		return situp;
	}
	public void setsquat(int sayi) {
		squat=sayi;
	}
	public int getsquat() {
		return squat;
	}
}