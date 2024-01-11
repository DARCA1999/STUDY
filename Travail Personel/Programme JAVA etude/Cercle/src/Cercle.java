import java.util.*;

public class Cercle {
    public static void main(String[] args) {
        //1. déclarations des variables
        double perimetre , rayon , surface;
        Scanner lectureclavier = new Scanner(System.in);

        //2.a Demander le rayon a l'utilisateur
        System.out.print("veuiller saisir le rayon du cercle : ");

        //2.b lire la valeur saisie au clavier
        rayon = lectureclavier.nextDouble();

        //3.a Calculer la circonference du cercle
        perimetre = 2 * Math.PI * rayon ;

        //3.b Calculer la surface du cercle
        surface = Math.PI * rayon * rayon ;

        //4. Afficher le resultat
        System.out.printf("le cercle de rayon  " + rayon + " a pour perimètre " + perimetre + " et pour surface " + surface);
        
    }

}
