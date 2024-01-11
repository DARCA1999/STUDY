package ProgrammesExercices;

import java.util.Scanner;

public class progexochap1 {
    public static void main(String[] args) {
        /*
    -------------------------------------------------------------
    *                   @Exercice I.2@                          *
    -------------------------------------------------------------
//         */
//        // Declarations des variables
//       double a;
//       Scanner lectureClavier = new Scanner(System.in);
//
//       // Demander valeur a l'utilisateur
//        System.out.printf("Entrer une valeur : ");
//        a = lectureClavier.nextDouble();
//
//        // Afficher la valeur
//        System.out.printf("Vous avez entre : " + a);
/*
    -------------------------------------------------------------
    *         @Exercice I.3@ : périmetre carré                  *
    -------------------------------------------------------------

 */
//
//        // Déclaration des vaiables représentant le périmetre et le coté
//        double coté , perimetre ;
//
//        // Déclaration de la variable repésentant la lecture du clavier
//        Scanner lectureClavier = new Scanner(System.in);
//
//        // Afficher le message "Valeur du coté : " à l'ecran
//        System.out.printf("Veuillez entrer la valeur d'un coté du carré : " );
//
//        // Lire au clavier une valeur
//        // Placer cette valeur dans la variable correspondante
//        coté = lectureClavier.nextDouble();
//
//        // Calculer le périmètre du carré
//        perimetre = coté * 4 ;
//
//        // Afficher resultat
//        System.out.printf("Le périmètre du carré est : " + perimetre);

/*
    -------------------------------------------------------------
    *        @Exercice I.3@ : Surface(Aire) du Rectangle        *
    -------------------------------------------------------------

 */
        // Déclaration des variables
        double longueur, largeur, Surface;
        Scanner lectureClavier = new Scanner(System.in);

        // Demander a l'utilisateur d'entrer la longueur et la largeur
        System.out.printf("Veuillez entrer la longueur du rectangle: ");

        // Lire au clavier la valeur de la longueur
        longueur = lectureClavier.nextDouble();

        System.out.printf("Veuillez entrer la largeur du rectangle : ");

        // Lire au clavier la valeur de la largeur
        largeur = lectureClavier.nextDouble();

        // Calcule de la surface du rectangle
        Surface = longueur * largeur;

        // Afficher la résultat
        System.out.printf("Surface : " + Surface);

    }
}
