import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un nombre entier : ");
        int nombre = scanner.nextInt();

        String binaire = Integer.toBinaryString(nombre);
        String octal = Integer.toOctalString(nombre);
        String hexa = Integer.toHexString(nombre);

        System.out.println("Valeur en binaire : " + binaire);
        System.out.println("Valeur en octal : " + octal);
        System.out.println("Valeur en hexadécimal : " + hexa);
    }
}
