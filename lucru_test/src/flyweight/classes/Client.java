package flyweight.classes;

public class Client implements Flyweight {
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public void afisareInformatii(Cont cont) {
        System.out.println(nume+" --- "+cont.toString());
    }
}
