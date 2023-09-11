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
public class Retiaire extends Personnage {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    //<editor-fold defaultstate="collapsed" desc="Attributs">
    boolean filet;
    int chanceAttrape;

    //</editor-fold>
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    //<editor-fold defaultstate="collapsed" desc="Constructeurs et initialisation">
    public Retiaire() {
        this.nom = "";
        this.classeDeCombattant = "Retiaire";
        this.valeurMaxAttaque = 0;
        this.valeurDefense = 0;
        this.pointsDeVie = 0;
        this.initiative = 0;
        this.filet = true;
    }

    public Retiaire(String nom, int attaqueMax, int defense, int pvs, int ini) {
        this.nom = nom;
        this.classeDeCombattant = "Retiaire";
        this.valeurMaxAttaque = attaqueMax;
        this.valeurDefense = defense;
        this.pointsDeVie = pvs;
        this.initiative = ini;
        this.filet = true;
    }

    //</editor-fold>
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    //<editor-fold defaultstate="collapsed" desc="Getters et Setters">
    public boolean isFilet() {
        return filet;
    }

    public int getChanceAttrape() {
        return chanceAttrape;
    }

    public void setFilet(boolean filet) {
        this.filet = filet;
    }

    public void setChanceAttrape(int chanceAttrape) {
        this.chanceAttrape = chanceAttrape;
    }

    //</editor-fold>
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    //<editor-fold defaultstate="collapsed" desc="Mécanique de jeu">
    public void frapperPersonnage(Personnage personnageCible) {
        if (this.filet) {
            Random rand = new Random();
            System.out.println();
            System.out.println(this.nom + " lance son filet");
            this.chanceAttrape = rand.nextInt(10 - 1) + 1;
            if (this.chanceAttrape == 1) {
                System.out.println("Son filet attrape " + personnageCible.nom + " et il l'empale sauvagement avec sa lance");
                personnageCible.pointsDeVie = 0;
            } else {
                System.out.println("Le filet n'atteint pas sa cible");
                this.filet = false;
            }
        } else {
            System.out.println(this.nom + " ramasse son filet et en profite pour attaquer");
            this.filet = true;
            super.frapperPersonnage(personnageCible);
        }
    }
    //</editor-fold>

}
