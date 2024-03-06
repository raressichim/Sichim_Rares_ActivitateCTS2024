package guverneleLumii.main;

import guverneleLumii.model.Guvern;
import guverneleLumii.model.GuvernRegistry;

public class Main {
    public static void main(String[] args) {
        GuvernRegistry guvernRegistry = GuvernRegistry.getInstance();
        guvernRegistry.adaugaGuvern("Romania", "Ionut", 4);
        guvernRegistry.adaugaGuvern("Romania", "Marius", 5);
        guvernRegistry.adaugaGuvern("Ungaria", "Victor", 5);

        System.out.println(guvernRegistry.getGuvern("Romania"));
        System.out.println(guvernRegistry.getGuvern("Ungaria"));

    }
}
