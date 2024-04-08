package ex_5.main;

import ex_5.model.Autobuz;
import ex_5.model.FacadeAutobuz;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz=new Autobuz();
        System.out.println("FARA FACADE\n");
        autobuz.punePeLiberUsaDinSpate();
        autobuz.deschidereUsaDinSpate();
        FacadeAutobuz fAutobuz=new FacadeAutobuz(autobuz);
        System.out.println("\nCu FACADE\n");
        fAutobuz.punePeLiberToateUsile();
        fAutobuz.deschideToateUsile();
    }
}
