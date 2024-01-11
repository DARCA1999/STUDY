package ProgrammesExercices;

import java.util.Scanner;

public class progexochap2_3 {
    public static void main(String[] args) {
        /*
        -------------------------------------------------------------
        *        @Exercice 2.4@ : programme Euro qui convertit      *
        *                         des francs en euros               *
        -------------------------------------------------------------

         */

//        //Déclarer les variables représentant les francs et les euros
//        //ainsi que le taux de conversion
//        double tauxconver = 6.55957 , francs , euro;
//
//        //Déclaration de la variable représentant la lecture au clavier
//        Scanner lectureclavier = new Scanner(System.in);
//
//        //Afficher et saisir le nombre de francs
//        System.out.print("veuillez saisir le nombre de francs : ");
//        francs = lectureclavier.nextDouble();
//
//        //calculer le nombre d'euros
//        euro = francs * tauxconver;
//
//        //Afficher le résultat suivant l'exemple donné ci-dessous
//        System.out.println("Nombre de francs : " + francs + "\n" +
//                           "Conversion F/E : " + tauxconver + "\n" +
//                           "Nombre d'euros : " + euro);

        /*
        -------------------------------------------------------------
        *                        CHAPITRE 3                         *
        -------------------------------------------------------------

        *                        Entrainement                       *
        -------------------------------------------------------------

         */

//        int jour , mois , annee ;
//        Scanner lectureClavier = new Scanner(System.in);
//        System.out.println("veuillez saisir le numéro du mois de l'annee rechercher : ");
//        int nummois = lectureClavier.nextInt();
//
//        switch (nummois) {
//            case 1:
//                System.out.println("janvier");
//                break;
//            case 2:
//                System.out.println("fevrier");
//                break;
//            case 3:
//                System.out.println("mars");
//                break;
//            case 4:
//                System.out.println("avril");
//                break;
//            case 5:
//                System.out.println("mai");
//                break;
//            case 6:
//                System.out.println("juin");
//                break;
//            case 7:
//                System.out.println("juillet");
//                break;
//            case 8:
//                System.out.println("aout");
//                break;
//            case 9:
//                System.out.println("septembre");
//                break;
//            case 10:
//                System.out.println("octobre");
//                break;
//            case 11:
//                System.out.println("novembre");
//                break;
//            case 12:
//                System.out.println("decembre");
//                break;
//            default:
//                System.out.println("vous devez saisir un nombre entre 1 et 12");
//        }
        /*
        -------------------------------------------------------------
        *                @Exercice 3.1@ :                           *
        -------------------------------------------------------------

     */
//        double x,r ;
//        Scanner lectureClavier = new Scanner(System.in);
//        System.out.print("Entrer un chiffre :");
//        x = lectureClavier.nextDouble();
//        if (x >= 0)
//        {
//            r = Math.sqrt(x) ;
//        }
//        else
//        {
//            r = Math.sqrt(-x);
//        }
//        System.out.print("pour " + x + " Le resulat est : " + r); // Affiche la racine carré de la valeur saisie au clavier
//


    /*
        -------------------------------------------------------------
        *                @Exercice 3.2@ :                           *
        -------------------------------------------------------------

     */
//
//        int première, deuxième, laPlusGrande = 0 ;
//        Scanner lectureClavier = new Scanner(System.in);
//        System.out.print("Entrer une valeur : ");
//        première = lectureClavier.nextInt();
//        System.out.print("Entrer une deuxième valeur : ");
//        deuxième = lectureClavier.nextInt();
//        if (première>deuxième)
//        {
//            System.out.println(deuxième + " " + première);
//            laPlusGrande = première;
//            System.out.println("la plus grande valeur est : " + laPlusGrande );
//        }
//        else if (première<deuxième)
//        {
//            System.out.println(première + " " + deuxième);
//            laPlusGrande = deuxième;
//            System.out.println("la plus grande valeur est : " + laPlusGrande );
//        }
//        else if (première==deuxième)
//        {
//            System.out.println("les deux valeurs sont egales");
//        }

     /*
        -------------------------------------------------------------
        *                @Exercice 3.4@ :                           *
        -------------------------------------------------------------

     */
//        double a , b , c , x , x1 , x2 ;
//        Scanner lectureclavier = new Scanner(System.in);
//
//        System.out.println("saisir la valeur de a : ");
//        a = lectureclavier.nextDouble();
//        System.out.println("saisir la valeur de b : ");
//        b = lectureclavier.nextDouble();
//        System.out.println("saisir la valeur de c : ");
//        c = lectureclavier.nextDouble();
//
//        if ( a == 0 )
//        {
//            if (b == 0)
//            {
//                if (c == 0)
//                {
//                    System.out.println("tout réel est solution");
//                }
//                else if ( c!= 0 )
//                {
//                    System.out.println("pas de solution");
//                }
//            }
//            else if ( b!= 0)
//            {
//                x = - (c / b) ;
//                System.out.println("un seul solution : " + x );
//            }
//        }
//        else if ( a!= 0)
//        {
//            double delta = b*b - 4*a*c ;
//            if ((delta) >= 0)
//            {
//                x1 = - b + Math.sqrt(delta) / 2 * a ;
//                x2 = - b - Math.sqrt(delta) / 2 * a ;
//                System.out.println("les deux solution sont : " + "\n" + "x1 = " + x1 + "\n" + "x2 = " + x2 );
//            }
//            else if ((b*b - 4*a*c) < 0)
//            {
//                System.out.println("pas de solution dans les réels");
//            }
//
//        }

     /*
        -------------------------------------------------------------
        *                @Exercice 3.5@ :                           *
        -------------------------------------------------------------

     */

        double  a , b , calcul = 0;
        char operation ;
        Scanner lectureclavier = new Scanner(System.in);

        System.out.println("Entrer la première valeur : ");
        a = lectureclavier.nextDouble();
        System.out.println("Entrer la deuxième valeur : ");
        b = lectureclavier.nextDouble();
        System.out.println("Type de l'operation : ");
        operation = lectureclavier.next().charAt(0);

        switch (operation){
            case '+' : calcul = a + b;
                System.out.println("cette operation a pour resultat : " + a + " " + operation + " " + b + " = " + calcul );
                break;
            case '-' : calcul = a - b;
                System.out.println("cette operation a pour resultat : " + a + " " + operation + " " + b + " = " + calcul );
                break;
            case '*' : calcul = a * b;
                System.out.println("cette operation a pour resultat : " + a + " " + operation + " " + b + " = " + calcul );
                break;
            case '/' : calcul = a / b;
                if (b == 0 )
                {
                    System.out.println("calcule impossible");
                } else if (b != 0) {
                    System.out.println("cette operation a pour resultat : " + a + " " + operation + " " + b + " = " + calcul );
                }
                break;
            default:
                System.out.println("vous n'avez pas saisie une operation correcte");
        }


    }
}
