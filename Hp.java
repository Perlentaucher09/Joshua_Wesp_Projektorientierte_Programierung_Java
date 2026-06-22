class Buch {
    
    private java.lang.String titel;

    public Buch(java.lang.String titel) {
        this.titel = titel;
    }
    public java.lang.String toString() {
        return titel;
    }
}

public class Hp {
    public static void main(java.lang.String[] args) {
        Buch b = new Buch("Harry Potter");
        System.out.println(b);
        System.out.println("Buch: " + b);
    }
}
