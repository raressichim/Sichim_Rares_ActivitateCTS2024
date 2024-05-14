package observer_dp.subiect;


public class Autobuz extends Subject {
    @Override
    public void anuntaPlecare() {
        super.notificareObservers("Plecare de la capat");
    }

    public void anuntaDeviere(){
        super.notificareObservers("Autobuzul a deviat");
    }
}
