public class Daire {
    private double yaricap;
    private double getyaricap() {
    	return yaricap;
    }
    
    public Daire(double yaricap) {
        if (yaricap <= 0) {
            System.out.println("Radius cannot be zero or negative!");
            this.yaricap = 0;
            return;
        }
        this.yaricap = getyaricap();
    }

    private double cevreHesapla() {
        return 2 * Math.PI * getyaricap();
    }

    private double alanHesapla() {
        return Math.PI *Math.pow(getyaricap(),2);
    }

    public void EkranaYazdir() {
        System.out.println("Radius: " + yaricap);
        System.out.println("Area: " + alanHesapla());
        System.out.println("Circumference: " + cevreHesapla());
    }
}
