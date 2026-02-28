/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CC1;

/**
 *
 * @author zemar
 */
public class ComptePersonne extends Compte {
    private String nom;
    private String prenom;
    
    public ComptePersonne(){
        super();
        this.nom="";
        this.prenom="";
    }
    public ComptePersonne(double solde, String nom, String prenom){
        super( solde);
        this.nom=nom;
        this.prenom=prenom;        
    }
    
    public String getnom(){
        return this.nom;
    }
    public String getprenom(){
        return this.prenom;
    }
    public void setnom(){
        this.nom=nom;
    }
    public void setprenom(){
        this.prenom=prenom;
    }
    
    @Override
    public String toString(){
        return super.toString()+"\n"+"Proprietaire: "+nom+"  "+prenom;
    }
    @Override
    public void RetirerArgent(double montant){
        if(this.solde>montant && montant>0){
           this.solde=solde-montant;
        }
        else 
            System.out.println("Retrait impossible car montant trop eleve ou negatif");
    }
    @Override
    public void DeposerArgent(double montant){
        if(montant>0){
            this.solde=solde+montant;
        }
        else
            System.out.println("Montant invalide");
    }
   
    
    
}
