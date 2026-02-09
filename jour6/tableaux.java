package jour6;

import java.util.Arrays;

public class tableaux {
    public static void main(String[] args){
        // Ici on va apprendre la collection des donnees avec les tableaux.
        /*
            Déclaration
            type[] nomTableau;

            Initialisation avec taille
            type[] nomTableau = new type[taille];

            Initialisation avec valeurs
            type[] nomTableau = {valeur1, valeur2, valeur3};

            Exemple: 
                int[] notes = new int[5];          // Tableau de 5 entiers (tous à 0)
                double[] prix = {150.5, 200.0, 99.99};  // Tableau initialisé
                String[] noms = new String[3];     // Tableau de 3 Strings (tous null)

            Acces aux elements du tableau
            int[] nombres = {10, 20, 30, 40, 50};

            Lecture
            int premier = nombres[0];     // 10
            int troisieme = nombres[2];   // 30

            Modification
            nombres[1] = 25;              // Change le deuxième élément
            nombres[4] = nombres[0] * 2;  // 50 devient 20

            Longueur du tableau (IMPORTANT !)
            int taille = nombres.length;   // 5 (pas de parenthèses !)
        */

        int[] nombres = {10, 20, 30, 40, 50};
        int first = nombres[0];
        System.out.println("Le premier nombre du tableau est: " + first);

        // Parcourir le tableau 
          // Methode 1: La boucle classique
        System.out.println("=== LA BOUCLE CLASSIQUE ===");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Element "+ i+" = "+nombres[i]);
        }

          // Methode 2: La boucle for Each
        System.out.println("=== LA BOUCLE FOR EACH ===");
        for (Object elem : nombres) {
            System.out.println("Element : "+ elem);
        }

        // Copie de tableau
        int[] original = {1, 2, 3};
        int[] copie = original.clone();  // Méthode 1
        int[] copie2 = Arrays.copyOf(original, original.length);  // Méthode 2
        System.out.println("=== COPIE DE TABLEAU ===");
        System.out.println("ORIGINAL");
        for (int i = 0; i < original.length; i++) {
            System.out.println("Element original : "+ i +" = "+original[i]);
        }

        System.out.println("COPIE 1");
        for (int i = 0; i < copie.length; i++) {
            System.out.println("Element copie 1 : "+ i +" = "+copie[i]);
        }

        System.out.println("COPIE 2");
        for (int i = 0; i < copie2.length; i++) {
            System.out.println("Element copie 2 : "+ i +" = "+copie2[i]);
        }

        // Tri de tableau avec .sort
    
        int[] table = {5, 2, 8, 1, 9};
        System.out.println("=== tABLE AVANT TRI");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i]);
        }
        Arrays.sort(table);  // Devient {1, 2, 5, 8, 9}
        System.out.println("=== tABLE APRES TRI");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i]);
        }
    }
}
