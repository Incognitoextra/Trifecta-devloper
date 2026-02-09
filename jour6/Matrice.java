package jour6;

public class Matrice {
    public static void main(String[] args) {
        // Ici on va commencer a se servir des matrices (tableaux multidimensionnel)

        /*
            Tableau 2D (lignes × colonnes)
            int[][] matrice = new int[3][4];  // 3 lignes, 4 colonnes

            Initialisation
            int[][] grille = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };

            Accès
            int valeur = grille[1][2];  // Ligne 1, Colonne 2 = 6
        */
        int[][] grille = {
            {2,3,4},
            {4,4,5},
            {5,2,8}
        };
        int valeur = grille[2][2];
        System.out.println("=== MATRICE 3 X 3 ===");
        System.out.println(valeur);

        //  for (int i = 0; i < grille.length; i++) {
        //     for (int j = 0; j < grille.length; j++) {
        //          System.out.println(grille[i][j]);
        //      }
        //  }

        
    }
}
