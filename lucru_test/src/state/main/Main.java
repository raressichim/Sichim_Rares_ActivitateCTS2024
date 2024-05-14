package state.main;


import state.classes.Reteta;

public class Main {
    public static void main(String[] args) {
        Reteta reteta = new Reteta(12);
        reteta.solicitaReteta();
        reteta.cumparaReteta();
        reteta.solicitaReteta();
    }
}
