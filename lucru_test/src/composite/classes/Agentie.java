package composite.classes;

import java.util.ArrayList;
import java.util.List;

public class Agentie implements Sediu {
    private String nume;
    private List<Sediu> sedii;

    public Agentie(String nume) {
        this.nume = nume;
        sedii = new ArrayList<>();
    }

    @Override
    public void afiseaza() {
        System.out.println(nume + " contine sediile: ");
        for (Sediu s : sedii) {
            s.afiseaza();
        }
    }

    @Override
    public void adaugaSediu(Sediu sediu) {
        sedii.add(sediu);
    }
}
