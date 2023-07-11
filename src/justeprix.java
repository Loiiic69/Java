import java.util.Random;
import java.util.Scanner;

public class justeprix {
    public static void main(String[] args) {
        // Génération d'un nombre aléatoire entre 1 et 10000
        Random random = new Random();
        int justePrix = random.nextInt(10000) + 1;

        // Initialisation des variables
        int tentative = 0;
        boolean trouve = false;
        long debut = System.currentTimeMillis();

        // Boucle principale du jeu
        while (!trouve) {
            System.out.print("Entrez votre proposition : ");
            Scanner scanner = new Scanner(System.in);
            int proposition = scanner.nextInt();
            tentative++;

            if (proposition == justePrix) {
                trouve = true;
            } else if (proposition < justePrix) {
                System.out.println("C'est plus !");
            } else {
                System.out.println("C'est moins !");
            }
        }

        // Calcul du temps écoulé
        long fin = System.currentTimeMillis();
        long duree = fin - debut;

        // Affichage du résultat
        System.out.println("Bravo, vous avez trouvé le juste prix en " + tentative + " tentatives !");
        System.out.println("Temps écoulé : " + (duree / 1000) + " secondes.");
    }
}
