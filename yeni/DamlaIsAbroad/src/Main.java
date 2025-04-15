public class Main{
	public static void main(String[] args) {
		Yolcu damla=new Yolcu("D","Gecti","Tam");
		if(damla.belgekontrolu()&&damla.yasak()&&damla.vize()) {
			System.out.println("Damla hanım yurt dışına çıkabilirsiniz");
		}
		
	}
}