package guverneleLumii.model;

import java.util.HashMap;
import java.util.Map;

public class GuvernRegistry {
    private Map<String, Guvern> guverneleLumii;
    private static GuvernRegistry instance = null;

    private GuvernRegistry() {
        this.guverneleLumii = new HashMap<>();
    } //constructorul se pune ca sa fie privat

    public synchronized static GuvernRegistry getInstance() {
        if (instance == null) {
            instance = new GuvernRegistry();
        }
        return instance;
    }

    public void adaugaGuvern(String tara, String primMinistru, int nrGuvernatori) {
        if(!guverneleLumii.containsKey(tara)) {
            guverneleLumii.put(tara, new Guvern(tara, primMinistru, nrGuvernatori));
        }
    }

    public Guvern getGuvern(String tara){
        return this.guverneleLumii.get(tara);
    }

}
