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

        System.out.print("Entrer le numero de telephone: ");
        String telephone = sc.nextLine().trim(); // .trim() enlève les espaces inutiles

        // On gère l'indicatif +509 pour ne travailler que sur les 8 chiffres
        String numeroTravail = telephone;
        if (telephone.startsWith("+509")) {
            numeroTravail = telephone.substring(4);
        }

        // 1. Vérification de la longueur (doit être exactement 8)
        boolean longueurValide = (numeroTravail.length() == 8);
        
        // 2. Vérification du début (sur le numéro sans indicatif)
        boolean debutValide = false;
        if (numeroTravail.length() > 0) {
            char first = numeroTravail.charAt(0);
            if (first == '2' || first == '3' || first == '4') {
                debutValide = true;
            }
        }

        // 3. Vérification que TOUT sont des chiffres
        boolean uniquementChiffres = true;
        for (int i = 0; i < numeroTravail.length(); i++) {
            if (!Character.isDigit(numeroTravail.charAt(i))) {
                uniquementChiffres = false;
                break; // On s'arrête dès qu'on trouve une lettre
            }
        }

        // --- AFFICHAGE DES ERREURS ---
        System.out.println("\n--- Verdict ---");
        if (!longueurValide) System.out.println("ERREUR: Le numéro doit avoir 8 chiffres (hors indicatif).");
        if (!debutValide)    System.out.println("ERREUR: Doit commencer par 2, 3 ou 4.");
        if (!uniquementChiffres) System.out.println("ERREUR: Le numéro contient des caractères non autorisés.");

        if (longueurValide && debutValide && uniquementChiffres) {
            System.out.println("Le numéro " + telephone + " est VALIDE");
        } else {
            System.out.println("Le numéro " + telephone + " est INVALIDE");
        }

        sc.close();
    }
}
