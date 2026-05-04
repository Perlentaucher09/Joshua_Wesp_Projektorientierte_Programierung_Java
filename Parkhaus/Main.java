package Parkhaus;
//import javax.swing.JFrame;
//extends JFrame
public class Main {
	//public Main() {
	//	super ("Fenster_01");
	//	this.setSize(100,100);
	//	this.setVisible(true);
	//}

    public static void main(String[] args) {
    	//Main g = new Main();
    	//g.setBackground();

        Parkhaus p = new Parkhaus(5);

        Auto a1 = new Auto("WI-AB123", "Rot", 1);
        Auto a2 = new Auto("WI-CD456", "Blau", 2);

        p.einparken(a1);
        p.einparken(a2);

        p.belegungAusgeben();

        System.out.println("Freie Pl�tze: " + p.freiePlaetzeZaehlen());
        System.out.println("Auslastung: " + p.auslastungBerechnen() + "%");

        p.tick();

        p.ausparken("WI-CD456");
        p.belegungAusgeben();
    }
}
