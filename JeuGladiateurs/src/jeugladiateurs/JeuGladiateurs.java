package jeugladiateurs;

import personnages.Personnage;
import combat.CompteurDeTour;
import combat.AffichageEcran;

/**
 *
 * @author Youan Pilon
 */
public class JeuGladiateurs {

    public static void main(String[] args) {

        // **************************************************************************
        // **************************************************************************
        // **************************************************************************
        // <editor-fold defaultstate="expanded" desc="Instanciation des objets">
        CompteurDeTour tour = new CompteurDeTour();
        AffichageEcran affichage = new AffichageEcran();
        Personnage bob = new Personnage("Bob le malchanceux", 15, 15, 70, 15);
        Personnage igor = new Personnage("Igor l'empaleur", 25, 5, 100, 30);
        // </editor-fold>

        // **************************************************************************
        // **************************************************************************
        // **************************************************************************
        // <editor-fold defaultstate="collapsed" desc="Affichage pré-combat">
        bob.afficherInfosPersonnage();
        igor.afficherInfosPersonnage();
        affichage.afficherDebutCombat();

        // </editor-fold>
        // **************************************************************************
        // **************************************************************************
        // **************************************************************************
        // <editor-fold defaultstate="collapsed" desc="Mécanique de combat">
        while (bob.getPointsDeVie() > 0 && igor.getPointsDeVie() > 0) {
            tour.afficheTour();
            for (int i = 0; i <= 100; i++) {
                if (i == bob.getInitiative()) {
                    bob.frapperPersonnage(igor);
                }
                if (i == igor.getInitiative()) {
                    igor.frapperPersonnage(bob);
                }

            }

            bob.setNewInitiativeRandom();
            igor.setNewInitiativeRandom();
            affichage.afficherSeparateurInfosPerso();
            bob.afficherInfosPersonnage();
            igor.afficherInfosPersonnage();
            tour.augmenteTour();
            affichage.afficherSeparateurDeTour();
        }
        affichage.afficheVictoire(bob, igor);
        // </editor-fold>
    }

}
