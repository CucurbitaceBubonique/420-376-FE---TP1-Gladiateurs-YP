/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personnages;

import java.util.Random;
/**
 *
 * @author Youan Pilon
 */
public class Mirmillon extends Personnage {
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    //<editor-fold defaultstate="collapsed" desc="Attributs">
    
    //</editor-fold>
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    //<editor-fold defaultstate="collapsed" desc="Constructeurs et initialisation">
    public Mirmillon(String nom, int attaqueMax, int defense, int pvs, int ini) {
        this.nom = nom;
        this.classe = "Mirmillon";
        this.valeurMaxAttaque = attaqueMax;
        this.valeurDefense = defense;
        this.pointsDeVie = pvs;
        this.initiative = ini;
    }
    public Mirmillon(){
        this.nom = "";
        this.classe = "";
        this.valeurMaxAttaque = 0;
        this.valeurDefense = 0;
        this.pointsDeVie = 0;
        this.initiative = 0;
    }
    //</editor-fold>
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    //<editor-fold defaultstate="collapsed" desc="Getters et Setters">
    
    //</editor-fold>
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    //<editor-fold defaultstate="collapsed" desc="Mécanique de jeu">
    public void frapperPersonnage(Personnage personnageCible) {
        super.frapperPersonnage(personnageCible);
        if (personnageCible.pointsDeVie <= 0)
        {
            System.out.println(this.nom + "décapite " + personnageCible.nom);
        }
        else
        {
            super.frapperPersonnage(personnageCible);
        }
    }
    
    public void setNewInitiativeRandom() {
        Random rand = new Random();
        this.initiative = rand.nextInt(30 - 0);
    }
    //</editor-fold>
}
