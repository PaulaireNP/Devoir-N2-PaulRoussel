package Entities.Exo1;

public class Forage extends Captage implements IVolume
{
    protected int diametre;

    public Forage(int idCaptage, String nom, int hauteur, int debitmax, int diametre) {
        super(idCaptage, nom, hauteur, debitmax);
        this.diametre = diametre;
    }

    @Override
    public double GetVolume()
    {
        return Math.PI * diametre * hauteur;
    }

    @Override
    public String GetDescription()
    {
        return super.GetDescription() + " - diamètre " + diametre ;
    }
}
