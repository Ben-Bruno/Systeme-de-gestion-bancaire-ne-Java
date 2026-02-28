/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CC1;

/**
 *
 * @author zemar
 */
public class CompteEntreprise extends Compte {

    private String Nom_Entreprise;
    private double decouvert;
    private boolean premierdepot = false;

    public CompteEntreprise() {
        super();
        this.Nom_Entreprise = "";
        this.decouvert = 0.0;
    }

    public CompteEntreprise(double solde, String Nom_Entreprise) {
        super(solde);
        this.Nom_Entreprise = Nom_Entreprise;
        this.decouvert=solde;
    }

    public String getnom() {
        return this.Nom_Entreprise;
    }

    public void setNom(String nom) {
        this.Nom_Entreprise = nom;
    }

    public double getdecouvert() {
        return this.decouvert;
    }

    public void setdecouvert() {
        this.decouvert = solde;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Compte appartennant a l'entreprise " + Nom_Entreprise + " decouvert: " + decouvert+"\n";
    }

    @Override
    public void RetirerArgent(double montant) {
        if (montant <= solde+montant && montant < 0) {
            this.solde = solde - montant;
        } else {
            System.out.println("Montant trop eleve");
        }
    }

    @Override
    public void DeposerArgent(double montant) {

        if (montant > 0 ) {
            this.solde += montant;           
        } 
        
    }

}
