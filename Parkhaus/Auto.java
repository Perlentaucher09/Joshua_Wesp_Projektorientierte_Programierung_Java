package Parkhaus;
public class Auto {

    private String kennzeichen;
    private String farbe;
    private int parkdauer;

    public Auto(String kennzeichen, String farbe, int parkdauer) {
        this.kennzeichen = kennzeichen;
        this.farbe = farbe;
        this.parkdauer = parkdauer;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public void erhoeheParkdauer() {
        parkdauer++;
    }

    @Override
    public String toString() {
        return kennzeichen + " (" + farbe + ", " + parkdauer + "h)";
    }
}
