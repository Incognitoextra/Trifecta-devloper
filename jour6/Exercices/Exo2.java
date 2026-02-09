package jour6.Exercices;
import java.util.Scanner;
public class Exo2 {
    public static void main(String[] args) {
        // Créer un tableau de 10 nombres aléatoires entre 1 et 100
        // Demander à l'utilisateur un nombre à rechercher
        // Afficher si le nombre existe et à quelles positions

        Scanner sc = new Scanner(System.in);

        int[] tableau = {16, 23, 67, 88 ,98, 44, 66, 45, 13, 56};

        System.out.println("===  RECHERCHER LE NOMBRE ===");
        System.out.print("Entrer un nombre: ");
        int nb = sc.nextInt();
        int position = -1;
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == nb) {
                position = i;
                break; // on arrete des qu'on l'a trouvee
            }
        }

        System.out.println("Le nombre "+ nb +" se trouve dans le tableau en "+ position+"e position");

        sc.close();
    }
}
