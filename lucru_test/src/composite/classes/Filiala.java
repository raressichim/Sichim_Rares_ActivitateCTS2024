package composite.classes;

import java.util.ArrayList;
import java.util.List;

public class Filiala implements Sediu {
    private String nume;
    private List<Sediu> sedii;

    public Filiala(String nume) {
        this.nume = nume;
        sedii = new ArrayList<>();
    }

    @Override
    public void afiseaza() {
        System.out.println(nume);
        for (Sediu s : sedii) {
            s.afiseaza();
        }
    }

    @Override
    public void adaugaSediu(Sediu sediu) {
        sedii.add(sediu);
    }
}
