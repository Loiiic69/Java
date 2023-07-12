public class Ex7 {
    private int numero;
    private String date;
    private Client client;
    private String[] articles;
    private int[] quantites;
    private String adresse;

    public Ex7(int numero, String date, Client client, String[] articles, int[] quantites) {
        this.numero = numero;
        this.date = date;
        this.client = client;
        this.articles = articles;
        this.quantites = quantites;

    }

    public int getNumero() {
        return numero;
    }

    public String getDate() {
        return date;
    }

    public Client getClient() {
        return client;
    }

    public String[] getArticles() {
        return articles;
    }

    public int[] getQuantites() {
        return quantites;
    }

    public String getAdresse() {
        return adresse;
    }

    public static void main(String[] args) {
        String[] articles = {"TN Full black", "Casquette Nike", "Sacoche Nike"};
        int[] quantites = {2, 1, 3};
        Client client = new Client("FLORIMONT", "Loic", "15 Grande Rue", 97200, "Fort De France");
        Ex7 commande = new Ex7(1, "2023-06-12", client, articles, quantites);
        System.out.println(" ");
        System.out.println("------------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Numero de commande : " + commande.getNumero());
        System.out.println("Date de commande : " + commande.getDate());
        System.out.println("Client : " + commande.getClient().getNom() + " " + commande.getClient().getPrenom());
        System.out.println("Adresse de Livraison : " + commande.getClient().getAdresse() + " " + commande.getClient().getCodePostal() + " " + commande.getClient().getVille() );
        System.out.println(" ");
        System.out.println("------------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Articles commandes : ");
        for (int i = 0; i < commande.getArticles().length; i++) {
            System.out.println(commande.getArticles()[i] + " - Quantite : " + commande.getQuantites()[i]);
        }
    }

}


class Client {
    private String nom;
    private String prenom;
    private String adresse;
    private int codePostal;
    private String ville;

    public Client(String nom, String prenom, String adresse, int codePostal, String ville) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public String getVille() {
        return ville;
    }
}