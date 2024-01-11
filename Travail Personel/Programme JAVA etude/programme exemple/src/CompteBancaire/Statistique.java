package CompteBancaire;
import java.util.*;
public class Statistique {
    public static void main(String[] args) {
        //declaration
        int nbCB = 0, nbCheque = 0, nbVirement = 0, nbDebit = 0 ;
        float prctCB, prctCh, prctVi ;
        Scanner lectureClavier = new Scanner(System.in);

        //Affiche et saisie des informations sur le compte de l'utilisateur
        System.out.print(" Nombre de paiements par Carte Bleue : ");
        nbCB = lectureClavier.nextInt();
        System.out.print(" Nombre de cheques émis : ");
        nbCheque = lectureClavier.nextInt();
        System.out.print(" Nombre de virements automatiques : ");
        nbVirement = lectureClavier.nextInt();

        //Calcul du nombre total de paiement effectués
        nbDebit = nbCB + nbCheque + nbVirement ;

        //Calcul du pourcentage d'utilisation de la carte Bleue
        prctCB = (float) nbCB / nbDebit * 100 ;

        //Calcul du pourcentage d'utilisation par Cheque
        prctCh = (float) nbCheque / nbDebit * 100 ;

        //Calcul du pourcentage d'utilisation Virements automatiques
        prctVi = (float) nbVirement / nbDebit * 100 ;

        //Affichage des resultats des differents pourcentage d'utilisation
        System.out.println("\n Vous avez emis " + nbDebit + " ordres de debit " + "\n" +
                           " dont " + prctCB + " % par Carte Bleue " + "\n" +
                           "      " + prctCh + " % par chèque " + "\n" +
                           "      " + prctVi + " % par Virement "
                           );


    }
}
