package jour4.exercices;
import java.util.Scanner;

public class Exo4 {
    public static void main(String[] args) {
        // Convertir une note sur 100 en lettre :
        // - 90-100 : A
        // - 80-89 : B
        // - 70-79 : C
        // - 60-69 : D
        // - <60 : F
        // Ajouter "+" si note finit par 7-9, "-" si 0-2

        Scanner sc = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("Conertisseur de note");
        System.out.println("==========================================");

        System.out.println("Entrer la note (sur 100)");
        int note = sc.nextInt();
        String noteConverti;
        // 1. Validation de l'entrée
        if (note < 0 || note > 100) {
            System.out.println("Note invalide");
            return; // On arrête le programme ici
        }

        // 2. Déterminer la lettre de base
        if (note >= 90)      noteConverti = "A";
        else if (note >= 80) noteConverti = "B";
        else if (note >= 70) noteConverti = "C";
        else if (note >= 60) noteConverti = "D";
        else                 noteConverti = "F";

        // 3. Ajouter le symbole (+ ou -) 
        // Uniquement si ce n'est pas un F et que la note n'est pas 100
        if (!noteConverti.equals("F") && note != 100) {
            int unite = note % 10; // On récupère le dernier chiffre (ex: 87 -> 7)
            
            if (unite >= 7)      noteConverti += "+";
            else if (unite <= 2) noteConverti += "-";
        }

        if (note == 100) noteConverti = "A+"; // Cas particulier pour le score parfait

        System.out.println("Vous avez eu un : "+noteConverti);
        sc.close();
    }
}
