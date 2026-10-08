package Data;

import Domain.Profesor;
import Domain.Gen;
import java.util.List;

public final class Profesori {

    public static final Profesor popescuIon = new Profesor("Popescu Ion", Gen.Masculin);
    public static final Profesor ionescuElena = new Profesor("Ionescu Elena", Gen.Feminin);
    public static final Profesor dumitruVasile = new Profesor("Dumitru Vasile", Gen.Masculin);
    public static final Profesor marinAnca = new Profesor("Marin Anca", Gen.Feminin);
    public static final Profesor stancuMihai = new Profesor("Stancu Mihai", Gen.Masculin);
    public static final Profesor raduCarmen = new Profesor("Radu Carmen", Gen.Feminin);

    public static final List<Profesor> totiProfesarii = List.of(
            popescuIon,
            ionescuElena,
            dumitruVasile,
            marinAnca,
            stancuMihai,
            raduCarmen
    );

    private Profesori() {}
}
