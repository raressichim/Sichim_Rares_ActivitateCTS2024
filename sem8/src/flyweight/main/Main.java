package flyweight.main;

import flyweight.clase.Banca;
import flyweight.clase.Cont;

public class Main {
    public static void main(String[] args) {
        Banca banca = new Banca("banca1", 100);
        Cont cont1 = new Cont(1, 25);
        Cont cont2 = new Cont(2, 50);
        Cont cont3 = new Cont(3, 60);

        banca.getClient("raresica", "bacau", "1234567").afisareInformatii(cont1);
        banca.getClient("raresica").afisareInformatii(cont2);
    }
}
