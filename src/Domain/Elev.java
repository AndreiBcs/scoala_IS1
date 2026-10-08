package Domain;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Elev {

    private String nume;
    private Gen gen;
    private final Set<Activitate> activitati = new HashSet<>();

    public Elev(String nume, Gen gen) {
        this.nume = nume;
        this.gen = gen;
    }

    public Gen getGen() {
        return gen;
    }

    public void setGen(Gen gen) {
        this.gen = gen;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume, gen);
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Elev &&
                this.nume.equals(((Elev) obj).nume) &&
                this.gen.equals(((Elev) obj).gen);
    }

    @Override
    public String toString() {
        return nume + " (" + gen + ")";
    }

    public Set<Activitate> getActivitati() {
        return activitati;
    }

    public void inscrieLaActivitate(Activitate activitate) {
        this.activitati.add(activitate);
    }

    public void renuntaLaActivitate(Activitate activitate) {
        this.activitati.remove(activitate);
    }

    public int getNumarActivitati() {
        return activitati.size();
    }
}
