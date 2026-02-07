package jour4.exercices;
import java.util.Scanner;
public class Exo5 {
    public static void main(String[] args) {
        // Formats valides en Haïti :
        // - 3XXXXXXXX ou +5093XXXXXXXX
        // - Doit commencer par 3, 4, ou 2
        // - Doit avoir 8 chiffres après l'indicatif
        // Retourner vrai/faux
        Scanner sc = new Scanner(System.in);

        System.out.println("==============================================");
        System.out.println("Validateur de numero telephone");
        System.out.println("==============================================");

        System.out.print("Entrer le numero de telephone");
        int telephone = sc.nextInt();
        
    }
}
