
public class Main {
  public static void main(String[] args) {
	  Character [] dizic= {'J','A','V','A'};
	  Integer []dizi= {1,2,3,4,5,6};
	  String []dizis= {"damla","naber"};
	  YazdirmaGeneric<Character> chartipi=new YazdirmaGeneric<Character>();
	  chartipi.yazdir(dizic);
	  System.out.println("********************");
	  YazdirmaGeneric<Integer> intipi= new YazdirmaGeneric<Integer>();
	  intipi.yazdir(dizi);

	  System.out.println("********************");
	  YazdirmaGeneric<String> stringtipi= new YazdirmaGeneric<String>();
	  stringtipi.yazdir(dizis);

	  System.out.println("********************");
	  
	  
  }
}
