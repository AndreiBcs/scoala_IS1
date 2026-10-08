package Domain;

import org.junit.jupiter.api.Test;

import java.util.List;

import static Data.Activitati.*;
import static Data.Activitati.pictura;
import static Data.Clase.clasa_1A;
import static Data.Clase.clasa_2A;
import static Data.Profesori.ionescuElena;
import static Data.Profesori.popescuIon;
import static org.junit.jupiter.api.Assertions.*;

class ScoalaTest {

    @Test
    void adaugaClasa() {
        var scoala = Scoala.createScoala();

        scoala.adaugaClasa(clasa_1A.getIdentificator(), clasa_1A);

        assertEquals(1, scoala.getNumarClase());
    }

    @Test
    void eliminaClasa() {
        var scoala = Scoala.createScoala();

        scoala.adaugaClasa(clasa_1A.getIdentificator(), clasa_1A);
        scoala.eliminaClasa(clasa_1A.getIdentificator());

        assertEquals(0, scoala.getNumarClase());
    }

    @Test
    void eliminaClasaInexistenta() {
        var scoala = Scoala.createScoala();

        scoala.adaugaClasa(clasa_1A.getIdentificator(), clasa_1A);
        scoala.eliminaClasa("lalala");

        assertEquals(1, scoala.getNumarClase());
    }

    @Test
    void adaugaElevInClasa() {
        var scoala = Scoala.createScoala();

        scoala.adaugaClasa(clasa_1A.getIdentificator(), clasa_1A);
        scoala.adaugaElevInClasa(clasa_1A.getIdentificator(), new Elev("Deak", Gen.Masculin));

        assertEquals(6, scoala.getTotalElevi());
    }

    @Test
    void eliminaElevDupaNume() {
        var scoala = Scoala.createScoala();

        scoala.adaugaClasa(clasa_1A.getIdentificator(), clasa_1A);
        scoala.eliminaElevDupaNume("Popescu Andrei");

        assertEquals(4, scoala.getTotalElevi());
    }

    @Test
    void eliminaElevDupaNumeInexistent() {
        var scoala = Scoala.createScoala();

        scoala.adaugaClasa(clasa_1A.getIdentificator(), clasa_1A);
        scoala.eliminaElevDupaNume("");

        assertEquals(5, scoala.getTotalElevi());
    }

    @Test
    void eliminaElevInexistentDupaNume() {
        var scoala = Scoala.createScoala();

        scoala.adaugaClasa(clasa_1A.getIdentificator(), clasa_1A);
        scoala.eliminaElevDupaNume("Deak");

        assertEquals(5, scoala.getTotalElevi());
    }

    @Test
    void getNumarClase() {
        var scoala = Scoala.createScoala();

        scoala.adaugaClasa(clasa_1A.getIdentificator(), clasa_1A);
        scoala.adaugaClasa(clasa_2A.getIdentificator(), clasa_2A);

        assertEquals(2, scoala.getNumarClase());
    }

    @Test
    void getTotalElevi() {
        var scoala = Scoala.createScoala();

        scoala.adaugaClasa(clasa_1A.getIdentificator(), clasa_1A);
        scoala.adaugaClasa(clasa_2A.getIdentificator(), clasa_2A);

        assertEquals(9, scoala.getTotalElevi());
    }

    @Test
    void adaugaActivitate() {
        var scoala = Scoala.createScoala();

        scoala.adaugaActivitate(fotbal);

        assertEquals(1, scoala.getNumarActivitati());
    }

    @Test
    void eliminaActivitate() {
        var scoala = Scoala.createScoala();

        scoala.adaugaActivitate(fotbal);
        scoala.eliminaActivitate(fotbal);

        assertEquals(0, scoala.getNumarActivitati());
    }

    @Test
    void schimbaProfesorulCoordonator() {
        var scoala = Scoala.createScoala();

        scoala.adaugaActivitate(fotbal);
        scoala.schimbaProfesorulCoordonator(ionescuElena, fotbal);

        assertEquals(fotbal, scoala.getActivitateDupaProfesor(ionescuElena));
    }

    @Test
    void getActivitateDupaProfesor() {
        var scoala = Scoala.createScoala();

        scoala.adaugaActivitate(fotbal);

        assertEquals(fotbal, scoala.getActivitateDupaProfesor(popescuIon));
    }

    @Test
    void getTopulActivitatilor() {
        var scoala = Scoala.createScoala();

        scoala.adaugaActivitate(fotbal);
        scoala.adaugaActivitate(teatru);
        scoala.adaugaActivitate(sah);
        scoala.adaugaActivitate(pictura);

        List<Activitate> top = List.of(fotbal, teatru, sah, pictura);

        assertEquals(top, scoala.getTopulActivitatilor());
    }

    @Test
    void getNumarEleviUniciActivitati() {
        var scoala = Scoala.createScoala();

        scoala.adaugaActivitate(fotbal);

        assertEquals(5, scoala.getNumarEleviUniciActivitati());
    }
}