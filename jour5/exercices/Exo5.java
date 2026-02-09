package jour5.exercices;
import java.util.Scanner;
public class Exo5 {
    public static void main(String[] args) {
        // Générer un mot de passe aléatoire de longueur donnée
        // Utiliser une boucle pour ajouter des caractères
        // Mélanger lettres majuscules, minuscules et chiffres

        Scanner sc =new Scanner(System.in);

        String maj = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String min = "abcdefghijklmnopqrstuvwxyz";
        String chiffres = "0123456789";
        String source = maj+min+chiffres;

        System.out.println("===================================");
        System.out.println("GENERATEUR DE MOT DE PASSE");
        System.out.println("===================================\n");

        System.out.print("Entrer la longeur du mot de passe: ");
        int longeur = sc.nextInt();
        String password = "";
        boolean valide = false;

        // On recommence TOUT le processus tant que le mot de passe n'est pas parfait
        do {
            password = ""; // On vide le mot de passe précédent
            
            // 1. GÉNÉRATION
            for (int i = 0; i < longeur; i++) {
                int index = (int) (Math.random() * source.length());
                password += source.charAt(index);
            }

            // 2. VÉRIFICATION
            boolean aChiffre = false;
            boolean aMaj = false;
            boolean aMin = false;

            for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);
                if (Character.isDigit(c)) aChiffre = true;
                if (Character.isUpperCase(c)) aMaj = true;
                if (Character.isLowerCase(c)) aMin = true;
            }

            // Un mot de passe est valide SEULEMENT s'il a les trois types
            // ET si la longueur est correcte (mais la boucle for gère déjà la longueur)
            if (aChiffre && aMaj && aMin) {
                valide = true;
            }

        } while (!valide); // Si valide est faux, on remonte au "do" et on recommence tout

        System.out.println("Votre mot de passe sécurisé : " + password);
        sc.close();
    }
}
