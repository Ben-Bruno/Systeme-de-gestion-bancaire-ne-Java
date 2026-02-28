/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CC1;

/**
 *
 * @author zemar
 */
public abstract class  Compte {
    protected String numero;
    protected double solde;
    public static  int NOMBRE=1;
    
    public Compte(){
        this.numero="";
        this.solde=0.0;
        NOMBRE++;
    }
    public Compte( double solde){
        this.numero="CMPTEBQ"+NOMBRE;
        this.solde=solde;
        NOMBRE++;
    }
    
    public String getnumero(){
        return this.numero;
    }
    public void setnumero(String num){
        this.numero=num;
    }   
    public double getsolde(){
        return this.solde;
    }
    public void setsolde(double solde){
        this.solde=solde;
    }
    @Override
    public String toString(){
        return "Compte de numero: "+numero+" solde= "+solde+"FCFA";
    }
    public abstract void RetirerArgent (double montant);
    public abstract void DeposerArgent (double montant); 
    
}
