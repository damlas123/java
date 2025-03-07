public class Rectangle {
    int en, boy;

    public Rectangle(int en, int boy) {
        if (en <= 0 || boy <= 0) {
            System.out.println("The line can't be smaller than 0");
            this.en = 0;
            this.boy = 0;
            return;
        }
        this.en = en;
        this.boy = boy;
    }

    public int alanHesapla() {
        return en * boy;
    }

    private int cevreHesapla() {
        return 2 * (en + boy);
    }

    public void RectangleEkranaYazdir() {
        System.out.println("The area: " + alanHesapla());
        System.out.println("The perimeter: " + cevreHesapla());
    }
}
