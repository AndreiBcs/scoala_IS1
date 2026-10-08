package Domain;

import java.util.HashSet;
import java.util.Set;

public class Activitate {

    private String nume;
    private Profesor profesorCoordonator;
    private final Set<Elev> participanti = new HashSet<>();

    public Activitate(String nume, Profesor profesorCoordonator) {
        this.nume = nume;
        this.profesorCoordonator = profesorCoordonator;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Set<Elev> getParticipanti() {
        return participanti;
    }

    public void inscrieElev(Elev elev) {
        this.participanti.add(elev);
    }

    public void eliminaElev(Elev elev) {
        this.participanti.remove(elev);
    }

    public int getNumarParticipanti() {
        return participanti.size();
    }

    public Profesor getProfesorCoordonator() {
        return profesorCoordonator;
    }

    public void setProfesorCoordonator(Profesor profesorCoordonator) {
        this.profesorCoordonator = profesorCoordonator;
    }

    @Override
    public String toString() {
        return nume;
    }
}
