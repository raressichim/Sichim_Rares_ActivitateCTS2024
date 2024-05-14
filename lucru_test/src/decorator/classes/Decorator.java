package decorator.classes;

public abstract class Decorator implements BiletAbs {
    private BiletAbs bilet;

    public Decorator(BiletAbs bilet) {
        this.bilet = bilet;
    }

    public BiletAbs getBilet() {
        return bilet;
    }

    public abstract void reducere();

}
