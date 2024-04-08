package ex_4.main;

import ex_4.metrou.BiletMetrou;
import ex_4.metrou.Calatorie;
import ex_4.suprateran.AdapterCalatorie;
import ex_4.suprateran.CardSTB;

public class Main {
    public static void validareIntrareMetrou(Calatorie calatorie){
        if(calatorie.estePermisAccesul()){
            System.out.println("Calatorie placuta!");
        }else{
            System.out.println("Sold calatorii insuficient.");
        }
    }
    public static void validareUrcareSTB(CardSTB card){
        card.validareCalatorie();
    }
    public static void main(String[] args) {
        Calatorie biletMetrou=new BiletMetrou("Manole",2);
        validareIntrareMetrou(biletMetrou);

        CardSTB biletMixt=new AdapterCalatorie(biletMetrou);
        validareUrcareSTB(biletMixt);
        validareIntrareMetrou(biletMetrou);
    }
}
