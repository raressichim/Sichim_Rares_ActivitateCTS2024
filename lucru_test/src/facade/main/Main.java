package facade.main;

import facade.classes.Autobuz;
import facade.classes.FacadeAutobuz;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz();
        FacadeAutobuz facadeAutobuz = new FacadeAutobuz(autobuz);
        facadeAutobuz.deschideToateUsile();
        facadeAutobuz.punePeLiberToateUsile();
    }
}
