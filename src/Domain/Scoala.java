package Domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Scoala {

    private final Map<String, Clasa> clase;
    private final Map<Profesor, Activitate> activitati;

    private Scoala() {
        clase = new HashMap<>();
        activitati = new HashMap<>();
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

    public void adaugaActivitate(Activitate activitate) {
        this.activitati.put(activitate.getProfesorCoordonator(), activitate);
    }

    public void eliminaActivitate(Activitate activitate) {
        this.activitati.remove(activitate.getProfesorCoordonator());
    }

    public void schimbaProfesorulCoordonator(Profesor noulProf, Activitate activitate) {
        this.activitati.remove(activitate.getProfesorCoordonator());

        activitate.setProfesorCoordonator(noulProf);

        this.activitati.put(noulProf, activitate);
    }

    public Activitate getActivitateDupaProfesor(Profesor profesor) {
        return this.activitati.get(profesor);
    }

    public int getNumarActivitati() {
        return this.activitati.size();
    }

    public List<Activitate> getTopulActivitatilor() {
        return this.activitati.values().stream()
                .sorted((act1, act2) ->
                        Integer.compare(act2.getNumarParticipanti(), act1.getNumarParticipanti()))
                .toList();
    }

    public int getNumarEleviUniciActivitati() {
        return (int) this.activitati.values().stream()
                .flatMap(activitate -> activitate.getParticipanti().stream())
                .distinct()
                .count();
    }
}
