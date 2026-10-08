package Domain;

import org.junit.jupiter.api.Test;

import static Data.Clase.clasa_1A;
import static org.junit.jupiter.api.Assertions.*;

class ClasaTest {

    @Test
    void adaugaElev() {
        var nrEleviInitial = clasa_1A.getTotalElevi();

        clasa_1A.adaugaElev(new Elev("Deak", Gen.Masculin));

        assertEquals(nrEleviInitial + 1, clasa_1A.getTotalElevi());
    }

    @Test
    void eliminaElev() {
        var nrEleviInitial = clasa_1A.getTotalElevi();

        clasa_1A.eliminaElev(new Elev("Radu Alex", Gen.Nespecificat));

        assertEquals(nrEleviInitial - 1, clasa_1A.getTotalElevi());
    }

    @Test
    void eliminaElevInexistent() {
        var nrEleviInitial = clasa_1A.getTotalElevi();

        clasa_1A.eliminaElev(new Elev("Deak", Gen.Nespecificat));

        assertEquals(nrEleviInitial, clasa_1A.getTotalElevi());
    }

    @Test
    void getTotalElevi() {
        assertEquals(5, clasa_1A.getTotalElevi());
    }

    @Test
    void getIdentificator() {
        assertEquals("1A", clasa_1A.getIdentificator());
    }
}