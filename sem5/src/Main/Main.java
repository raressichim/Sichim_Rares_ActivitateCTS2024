package Main;

import Builder.Rezervare;
import Builder.RezervareBuilder;
import Builder_v2.AbstractBuilder;
import Prototype.AbstractPrototype;
import Prototype.Client;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        RezervareBuilder builder = new RezervareBuilder();
        Rezervare rezervare = builder.adaugaMancare().adaugaBautura().build();
        System.out.println(rezervare);

        Rezervare rezervare1 = builder.adaugaMuzica().build();
        System.out.println(rezervare1);

        AbstractBuilder abstractBuilder = new Builder_v2.Rezervare.RezervareBuilder();
        Builder_v2.Rezervare rezervare2 = abstractBuilder.adaugaMuzica().adaugaBautura().build();
        Builder_v2.Rezervare rezervare3 = abstractBuilder.adaugaMancare().adaugaScaunErgonomic().build();
        System.out.println(rezervare2);
        System.out.println(rezervare3);

        //prototype
        List<String> accesorii = new ArrayList<>();
        accesorii.add("a");
        accesorii.add("b");
        Client client1 = new Client("rares", 20, accesorii);
        AbstractPrototype client2 = client1.clone();
        ((Client) client2).setVarsta(25);
        System.out.println(client1);
        System.out.println(client2);
    }
}