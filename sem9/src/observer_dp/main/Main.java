package observer_dp.main;

import observer_dp.observer.Autobuz;
import observer_dp.observer.Client;
import observer_dp.subiect.Subject;
import observer_dp.subiect.Tramvai;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Rares");
        Client client1 = new Client("Alex");
        Tramvai tramvai = new Tramvai(41);
        tramvai.abonareObserver(client);
        tramvai.abonareObserver(client1);
        tramvai.anuntaPlecare();
        tramvai.dezabonareObservers(client);
        Client client3 = new Client("Andrei");
        tramvai.abonareObserver(client3);
        tramvai.anuntaPlecare();

        Subject autobuz = new Autobuz();
        autobuz.abonareObserver(client);
        autobuz.anuntaPlecare();
        ((Autobuz)autobuz).anuntaDeviere();
    }
}
