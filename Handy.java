class Handy_data {
    
    private java.lang.String marke;
    private java.lang.String speicher;

    public Handy_data(java.lang.String marke, java.lang.String speicher) {
        this.marke = marke;
        this.speicher = speicher;
    }
    public java.lang.String toString() {
        return marke + " mit " + speicher + " GB Speicher";
    }
}

public class Handy {
    public static void main(java.lang.String[] args) {
        Handy_data h = new Handy_data("iPhone", "128gb");
        System.out.println(h);
        System.out.println("Handy: " + h);
    }
}
