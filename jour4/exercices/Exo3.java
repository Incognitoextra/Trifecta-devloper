package jour4.exercices;
import java.util.Scanner;
public class Exo3 {
    public static void main(String[] args) {
        // Vérifiez si un mot de passe est valide :
        // - Au moins 8 caractères
        // - Contient au moins un chiffre
        // - Contient au moins une majuscule
        // Affichez les erreurs spécifiques

        Scanner scanner = new Scanner(System.in);

        System.out.println("=======================================");
        System.out.println("Validateur de mot de passe");
        System.out.println("=======================================\n");

        System.out.println("Entrer votre mot de passe: ");
        String passe = scanner.nextLine();

    }
}
