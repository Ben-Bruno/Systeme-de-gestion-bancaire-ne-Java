/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CC1;

/**
 *
 * @author zemar
 */
public class CompteNumerote extends Compte {
    private String NomProp;
    private int NumCompte;
    private static int NOMBRE=1;
    
    public CompteNumerote(){
        super();
        this.NomProp="";
        this.NumCompte=100000;
        NOMBRE++;
    }
    public CompteNumerote(double solde, String nomp){
            super( solde);
            this.NomProp=nomp;
            this.NumCompte=100000+NOMBRE;
            }

    public String getNomProp() {
        return NomProp;
    }

    public void setNomProp(String NomProp) {
        this.NomProp = NomProp;
    }

    public int getNumCompte() {
        return NumCompte;
    }

    public void setNumCompte(int NumCompte) {
        this.NumCompte = NumCompte;
    }

    @Override
    public String toString(){
        return super.toString()+"  Numero unique: "+NumCompte+"\n";
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
