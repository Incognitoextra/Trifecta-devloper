package jour5.exercices;
import java.util.Scanner;
public class Exo3 {
    public static void main(String[] args) {
        // Demander une note entre 0 et 100
        // Tant que la note n'est pas valide, redemander
        // Utiliser do-while pour garantir au moins une saisie

        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer un nombre entre 0 a 100:");
        int nombre = sc.nextInt();
        do { 
            System.out.println("Nombre invalide, reesayer: ");
            nombre = sc.nextInt();
        } while (nombre < 0 || nombre > 100);
        
        sc.close();
    }
}
