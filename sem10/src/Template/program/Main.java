package Template.program;


import Template.clase.AchizitieMedicamente;
import Template.clase.AchizitiePeBazaDeReteta;
import Template.clase.Reteta;

public class Main {
    public static void main(String[] args) {
        Reteta reteta = new Reteta(1);
        reteta.adaugaMedicament("Paracetamol");
        reteta.adaugaMedicament("Nurofen");

        AchizitieMedicamente achizitieReteta = new AchizitiePeBazaDeReteta(reteta);
        achizitieReteta.achizitioneazaMedicamente();
    }
}