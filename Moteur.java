public class Moteur{
    private float cylindre;
    private int nbCyl;

    public Moteur(float cyl,int nbc){
        this.cylindre = cyl;
        this.nbCyl = nbc;
    }
    public float getCylindre(){
        return this.cylindre;
    }
    public int getNbCyl(){
        return this.nbCyl;
    }
}