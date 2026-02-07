package jour5.exercices;

public class Exo1 {
    public static void main(String[] args) {
        // Afficher la table de multiplication d'un nombre
        // Exemple pour 7 :
        // 7 x 1 = 7
        // 7 x 2 = 14
        // ...
        // 7 x 10 = 70
        System.out.println("Table de multiplication par 7");
        for (int i = 0; i <= 10; i++) {
            System.out.println("7 x " + i +" = " + (i*7));
        }

    }
}
