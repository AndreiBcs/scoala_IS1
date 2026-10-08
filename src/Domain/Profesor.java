package Domain;

import java.util.Objects;

public class Profesor {

    private String nume;
    private Gen gen;

    public Profesor(String nume, Gen gem) {
        this.nume = nume;
        this.gen = gem;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Gen getGen() {
        return gen;
    }

    public void setGen(Gen gen) {
        this.gen = gen;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Profesor &&
                this.nume.equals(((Profesor) obj).nume) &&
                this.gen.equals(((Profesor) obj).gen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume, gen);
    }

    @Override
    public String toString() {
        return "Prof. " + nume + " (" + gen + ")";
    }
}
