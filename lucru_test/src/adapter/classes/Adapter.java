package adapter.classes;

public class Adapter extends CardStb {
    private CardMetrorex cardMetrorex;
    public Adapter(CardMetrorex cardMetrorex){
        super(cardMetrorex.getNume(),0);
        this.cardMetrorex = cardMetrorex;
    }

    @Override
    public void valideazaAcces() {
        if(cardMetrorex.accesMetrou()){
            System.out.println("ai acces");
        } else{
            System.out.println("n ai acces");
        }
    }
}
