package GUI;

import java.util.Arrays;

public class Parkhaus {

    private Auto[] parkhaus;

    public Parkhaus(int anzahlPlaetze) {
        parkhaus = new Auto[anzahlPlaetze];
    }

    public void einparken(Auto auto) {
        for (int i = 0; i < parkhaus.length; i++) {
            if (parkhaus[i] == null) {
                parkhaus[i] = auto;
                System.out.println("Auto " + auto + " geparkt auf Platz " + i);
                return;
            }
        }
        System.out.println("Parkhaus ist voll!");
    }

    public void ausparken(String kennzeichen) {
        for (int i = 0; i < parkhaus.length; i++) {
            if (parkhaus[i] != null &&
                parkhaus[i].getKennzeichen().equals(kennzeichen)) {

                System.out.println("Auto " + parkhaus[i] + " verlässt Platz " + i);
                parkhaus[i] = null;
                return;
            }
        }
        System.out.println("Auto nicht gefunden.");
    }

    public void belegungAusgeben() {
        System.out.println(Arrays.toString(parkhaus));
    }

    public int freiePlaetzeZaehlen() {
        int count = 0;
        for (Auto auto : parkhaus) {
            if (auto == null) count++;
        }
        return count;
    }

    public double auslastungBerechnen() {
        return 100.0 * (parkhaus.length - freiePlaetzeZaehlen()) / parkhaus.length;
    }

    public void tick() {
        for (Auto auto : parkhaus) {
            if (auto != null) {
                auto.erhoeheParkdauer();
            }
        }
    }
}
