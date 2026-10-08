package Domain;

import java.util.Objects;

public class Elev {

    private String nume;
    private Gen gen;

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
}
