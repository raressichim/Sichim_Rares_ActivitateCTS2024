package composite.main;

import composite.clase.Agentie;
import composite.clase.Filiala;
import composite.clase.Sediu;
import composite.clase.Sucursala;

public class Main {
    public static void main(String[] args) {
        Sediu sediu = new Agentie("Banca",10);

        Sediu sucursalaLei = new Sucursala("BRD",9);
        Sediu agentie1 = new Agentie("brd-sector1",23);
        Sediu agentie2 = new Agentie("brd-sector2",14);

        Sediu filiala1=new Filiala("brd-romania",4);
        Sediu filiala2 = new Filiala("brd-victoriei",11);
        Sediu filiala3 = new Filiala("brd-obor",7);
        Sediu filiala4 = new Filiala("brd-muncii",8);
        Sediu filiala5 = new Filiala("brd-univ",8);

        agentie1.adaugaSediu(filiala1);
        agentie1.adaugaSediu(filiala2);

        agentie2.adaugaSediu(filiala3);
        agentie2.adaugaSediu(filiala4);

        sediu.adaugaSediu(filiala5);

        sediu.adaugaSediu(sucursalaLei);
        sediu.adaugaSediu(agentie1);
        sediu.adaugaSediu(agentie2);

        sediu.afiseaza("  ");

    }
}
