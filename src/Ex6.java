public class Ex6 {
    private String nom;
    private String prenom;
    private String adresse;
    private String codePostal;
    private String ville;

    public Ex6(String nom, String prenom, String adresse, String codePostal, String ville) {
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
    public String getCodePostal() {
        return codePostal;
    }
    public String getVille() {
        return ville;
    }

    public static void main(String[] args) {
        Ex6 client = new Ex6("FLORIMONT", "Loic", "15 Grande Rue", "97200", "Fort-De-France");
        System.out.println(" ");
        System.out.println("------------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Nom du client : " + client.getNom());
        System.out.println("Prenom du client : " + client.getPrenom());
        System.out.println("Adresse du client : " + client.getAdresse() + " " + client.getCodePostal() + " " + client.getVille());
        System.out.println(" ");
        System.out.println("------------------------------------------------------------");
        System.out.println(" ");
    }
}
