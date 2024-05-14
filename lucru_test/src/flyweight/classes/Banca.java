package flyweight.classes;

import java.util.HashMap;
import java.util.Map;

public class Banca {
    private String nume;
    private Map<String,Flyweight> conturi;

    public Banca(String nume) {
        this.nume = nume;
        conturi = new HashMap<>();
    }
    public void adaugaElement(String nume,Flyweight client){
        conturi.put(nume,client);
    }

    public Flyweight getElement(String nume){
        return conturi.get(nume);
    }
}
