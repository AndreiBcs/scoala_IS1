package Domain;

import java.util.List;

public class Clasa {

    private int capacitate;
    private NumarClasa numarClasa;
    private char litera;
    private List<Elev> elevi;

    public Clasa(int capacitate, NumarClasa numarClasa, char litera, List<Elev> elevi) {
        this.capacitate = capacitate;
        this.numarClasa = numarClasa;
        this.litera = litera;
        this.elevi = elevi;
    }

    public int getCapacitate() {
        return capacitate;
    }

    public void setCapacitate(int capacitate) {
        this.capacitate = capacitate;
    }

    public NumarClasa getNumarClasa() {
        return numarClasa;
    }

    public void setNumarClasa(NumarClasa numarClasa) {
        this.numarClasa = numarClasa;
    }

    public char getLitera() {
        return litera;
    }

    public void setLitera(char litera) {
        this.litera = litera;
    }

    public List<Elev> getElevi() {
        return elevi;
    }

    public void setElevi(List<Elev> elevi) {
        this.elevi = elevi;
    }

    public void adaugaElev(Elev elev){
        this.elevi.add(elev);
    }

    public void eliminaElev(Elev elev){
        this.elevi.removeIf(e -> e.equals(elev));
    }

    public int getTotalElevi(){
        return this.elevi.size();
    }

    // am adaugat asta ca sa am o relatie reala intre clasa si identificator,
    // nu doar un string scris manual
    public String getIdentificator(){
        return this.numarClasa.toString() + this.litera;
    }
}
