package flyweight.main;


import flyweight.classes.Banca;
import flyweight.classes.Client;
import flyweight.classes.Cont;
import flyweight.classes.Flyweight;

public class Main {
    public static void main(String[] args) {
        Banca banca = new Banca("banca");
        Flyweight client = new Client("rares");
        Cont cont1 = new Cont(12);
        Cont cont2 = new Cont(15);
        banca.adaugaElement("rares",client);
        banca.getElement("rares").afisareInformatii(cont1);

    }
}
