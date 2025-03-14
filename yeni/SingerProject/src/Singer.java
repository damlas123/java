import java.util.ArrayList;

public class Singer{
	private ArrayList<String> array=new ArrayList<String>();
	public  void bastir() {
		for(int i=0;i<array.size();i++) {
			System.out.println(array.get(i));
		}
	}
	public void ekle(String name) {
		array.add(name);
	}
	public void sil(String name) {
		int i=array.indexOf(name);
		array.remove(i);
	}
	public void update(int i,String name) {
		array.set(i,name);
	}
	public void ara(String name) {
		int pozisyon=array.indexOf(name);
		if(pozisyon>=0 && pozisyon<array.size())
		System.out.println("Sarkıcı sırası: "+pozisyon);
		else
			System.out.println("Sarkıcı listede yok");
	}
}