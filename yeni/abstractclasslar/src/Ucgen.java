public class Ucgen extends Sekil{
	private int a,b,c;
	double alan,u;
	void setA(int a) {
		this.a=a;
	}
	int getA()
	{
		return a;
	}
	
	void setb(int b) {
		this.b=b;
	}
	int getb()
	{
		return b;
	}
	
	void setC(int c) {
		this.c=c;
	}
	int getC()
	{
		return c;
	}
	Ucgen(String isim,int a,int b,int c){
		super(isim);
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	@Override
	void alan_hesapla()
	{
	 u=(a+b+c)/2.0;
     alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
	}
}