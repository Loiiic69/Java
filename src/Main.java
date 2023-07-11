public class Main {
    public static void main(String[] args) {
        //Déclaration du tableau d'adresse Mail
        String[] emails = {
                "jpp@sfr.fr",
                "tom@gmail.com",
                "fred@gmail.com",
                "victor@sfr.fr",
                "chris@sfr.fr",
                "robert@orange.fr",
                "paul@sfr.fr",
                "lise@gmail.com",
                "thierry@isitech.fr",
                "marie@gmail.fr"
        };
        // Compte le nombre d'adresse du tableau
        int totalEmails = emails.length;

        int gmailCount = 0;
        // Recherche des adresses gmail
        for (String email : emails) {
            if (email.endsWith("@gmail.com") || email.endsWith("@gmail.fr")) {

                gmailCount++;
            }
        }
        // Calcule du % d'adresse en gmail
        double percentage = (double) gmailCount / totalEmails * 100;

        System.out.println(percentage + "% " + "d'adresses Gmail.com et/ou Gmail.fr");
    }
}
