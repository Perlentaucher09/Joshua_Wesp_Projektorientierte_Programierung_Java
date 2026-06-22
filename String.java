class Schueler {
    private java.lang.String name;

    public Schueler(java.lang.String name) {
        this.name = name;
    }

    @Override
    public java.lang.String toString() {
        return name;
    }
}

public class String {
    public static void main(java.lang.String[] args) {
        Schueler s = new Schueler("Anna");
        System.out.println(s.toString());
    }
}