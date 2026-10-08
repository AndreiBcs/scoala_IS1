import Domain.Scoala;

import static Data.Clase.*;

void main() {

    var Lazar = Scoala.createScoala();

    Lazar.adaugaClasa(clasa_1A.getIdentificator(), clasa_1A);
    Lazar.adaugaClasa(clasa_1B.getIdentificator(), clasa_1B);
    Lazar.adaugaClasa(clasa_1C.getIdentificator(), clasa_1C);
    Lazar.adaugaClasa(clasa_2A.getIdentificator(), clasa_2A);
    Lazar.adaugaClasa(clasa_2B.getIdentificator(), clasa_2B);
    Lazar.adaugaClasa(clasa_3A.getIdentificator(), clasa_3A);
    Lazar.adaugaClasa(clasa_3B.getIdentificator(), clasa_3B);
    Lazar.adaugaClasa(clasa_3C.getIdentificator(), clasa_3C);
    Lazar.adaugaClasa(clasa_4A.getIdentificator(), clasa_4A);
    Lazar.adaugaClasa(clasa_4B.getIdentificator(), clasa_4B);

    System.out.println("Numar clase: " + Lazar.getNumarClase());
    System.out.println("Numar total elevi: " + Lazar.getTotalElevi());
}
