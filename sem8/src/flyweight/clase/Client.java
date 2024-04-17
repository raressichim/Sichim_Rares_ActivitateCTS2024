package flyweight.clase;

public class Client implements Flyweight{
    private String nume;
    private String adresa;
    private String nrTelefon;

    public Client(String nume, String adresa, String nrTelefon) {
        this.nume = nume;
        this.adresa = adresa;
        this.nrTelefon = nrTelefon;
    }

    public String getNume() {
        return nume;
    }

    public String getAdresa() {
        return adresa;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    @Override
    public void afisareInformatii(Cont cont) {
        System.out.println("Clientul "+nume+" are adresa: "+adresa+" si contul: "+cont.toString());
    }
}
