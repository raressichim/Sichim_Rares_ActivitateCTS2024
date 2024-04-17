package flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class Banca {
    private String nume;
    private double capital;
    private Map<String, Flyweight> clienti;

    public Banca(String nume, double capital) {
        this.nume = nume;
        this.capital = capital;
        clienti = new HashMap<>();
    }

    public Flyweight getClient(String nume,String adresa,String nrTelefon){
        if(!clienti.containsKey(nume)){
            clienti.put(nume,new Client(nume,adresa,nrTelefon));
        }
        return clienti.get(nume);
    }

    public Flyweight getClient(String nume){
        return clienti.get(nume);
    }

}
