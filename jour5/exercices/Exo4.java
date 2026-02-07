package jour5.exercices;
import java.util.Scanner;
public class Exo4 {
    public static void main(String[] args) {
        // Demander combien de notes à saisir
        // Pour chaque note, vérifier validité (0-100)
        // Calculer et afficher la moyenne
        // Identifier la note la plus haute et la plus basse

       Scanner sc = new Scanner(System.in);
        System.out.println("=== Calcul de moyenne ===\n");

        System.out.print("Entrer le nombre de note a enregistrer: ");
        int nombreNote = sc.nextInt();

        double somme = 0;
        int noteMax = -1;  // Plus petit que le minimum possible
        int noteMin = 101; // Plus grand que le maximum possible

        for (int i = 1; i <= nombreNote; i++) {
            int note;
            
            // Correction de la validation : on boucle TANT QUE la note est invalide
            do { 
                System.out.print("Entrer la note n°" + i + " (0-100) : ");
                note = sc.nextInt();
                if (note < 0 || note > 100) {
                    System.out.println("Erreur ! La note doit être entre 0 et 100.");
                }
            } while (note < 0 || note > 100);

            somme += note;

            // Mise à jour de la note Max et Min
            if (note > noteMax) noteMax = note;
            if (note < noteMin) noteMin = note;
        }

        // Correction de la division : on utilise 1.0 * somme pour avoir des décimales
        double moyenne = somme / nombreNote;

        System.out.println("\n--- RESULTATS ---");
        System.out.printf("La moyenne generale est: %.2f%n", moyenne);
        System.out.println("Note la plus haute : " + noteMax);
        System.out.println("Note la plus basse : " + noteMin);

        sc.close();
    }
}
