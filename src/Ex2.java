import java.util.Random;

public class Ex2 {
    // Méthode principale
    public static void main(String[] args) {
        // Appel de la méthode findCombination() pour rechercher la combinaison
        int attempts = findCombination();
        System.out.println("Nombre d'essais nécessaires : " + attempts);
    }

    // Méthode pour rechercher la combinaison
    public static int findCombination() {
        // Création d'une instance de la classe Random pour générer des nombres aléatoires
        Random random = new Random();
        int attempts = 0;

        // Boucle jusqu'à ce que la combinaison pair, pair, impair soit trouvée
        while (true) {
            // Génération de trois nombres aléatoires entre 0 et 1000
            int num1 = random.nextInt(1001);
            int num2 = random.nextInt(1001);
            int num3 = random.nextInt(1001);

            // Incrémentation du nombre d'essais
            attempts++;

            // Vérification de la combinaison pair, pair, impair
            if (num1 % 2 == 0 && num2 % 2 == 0 && num3 % 2 != 0) {
                // Affichage de la combinaison trouvée
                System.out.println("Combinaison trouvée : " + num1 + ", " + num2 + ", " + num3);
                break;  // Sortie de la boucle
            }
        }

        // Renvoi du nombre d'essais nécessaires
        return attempts;
    }
}
