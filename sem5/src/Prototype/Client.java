package Prototype;

import java.util.ArrayList;
import java.util.List;

public class Client implements AbstractPrototype {
    private String nume;
    private int varsta;
    private List<String> listaAccesorii;

    public Client(String nume, int varsta, List<String> accesorii) {
        this.nume = nume;
        if (varsta < 14) {
            throw new RuntimeException("Varsta prea mica");
        }
        this.varsta = varsta;
        if (accesorii.size() >= 5) {
            throw new RuntimeException("Prea multe accesorii");
        }
        listaAccesorii = accesorii;
    }

    private Client() {
    }

    public void setVarsta(int varsta) {
        if (varsta < 14) {
            throw new RuntimeException("Varsta prea mica");
        }
        this.varsta = varsta;
    }

    @Override
    public AbstractPrototype clone() {
        Client newClient = new Client();
        newClient.nume = this.nume;
        newClient.varsta = this.varsta;
        newClient.listaAccesorii = new ArrayList<>();
        newClient.listaAccesorii.addAll(this.listaAccesorii);
        return newClient;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append(", listaAccesorii=").append(listaAccesorii);
        sb.append('}');
        return sb.toString();
    }
}
