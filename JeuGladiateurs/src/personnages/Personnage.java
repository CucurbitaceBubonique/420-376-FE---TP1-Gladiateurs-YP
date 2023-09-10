package personnages;

import java.util.Random;

public class Personnage {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Attributs">
    protected String nom;
    protected String classe;
    protected int pointsDeVie;
    protected int valeurMaxAttaque;
    protected int valeurDefense;
    protected int initiative;
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Constructeurs et initialisation">
    public Personnage(String nom, int attaqueMax, int defense, int pvs, int ini) {
        this.nom = nom;
        this.classe = "";
        this.valeurMaxAttaque = attaqueMax;
        this.valeurDefense = defense;
        this.pointsDeVie = pvs;
        this.initiative = ini;
    }

    public Personnage() {
        this.nom = "";
        this.classe = "";
        this.valeurMaxAttaque = 0;
        this.valeurDefense = 0;
        this.pointsDeVie = 0;
        this.initiative = 0;
    }
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Getters et setters">
    public String getNom() {
        return nom;
    }

    public String getClasse() {
        return classe;
    }
    

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public int getValeurMaxAttaque() {
        return valeurMaxAttaque;
    }

    public int getValeurDefense() {
        return valeurDefense;
    }

    public int getInitiative() {
        return initiative;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    public void setValeurMaxAttaque(int valeurMaxAttaque) {
        this.valeurMaxAttaque = valeurMaxAttaque;
    }

    public void setValeurDefense(int valeurDefense) {
        this.valeurDefense = valeurDefense;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    // </editor-fold>
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Mécanique de jeu">
    public void afficherInfosPersonnage() {
        System.out.println();
        System.out.println(this.nom);
        System.out.println("Classe : " + this.classe);
        System.out.println("\t" + "Attaque : " + this.valeurMaxAttaque);
        System.out.println("\t" + "Défense : " + this.valeurDefense);
        System.out.println("\t" + "Points de vie : " + this.pointsDeVie);
        System.out.println("\t" + "Initiative : " + this.initiative);
        if (this.pointsDeVie > 0) {
            System.out.println("\tStatut : Vivant");
        } else {
            System.out.println("\tStatut : Mort");
        }
    }

    private int attaqueCalcul() {
        Random rand = new Random();
        int degats;
        degats = rand.nextInt(this.valeurMaxAttaque - 0);
        return degats;
    }

    public void frapperPersonnage(Personnage personnageCible) {
        int forceDeFrappe = this.attaqueCalcul();
        int valeurDefense = personnageCible.valeurDefense;
        int dommages = forceDeFrappe - valeurDefense;

        if (dommages < 0) {
            dommages = 0;
        }

        personnageCible.pointsDeVie = personnageCible.pointsDeVie - dommages;
        if (personnageCible.pointsDeVie < 0) {
            personnageCible.pointsDeVie = 0;
        }

        System.out.println();
        System.out.println(this.nom + " attaque avec une puissance de : " + forceDeFrappe);
        System.out.println(personnageCible.nom + " a une défense de : " + valeurDefense);
        System.out.println("Les dommages sont donc de : " + dommages);

    }

    public void setNewInitiativeRandom() {
        Random rand = new Random();

        this.initiative = rand.nextInt(100 - 0);
    }
    // </editor-fold>
}
