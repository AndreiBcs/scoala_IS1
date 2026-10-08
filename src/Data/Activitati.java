package Data;

import Domain.Activitate;
import java.util.List;

import static Data.Profesori.*;
import static Data.Elevi.*;

public final class Activitati {

    public static final Activitate fotbal = new Activitate("Fotbal", popescuIon);
    public static final Activitate teatru = new Activitate("Teatru", raduCarmen);
    public static final Activitate sah = new Activitate("Sah", stancuMihai);
    public static final Activitate pictura = new Activitate("Pictura", marinAnca);

    public static final List<Activitate> toateActivitatile = List.of(
            fotbal,
            teatru,
            sah,
            pictura
    );

    static {
        fotbal.inscrieElev(popescuAndrei);
        fotbal.inscrieElev(stoicaMatei);
        fotbal.inscrieElev(gheorgheDavid);
        fotbal.inscrieElev(vasileIonut);
        fotbal.inscrieElev(mihaiAlexandru);

        teatru.inscrieElev(ionescuMaria);
        teatru.inscrieElev(dumitruElena);
        teatru.inscrieElev(marinAndreea);
        teatru.inscrieElev(stanAlexandra);
        teatru.inscrieElev(nistorRebeca);

        sah.inscrieElev(raduAlex);
        sah.inscrieElev(nistorSasha);
        sah.inscrieElev(gaborRobert);
        sah.inscrieElev(opreaVlad);

        pictura.inscrieElev(dobreIoana);
        pictura.inscrieElev(stefanBianca);
        pictura.inscrieElev(floreaDaria);
        pictura.inscrieElev(eneGeorgiana);
    }

    private Activitati() {}
}
