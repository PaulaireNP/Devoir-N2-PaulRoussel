package Entities.Exo1;

public class Cuve extends Captage
{
    protected int largeur;
    protected int longueur;

    public Cuve(int idCaptage, String nom, int hauteur, int debitmax, int largeur, int longueur) {
        super(idCaptage, nom, hauteur, debitmax);
        this.largeur = largeur;
        this.longueur = longueur;
    }

    @Override
    public double GetVolume()
    {
        return Math.PI * longueur * largeur;
    }

    @Override
    public String GetDescription()
    {
        return super.GetDescription() + " - longueur " + longueur + " - largeur " + largeur;
    }
}
