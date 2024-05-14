package proxy.main;


import proxy.classes.Autobuz;
import proxy.classes.AutobuzAbstract;
import proxy.classes.AutobuzDeNoapte;

public class Main {
    public static void main(String[] args) {
        AutobuzAbstract autobuz = new Autobuz(1,0);
        AutobuzAbstract autobuzAbstract = new AutobuzDeNoapte(autobuz);
        autobuzAbstract.pleacaDinStatie();
    }
}
