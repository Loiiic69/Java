public class Ex5 {
    private String reference;
    private String designation;
    private double prix;

    public Ex5(String reference, String designation, double prix) {
        this.reference = reference;
        this.designation = designation;
        this.prix = prix;
    }


    public String getReference() {
        return reference;
    }
    public void setReference(String reference) {
        this.reference = reference;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }


    public static void main(String[] args) {
        Ex5 article = new Ex5("TN001b", "TN Full black", 189.99);
        System.out.println(" " );
        System.out.println("------------------------------" );
        System.out.println(" " );
        System.out.println("Article : " + article.getDesignation());
        System.out.println("Prix : " + article.getPrix());
        System.out.println("Reference : " + article.getReference());
        System.out.println(" " );
        System.out.println("------------------------------" );
        System.out.println(" " );

    }
}