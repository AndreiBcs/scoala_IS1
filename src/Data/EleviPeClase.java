package Data;

import Domain.Elev;
import Domain.Gen;

import java.util.ArrayList;
import java.util.List;

public final class EleviPeClase {

    public static final List<Elev> eleviClasa_1A = new ArrayList<>();
    public static final List<Elev> eleviClasa_1B = new ArrayList<>();
    public static final List<Elev> eleviClasa_1C = new ArrayList<>();

    public static final List<Elev> eleviClasa_2A = new ArrayList<>();
    public static final List<Elev> eleviClasa_2B = new ArrayList<>();

    public static final List<Elev> eleviClasa_3A = new ArrayList<>();
    public static final List<Elev> eleviClasa_3B = new ArrayList<>();
    public static final List<Elev> eleviClasa_3C = new ArrayList<>();

    public static final List<Elev> eleviClasa_4A = new ArrayList<>();
    public static final List<Elev> eleviClasa_4B = new ArrayList<>();

    static {
        // 1A
        eleviClasa_1A.add(new Elev("Popescu Andrei", Gen.Masculin));
        eleviClasa_1A.add(new Elev("Ionescu Maria", Gen.Feminin));
        eleviClasa_1A.add(new Elev("Dumitru Elena", Gen.Feminin));
        eleviClasa_1A.add(new Elev("Stoica Matei", Gen.Masculin));
        eleviClasa_1A.add(new Elev("Radu Alex", Gen.Nespecificat));

        // 1B
        eleviClasa_1B.add(new Elev("Gheorghe David", Gen.Masculin));
        eleviClasa_1B.add(new Elev("Marin Andreea", Gen.Feminin));
        eleviClasa_1B.add(new Elev("Vasile Ionut", Gen.Masculin));
        eleviClasa_1B.add(new Elev("Stan Alexandra", Gen.Feminin));
        eleviClasa_1B.add(new Elev("Nistor Sasha", Gen.Nespecificat));

        // 1C
        eleviClasa_1C.add(new Elev("Dinu Stefan", Gen.Masculin));
        eleviClasa_1C.add(new Elev("Dobre Ioana", Gen.Feminin));
        eleviClasa_1C.add(new Elev("Sandu Gabriel", Gen.Masculin));
        eleviClasa_1C.add(new Elev("Stefan Bianca", Gen.Feminin));

        // 2A
        eleviClasa_2A.add(new Elev("Mihai Alexandru", Gen.Masculin));
        eleviClasa_2A.add(new Elev("Nistor Rebeca", Gen.Feminin));
        eleviClasa_2A.add(new Elev("Gabor Robert", Gen.Masculin));
        eleviClasa_2A.add(new Elev("Lupu Denisa", Gen.Feminin));

        // 2B
        eleviClasa_2B.add(new Elev("Oprea Vlad", Gen.Masculin));
        eleviClasa_2B.add(new Elev("Florea Daria", Gen.Feminin));
        eleviClasa_2B.add(new Elev("Voicu Cristian", Gen.Masculin));
        eleviClasa_2B.add(new Elev("Ene Georgiana", Gen.Feminin));

        // 3A
        eleviClasa_3A.add(new Elev("Barbu Luca", Gen.Masculin));
        eleviClasa_3A.add(new Elev("Toma Ana", Gen.Feminin));
        eleviClasa_3A.add(new Elev("Costache Darius", Gen.Masculin));
        eleviClasa_3A.add(new Elev("David Teodora", Gen.Feminin));
        eleviClasa_3A.add(new Elev("Pavel Chris", Gen.Nespecificat));

        // 3B
        eleviClasa_3B.add(new Elev("Mazarache Tudor", Gen.Masculin));
        eleviClasa_3B.add(new Elev("Preda Mihaela", Gen.Feminin));
        eleviClasa_3B.add(new Elev("Nita Sebastian", Gen.Masculin));
        eleviClasa_3B.add(new Elev("Moise Cristina", Gen.Feminin));

        // 3C
        eleviClasa_3C.add(new Elev("Grosu Mihai", Gen.Masculin));
        eleviClasa_3C.add(new Elev("Marcu Valentina", Gen.Feminin));
        eleviClasa_3C.add(new Elev("Duca Rares", Gen.Masculin));
        eleviClasa_3C.add(new Elev("Cojocaru Delia", Gen.Feminin));

        // 4A
        eleviClasa_4A.add(new Elev("Rus Eduard", Gen.Masculin));
        eleviClasa_4A.add(new Elev("Nane Laura", Gen.Feminin));
        eleviClasa_4A.add(new Elev("Miron George", Gen.Masculin));
        eleviClasa_4A.add(new Elev("Chiriac Amalia", Gen.Feminin));

        // 4B
        eleviClasa_4B.add(new Elev("Pana Bogdan", Gen.Masculin));
        eleviClasa_4B.add(new Elev("Sava Madalina", Gen.Feminin));
        eleviClasa_4B.add(new Elev("Suciu Alin", Gen.Masculin));
        eleviClasa_4B.add(new Elev("Moga Diana", Gen.Feminin));
    }

    private EleviPeClase() {}
}
