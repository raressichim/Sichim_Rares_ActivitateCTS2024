package decorator.main;

import decorator.classes.Bilet;
import decorator.classes.BiletAbs;
import decorator.classes.BiletAniv;
import decorator.classes.Decorator;

public class Main {
    public static void main(String[] args) {
        BiletAbs bilet = new Bilet(1);
        Decorator biletAniv = new BiletAniv(bilet);
        biletAniv.reducere();
        biletAniv.afisare();
    }
}
