/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectok;

/**
 *
 * @author willy-ngafi
 */
public class Cars {
    String nom;
    double puissance;

    public Cars(String nom, double puissance) {
        this.nom = nom;
        this.puissance = puissance;
    }

    public String getNom() {
        return nom;
    }

    public double getPuissance() {
        return puissance;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPuissance(double puissance) {
        this.puissance = puissance;
    }
    
}
