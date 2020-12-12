package pratique1;
import java.util.Random;

public class Personnage {
    public void setNom(String nom_){
        this.nom = nom_;
    }
    
    public String boirePotion(){
        if (this.potion < 1){
            System.out.println("Vous n'avez plus de potion.");
        } else {
            this.potion --;
        } return ("Il vous reste " + this.potion + "potion(s)");
        
    }

    public Personnage(String nom) {
        this.nom = nom;
        this.pointsDeVie = 20;
        this.santeMax = 20;
        this.potion = 1;
        this.mort = false;
        
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public int getPotion() {
        return potion;
    }

    public void setMort(boolean mort) {
        this.mort = mort;
    }

    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    public void setPotion(int potion) {
        this.potion = potion;
    }
    
    
    
    public void attaque(Personnage cible_){
        int vieCible = cible_.getPointsDeVie();
        
        
    }
  
    
    
    
    public int prendreDommage(int dommage_){
        this.pointsDeVie -= dommage_; 
        if(pointsDeVie < 1){
            pointsDeVie = 0;
            System.out.println(this.nom + " est mort.");
            this.mort = true;
            
        } else {
            System.out.println(this.nom + "a encore " + pointsDeVie + "points de vie.");
        } return pointsDeVie;
    } 
    
    private String nom;
    private boolean mort;
    private int pointsDeVie;
    private int santeMax; 
    private int potion;
}
