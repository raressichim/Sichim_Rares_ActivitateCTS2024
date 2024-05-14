package composite.main;

import composite.classes.Agentie;
import composite.classes.Filiala;
import composite.classes.Sediu;
import composite.classes.Sucursala;

public class Main {
    public static void main(String[] args) {
        Sediu sucursala = new Sucursala("sucursala");
        Sediu agentie1 = new Agentie("agentie1");
        Sediu agentie2 = new Agentie("agentie2");

        Sediu filiala1 = new Filiala("filiala1");
        Sediu filiala2 = new Filiala("filiala2");
        Sediu filiala3 = new Filiala("filiala3");
        Sediu filiala4 = new Filiala("filiala4");

        sucursala.adaugaSediu(agentie1);
        sucursala.adaugaSediu(agentie2);
        agentie1.adaugaSediu(filiala1);
        agentie1.adaugaSediu(filiala1);
        agentie1.adaugaSediu(filiala2);
        agentie2.adaugaSediu(filiala3);
        agentie1.adaugaSediu(filiala4);
        sucursala.afiseaza();
    }
}
