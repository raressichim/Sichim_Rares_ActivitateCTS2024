package observer_dp.main;

import observer_dp.observer.Client;
import observer_dp.observer.Observer;
import observer_dp.subject.Subject;
import observer_dp.subject.Tramvai;

public class Main {
    public static void main(String[] args) {
        Subject tramvai = new Tramvai(14);
        Observer client1 = new Client("rares");
        Observer client2 = new Client("raresica");
        tramvai.adaugaObs(client1);
        tramvai.adaugaObs(client2);
        tramvai.anunta();
    }
}
