package jour7.exercices;

public class Exo1 {
    // Créer des méthodes pour :
    // 1. calculerCarre(n) : retourne n²
    // 2. estPair(n) : retourne vrai si n est pair
    // 3. max(a, b) : retourne le plus grand des deux
    // 4. calculerPerimetreRectangle(longueur, largeur)
    // Tester toutes ces méthodes

    // 1. Calculer carre
    public static int calculerCarre(int n){
        return n*n;
    }

    // 2. Parite
    public static void  estPair(int n){
        if (n%2 == 0) {
            System.out.println("Le nombre "+n+" est pair");
        }else{
            System.out.println("Le nombre "+n+" est impair");
        }
    }

    // 3. maximum des deux
    public static int max(int a, int b){
        if (a > b) {
            return a;
        } else{
            return b;
        }
    }

    // 4. Perimetre rectangle
    public static double calculerPerimetreRectangle(double longueur, double largeur){
        return (longueur+largeur)*2;
    }

    public static void main(String[] args) {
        // Ici est reserve pour les test

        // 1. test carre
        System.out.println("Le carre de 4 est : "+ calculerCarre(4));

        // 2. Test Pair
        estPair(24);

        // 3. test max
        int maximum = max(4, 9);
        System.out.println("Le plus grand entre 4 et 9 est: "+ maximum);

        // Test perimetre rectangle
        double peri = calculerPerimetreRectangle(24, 45);
        System.out.println("Le perimetre d'un rectangle lon de 24m et large de 45 m est: "+ peri);
    }
}
