package jour5.exercices;
import java.util.Scanner;
public class Exo2 {
    public static void main(String[] args) {
        // Calculer 1 + 2 + 3 + ... + N
        // Demander N à l'utilisateur
        // Afficher le résultat et la formule complète

        Scanner sc = new Scanner(System.in);
        System.out.println("Somme continuelle de nombre");
        System.out.println("Entrer un nombre");
        int N = sc.nextInt();
        int somme = 0;
        for (int i = 1; i <= N; i++) {
            somme = somme + i;
            System.out.print(i);
            if (i>=1) {
                System.out.print(" + ");
            }
        }
        System.out.print(" = " + somme);
        sc.close();

    }
}
