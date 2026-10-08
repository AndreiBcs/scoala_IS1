package Domain;

import java.util.HashMap;
import java.util.Map;

public class Scoala {

    private final Map<String, Clasa> clase;

    private Scoala() {
        clase = new HashMap<>();
    }

    public static Scoala createScoala() {
        return new Scoala();
    }

    public void adaugaClasa(String identificator, Clasa clasa) {
        this.clase.put(identificator, clasa);
    }

    public void eliminaClasa(String identificator) {
        this.clase.remove(identificator);
    }

    public void adaugaElevInClasa(String identificator, Elev elev) {
        this.clase.get(identificator).adaugaElev(elev);
    }

    public void eliminaElevDupaNume(String nume) {
        this.clase.values().forEach(clasa ->
                clasa.getElevi().removeIf(elev ->
                        elev.getNume().equals(nume)));
    }

    public int getNumarClase() {
        return this.clase.size();
    }

    public int getTotalElevi(){
        return this.clase.values().stream()
                .mapToInt(Clasa::getTotalElevi)
                .sum();
    }
}
