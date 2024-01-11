package ProgrammesExercices;
import java.util.*;
import java.util.Scanner;

public class progexochap4 {
    public static void main(String[] args) {
/*
        -------------------------------------------------------------
        *                        CHAPITRE 4                         *
        -------------------------------------------------------------

        *                        Entrainement                       *
        -------------------------------------------------------------

 */
        int nbPièce5c = 0, nbPièce10c = 0, nbpièce20c = 0, pièce, totalRecu = 0;
        Scanner lectureClavier = new Scanner(System.in);
        System.out.println("Pour obtenir un cafe, entrez au moins 45 cents");
        System.out.println("je rends la monnaie ");
        do
        {
            System.out.println("valeur de la pièce entree : ");
            pièce = lectureClavier.nextInt();

            switch (pièce)
            {
                case 5 : nbPièce5c = nbPièce5c + 1 ;
                break;
                case 10 : nbPièce10c = nbPièce10c + 1 ;
                break;
                case 20 : nbpièce20c = nbpièce20c + 1 ;
                break;
                default:
                    pièce = 0;
                    System.out.println("pièce impossible");
            }
            totalRecu = totalRecu + pièce ;
            System.out.println("Vous avez entre : ");
            System.out.println("    " + nbPièce5c + "pièce de 5 cents");
            System.out.println("    " + nbPièce10c + "pièce de 10 cents");
            System.out.println("    " + nbpièce20c + "pièce de 5 cents");

        }

    }
}
