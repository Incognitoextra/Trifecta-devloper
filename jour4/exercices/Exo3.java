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

          // Nos variables
        boolean caracteres = passe.length() >= 8;
        boolean chiffre = false;
        boolean majuscule = false;
        for (int i = 0; i < passe.length(); i++) {
            char c = passe.charAt(i); // on capte chaque caractere du mot de passe

            if (Character.isDigit(c)) {
                // on verifie si le caractere est un chiffre
                chiffre = true;
            } else if (Character.isUpperCase(c)) {
                // On verifie si le caractere est majuscule
                majuscule = true;
            }     
        }

        System.out.println("===============================");
        System.out.println("RAPPORT DE VALIDITE");
        System.out.println("=============================== \n");
        boolean valide = true;
        if (!chiffre) {
            System.out.println("ERREUR: Le mot de passe doit contenir un chiffre \n");
            valide = false;
        }
        if (!caracteres) {
            System.out.println("ERREUR: Le mot de passe doit avoir 8 caractere:");
            System.out.println("Nombre de caractere actuel: "+ passe.length()+"\n");
            valide = false;
        }
        if (!majuscule) {
            System.out.println("ERREUR: Le mot de passe doit avoir au moins une majuscule \n");
        }

        System.out.println("RESULTAT FINAL");
        if (valide) {
            System.out.println("Le mot de passe est parfaitement securisee");
        } else{
            System.out.println("Le mot de passe est invalide");
        }

        scanner.close();

    }
}
