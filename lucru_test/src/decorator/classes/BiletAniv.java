package decorator.classes;

public class BiletAniv extends Decorator{
    public BiletAniv(BiletAbs bilet) {
        super(bilet);
    }

    @Override
    public void afisare() {
        getBilet().afisare();
        System.out.println("lma");
    }

    @Override
    public void reducere() {
        System.out.println("bilet gratis");
    }
}
