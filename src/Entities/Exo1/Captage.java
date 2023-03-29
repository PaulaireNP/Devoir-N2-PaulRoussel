package Entities.Exo1;

public class Captage implements Comparable<Captage>
{
    private int idCaptage;
    protected String Nom;
    protected int hauteur;
    protected int debitMax;

    public Captage(int idCaptage, String nom, int hauteur, int debitMax) {
        this.idCaptage = idCaptage;
        Nom = nom;
        this.hauteur = hauteur;
        this.debitMax = debitMax;
    }

    public int getIdCaptage() {
        return idCaptage;
    }

    @Override
    public int compareTo(Captage o) {
        return Integer.compare(this.debitMax,o.debitMax);
    }




    public String GetDescription()
    {
        return Nom + " - " + hauteur + " mètres - " + debitMax + " litres";
    }
}
