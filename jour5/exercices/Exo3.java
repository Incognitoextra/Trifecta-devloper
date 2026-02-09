package jour5.exercices;
import java.util.Scanner;
public class Exo3 {
    public static void main(String[] args) {
        // Demander une note entre 0 et 100
        // Tant que la note n'est pas valide, redemander
        // Utiliser do-while pour garantir au moins une saisie

        Scanner sc = new Scanner(System.in);
        int nombre ;
        do { 
            System.out.print("Entrer un nombre entre 0 et 100: ");
            nombre = sc.nextInt();
            if (nombre <0 || nombre >100) {
                System.out.print("Nombre invalide, reesayer: ");
                nombre = sc.nextInt();
            }
        } while (nombre < 0 || nombre > 100);
        
        sc.close();
    }
}
