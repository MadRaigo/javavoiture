import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class TestVoiture {
    public static void main(String[] args) {
        Voiture v1= new Voiture();
        v1.setColor("rouge")
            .setMarque("Peugeot")
            .setCarburant("Sans Plomb")
            .setAn("2015")
            .setReservoir(0);
             
        // v1.presentation();

        Voiture v2= new Voiture("bleue","HONDA","Essence","2010",1,7,4);
        v2.presentation();

        
        // génériques avec l'opérateur diamant.
        // ArrayList<Voiture> listCars= new ArrayList<Voiture>();
        // listCars.add(v1);
        // listCars.add(v2);
        // System.out.println(listCars);
        // listCars.remove(0);
        // listCars.forEach((c)->{System.out.println(c.getMarque());});
        // Voiture v3 = listCars.get(0);
        // System.out.println(v3.getMarque());

        //Hashmap -> tableau associatif
        // HashMap<String,String> departements = new HashMap<String,String>();
        // departements.put("29","Finistère");
        // departements.put("22","Côtes d'armor");
        // departements.put("35","Ille et Vilaine");
        // departements.put("56","Morbihan");
        // System.out.println(departements.get("29"));

        // HashSet<String> aux = new HashSet<String>();
        // aux.add("TOTO");
        // aux.add("TITI");
        // aux.add("TOTO");
        // System.out.println(aux);
    }
}
