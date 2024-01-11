package CompteBancaire;
import java.util.*;
public class menus {

    public static void main(String[] args) {
        int ChoixMenus, numCpt;
        Scanner lectureClavier = new Scanner(System.in);

        System.out.println("1.Creer un compte");
        System.out.println("2.Affiche un compte");
        System.out.println("3.Creer une ligne comptable");
        System.out.println("4.Sortir ");
        System.out.println("5.De l'aide");
        System.out.print("Votre choix : ");
        ChoixMenus = lectureClavier.nextInt();

        switch (ChoixMenus) {
            case 1 :
                System.out.println("Type du compte [Types possibles : courant, joint , epargne] : ");
                System.out.println("Numéro du compte : ");
                System.out.println("Première valeur creditee : ");
                System.out.println("Taux de placement : ");
            break;
            case 2 :
                System.out.println("Veuillez saisir le numéro de compte que vous souhaiter consulter : ");
                numCpt = lectureClavier.nextInt();
                if (numCpt != 0) { //!!trouver comment lui vrefiez si le compte existe ou pas
                    System.out.println(" EST CENSÉ AFFICHER [LE NUM DE COMPTE , LE TYPE, LA VALEUR INITIALE ET SON TAUX DANS LE CAS D'UN COMPTE EPARGNE]");
                }
                else
                {
                    System.out.println(" Ce compte n'existe pas ");
                }
            break;
            case 3 :
                System.out.println(" option non programmee ");
            break;
            case 4 : System.exit(0);
            break;
            case 5 :
                System.out.println(" L'option 1 permet de creer un nouveau compte " + "\n" +
                                   " L'option 2 demande a l'utilisateur de saisir le numéro du compte qu'il veut consulter " + "\n" +
                                   " L'option 3 n'est pas encore fait " + "\n" +
                                   " L'option 4 permet de mettre fin a l'exection du programme "
                                  );
        }
    }
}
