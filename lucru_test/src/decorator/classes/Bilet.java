package decorator.classes;

public class Bilet implements BiletAbs {
    private int id;

    public Bilet(int id) {
        this.id = id;
    }

    @Override
    public void afisare() {
        System.out.println(id + " a fost validat");
    }
}
