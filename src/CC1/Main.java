/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CC1;

import java.util.*;

/**
 *
 * @author zemar
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Compte> comptes = new ArrayList<Compte>();
        ComptePersonne C1 = new ComptePersonne(200000, "TALLA", "Rene");
        ComptePersonne C2 = new ComptePersonne(250000, "BEKOLO", "Bruno");
        System.out.println(C1);
        System.out.println(C2);
        C1.DeposerArgent(50000);
        C2.RetirerArgent(200000);
        System.out.println(C1);
        System.out.println(C2);
        C1.RetirerArgent(200000);
        System.out.println(C1);
        C1.RetirerArgent(100000);
        System.out.println(C1);

        CompteEntreprise C3 = new CompteEntreprise(20000, "Beton BTP");
        System.out.println(C3);
        C3.DeposerArgent(2000);
        System.out.println(C3);
        C3.RetirerArgent(25000);
        System.out.println(C3);
        C3.DeposerArgent(2000);
        System.out.println(C3);
        CompteNumerote C4 = new CompteNumerote(1000000, "Oumarou");
        System.out.println(C4);
        C4.DeposerArgent(2000000);
        System.out.println(C4);
        C4.RetirerArgent(3200000);
        System.out.println(C4);
        CompteEntreprise C5 = new CompteEntreprise(20000, "BEN System");
        System.out.println(C5);
        System.out.println("_________________________________________________");
        comptes.add(0, C1);
        comptes.add(1, C2);
        comptes.add(2, C3);
        comptes.add(3, C4);
        comptes.add(4, C5);
        System.out.println(comptes);
        comptes.remove(2);
        System.out.println(comptes);
        System.out.println("Compte a afficher: ");
        String nom = sc.nextLine();
        List<ComptePersonne> personnes = new ArrayList<ComptePersonne>();
        personnes.add(0, C1);
        personnes.add(1, C2);
        for (ComptePersonne compte : personnes) {
            if (compte.getnom().equals(nom)) {
                System.out.println(compte);
                break;
            } /*else {
                System.out.println("Compte de nom " + nom + " est innexistant");
                break;
            }*/

        }

        double somme = 0.0;
        for (Compte compte : comptes) {
            somme += compte.getsolde();
        }
        System.out.println("Le montant total en banque est: " + somme);

    }

}
