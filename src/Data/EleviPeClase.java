package Data;

import Domain.Elev;

import java.util.ArrayList;
import java.util.List;

import static Data.Elevi.*;

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
        eleviClasa_1A.add(popescuAndrei);
        eleviClasa_1A.add(ionescuMaria);
        eleviClasa_1A.add(dumitruElena);
        eleviClasa_1A.add(stoicaMatei);
        eleviClasa_1A.add(raduAlex);

        // 1B
        eleviClasa_1B.add(gheorgheDavid);
        eleviClasa_1B.add(marinAndreea);
        eleviClasa_1B.add(vasileIonut);
        eleviClasa_1B.add(stanAlexandra);
        eleviClasa_1B.add(nistorSasha);

        // 1C
        eleviClasa_1C.add(dinuStefan);
        eleviClasa_1C.add(dobreIoana);
        eleviClasa_1C.add(sanduGabriel);
        eleviClasa_1C.add(stefanBianca);

        // 2A
        eleviClasa_2A.add(mihaiAlexandru);
        eleviClasa_2A.add(nistorRebeca);
        eleviClasa_2A.add(gaborRobert);
        eleviClasa_2A.add(lupuDenisa);

        // 2B
        eleviClasa_2B.add(opreaVlad);
        eleviClasa_2B.add(floreaDaria);
        eleviClasa_2B.add(voicuCristian);
        eleviClasa_2B.add(eneGeorgiana);

        // 3A
        eleviClasa_3A.add(barbuLuca);
        eleviClasa_3A.add(tomaAna);
        eleviClasa_3A.add(costacheDarius);
        eleviClasa_3A.add(davidTeodora);
        eleviClasa_3A.add(pavelChris);

        // 3B
        eleviClasa_3B.add(mazaracheTudor);
        eleviClasa_3B.add(predaMihaela);
        eleviClasa_3B.add(nitaSebastian);
        eleviClasa_3B.add(moiseCristina);

        // 3C
        eleviClasa_3C.add(grosuMihai);
        eleviClasa_3C.add(marcuValentina);
        eleviClasa_3C.add(ducaRares);
        eleviClasa_3C.add(cojocaruDelia);

        // 4A
        eleviClasa_4A.add(rusEduard);
        eleviClasa_4A.add(naneLaura);
        eleviClasa_4A.add(mironGeorge);
        eleviClasa_4A.add(chiriacAmalia);

        // 4B
        eleviClasa_4B.add(panaBogdan);
        eleviClasa_4B.add(savaMadalina);
        eleviClasa_4B.add(suciuAlin);
        eleviClasa_4B.add(mogaDiana);
    }

    private EleviPeClase() {}
}
