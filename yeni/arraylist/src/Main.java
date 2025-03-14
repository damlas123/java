import java.util.ArrayList;

public class Main{
	public static void arraylist_ekleme(String name,ArrayList<String> a) {
		a.add(name);
	}
	public static  void arraylist_yazdirma(ArrayList<String> a) {
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
	}
	public static void main(String[] args) {
		ArrayList<String> arraylist=new ArrayList<String>();	
		arraylist.add("Gun's n Roses");
		arraylist_ekleme("Damla",arraylist);
		arraylist_ekleme("this I love",arraylist);
		arraylist_yazdirma(arraylist);
		
	}
}