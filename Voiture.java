public class Voiture {
    //Attributs
    
    private String marque;
    private String color;
    private String carburant;
    private String anneeDeFabrication;
    private int reservoir;
    private Moteur moteur;
// méthodes
public Voiture(String color, String marque, String carburant, String anneeDeFabrication, int reservoir, float cylindre, int nbcyl) {
    this.color = color;
    this.marque = marque;
    this.carburant = carburant;
    this.anneeDeFabrication = anneeDeFabrication;
    this.reservoir = reservoir;
    this.moteur= new Moteur(cylindre,nbcyl);
    }
    public Voiture(){
    }
    public Voiture setColor(String color){
        this.color = color ;
        return this;
    }
    public Voiture setMarque(String marque){
        this.marque = marque ;
        return this;
    }
    public Voiture setCarburant(String carburant){
        this.carburant = carburant ;
        return this;
    }
    public Voiture setAn(String anneeDeFabrication){
        this.anneeDeFabrication = anneeDeFabrication ;
        return this;
    }
    public Voiture setReservoir(int reservoir){
        this.reservoir = reservoir ;
        return this;
    }
    public String getColor(){
        return this.color;
    }
    public String getMarque(){
        return this.marque;
    }
    public String getCarburant(){
        return this.carburant;
    }
    public String getAn(){
        return this.anneeDeFabrication;
    }
    public int getReservoir(){
        return this.reservoir;
    }
    public void presentation(){
        if (reservoir > 0){
        System.out.printf("Voiture de marque %s, de couleur %s, qui roule à/au %s. La voiture démarre \n", this.marque, this.color, this.carburant);
        System.out.printf("cylindrée: %.2f - nb cylindres: %d", this.moteur.getCylindre(),this.moteur.getNbCyl());
    } else{
        System.out.printf("Voiture de marque %s, de couleur %s, qui roule à/au %s. La voiture ne démarre pas \n", this.marque, this.color, this.carburant);
        System.out.printf("cylindrée: %.2f - nb cylindres: %d", this.moteur.getCylindre(),this.moteur.getNbCyl());
    }}
}
