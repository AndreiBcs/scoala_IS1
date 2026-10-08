package Data;

import Domain.Elev;
import Domain.Gen;

import java.util.List;

public final class Elevi {

    // clasa 1A
    public static final Elev popescuAndrei = new Elev("Popescu Andrei", Gen.Masculin);
    public static final Elev ionescuMaria = new Elev("Ionescu Maria", Gen.Feminin);
    public static final Elev dumitruElena = new Elev("Dumitru Elena", Gen.Feminin);
    public static final Elev stoicaMatei = new Elev("Stoica Matei", Gen.Masculin);
    public static final Elev raduAlex = new Elev("Radu Alex", Gen.Nespecificat);

    // clasa 1B
    public static final Elev gheorgheDavid = new Elev("Gheorghe David", Gen.Masculin);
    public static final Elev marinAndreea = new Elev("Marin Andreea", Gen.Feminin);
    public static final Elev vasileIonut = new Elev("Vasile Ionut", Gen.Masculin);
    public static final Elev stanAlexandra = new Elev("Stan Alexandra", Gen.Feminin);
    public static final Elev nistorSasha = new Elev("Nistor Sasha", Gen.Nespecificat);

    // clasa 1C
    public static final Elev dinuStefan = new Elev("Dinu Stefan", Gen.Masculin);
    public static final Elev dobreIoana = new Elev("Dobre Ioana", Gen.Feminin);
    public static final Elev sanduGabriel = new Elev("Sandu Gabriel", Gen.Masculin);
    public static final Elev stefanBianca = new Elev("Stefan Bianca", Gen.Feminin);

    // clasa 2A
    public static final Elev mihaiAlexandru = new Elev("Mihai Alexandru", Gen.Masculin);
    public static final Elev nistorRebeca = new Elev("Nistor Rebeca", Gen.Feminin);
    public static final Elev gaborRobert = new Elev("Gabor Robert", Gen.Masculin);
    public static final Elev lupuDenisa = new Elev("Lupu Denisa", Gen.Feminin);

    // clasa 2B
    public static final Elev opreaVlad = new Elev("Oprea Vlad", Gen.Masculin);
    public static final Elev floreaDaria = new Elev("Florea Daria", Gen.Feminin);
    public static final Elev voicuCristian = new Elev("Voicu Cristian", Gen.Masculin);
    public static final Elev eneGeorgiana = new Elev("Ene Georgiana", Gen.Feminin);

    // clasa 3A
    public static final Elev barbuLuca = new Elev("Barbu Luca", Gen.Masculin);
    public static final Elev tomaAna = new Elev("Toma Ana", Gen.Feminin);
    public static final Elev costacheDarius = new Elev("Costache Darius", Gen.Masculin);
    public static final Elev davidTeodora = new Elev("David Teodora", Gen.Feminin);
    public static final Elev pavelChris = new Elev("Pavel Chris", Gen.Nespecificat);

    // clasa 3B
    public static final Elev mazaracheTudor = new Elev("Mazarache Tudor", Gen.Masculin);
    public static final Elev predaMihaela = new Elev("Preda Mihaela", Gen.Feminin);
    public static final Elev nitaSebastian = new Elev("Nita Sebastian", Gen.Masculin);
    public static final Elev moiseCristina = new Elev("Moise Cristina", Gen.Feminin);

    // clasa 3C
    public static final Elev grosuMihai = new Elev("Grosu Mihai", Gen.Masculin);
    public static final Elev marcuValentina = new Elev("Marcu Valentina", Gen.Feminin);
    public static final Elev ducaRares = new Elev("Duca Rares", Gen.Masculin);
    public static final Elev cojocaruDelia = new Elev("Cojocaru Delia", Gen.Feminin);

    // clasa 4A
    public static final Elev rusEduard = new Elev("Rus Eduard", Gen.Masculin);
    public static final Elev naneLaura = new Elev("Nane Laura", Gen.Feminin);
    public static final Elev mironGeorge = new Elev("Miron George", Gen.Masculin);
    public static final Elev chiriacAmalia = new Elev("Chiriac Amalia", Gen.Feminin);

    // clasa 4B
    public static final Elev panaBogdan = new Elev("Pana Bogdan", Gen.Masculin);
    public static final Elev savaMadalina = new Elev("Sava Madalina", Gen.Feminin);
    public static final Elev suciuAlin = new Elev("Suciu Alin", Gen.Masculin);
    public static final Elev mogaDiana = new Elev("Moga Diana", Gen.Feminin);

    public static final List<Elev> totiElevii = List.of(
            popescuAndrei, ionescuMaria, dumitruElena, stoicaMatei, raduAlex,
            gheorgheDavid, marinAndreea, vasileIonut, stanAlexandra, nistorSasha,
            dinuStefan, dobreIoana, sanduGabriel, stefanBianca,
            mihaiAlexandru, nistorRebeca, gaborRobert, lupuDenisa,
            opreaVlad, floreaDaria, voicuCristian, eneGeorgiana,
            barbuLuca, tomaAna, costacheDarius, davidTeodora, pavelChris,
            mazaracheTudor, predaMihaela, nitaSebastian, moiseCristina,
            grosuMihai, marcuValentina, ducaRares, cojocaruDelia,
            rusEduard, naneLaura, mironGeorge, chiriacAmalia,
            panaBogdan, savaMadalina, suciuAlin, mogaDiana
    );

    private Elevi() {}
}
