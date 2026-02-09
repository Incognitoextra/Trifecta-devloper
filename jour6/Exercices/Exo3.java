package jour6.Exercices;
public class Exo3 {
    public static void main(String[] args) {
        // Créer un tableau de nombres
        // Créer un nouveau tableau qui est l'inverse du premier
        // Ex: {1, 2, 3, 4} → {4, 3, 2, 1}
        // Faire aussi une version qui inverse "sur place"

        int[] tableau ={1, 2, 3, 4, 5};
        int[] inverse = new int[tableau.length];
        

        System.out.println("Tableau avant inversion");
        for (int i = 0; i < tableau.length; i++) {
            System.out.println(tableau[i]);
        }

        // Inversion du tableau
        for (int i = 0; i < tableau.length; i++) {
            inverse[i]=tableau[tableau.length - 1 -i];
        }

        System.out.println("Tableau inverse");
        for (int i = 0; i < inverse.length; i++) {
            System.out.println(inverse[i]);
        }

    }
}
