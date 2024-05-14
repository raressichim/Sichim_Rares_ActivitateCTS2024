package adapter.main;


import adapter.classes.Adapter;
import adapter.classes.BiletMetrou;
import adapter.classes.CardMetrorex;
import adapter.classes.CardStb;

public class Main {
    public static void main(String[] args) {
        CardMetrorex biletMetrou = new BiletMetrou("rares",1);
        CardStb adapter = new Adapter(biletMetrou);
        adapter.valideazaAcces();
        adapter.valideazaAcces();
    }
}
