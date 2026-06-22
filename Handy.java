class Handy_data {
    
    private java.lang.String marke;
    private int speicher;//gb

    public Handy_data(java.lang.String marke, int speicher) {
        this.marke = marke;
        this.speicher = speicher;
    }
    public java.lang.String toString() {
        return marke + " mit " + speicher + " GB Speicher";
    }
}

public class Handy {
    public static void main(java.lang.String[] args) {
        Handy_data h = new Handy_data("iPhone", 128);
        System.out.println(h);
        System.out.println("Handy: " + h);
    }
}
