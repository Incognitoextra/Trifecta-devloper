package jour6.Exercices;

public class Exo1 {
    public static void main(String[] args) {
        // Étant donné un tableau de températures quotidiennes
        // Calculer et afficher :
        // 1. La température moyenne
        // 2. La température maximale
        // 3. La température minimale
        // 4. Le nombre de jours au-dessus de 30°C

        double[] temperatures = {28.5, 30.2, 29.8, 31.0, 27.5, 26.8, 29.3};
        // Temperature moyenne
        double somme = 0;
        for (int i = 0; i < temperatures.length; i++) {
            somme = somme + temperatures[i];
        }
        double moyenne = somme / temperatures.length;

        // Temperature maximale 
        double tempMax = 22;
        for (int i = 0; i < temperatures.length; i++) {
            if (temperatures[i] > tempMax) {
                tempMax = temperatures[i];
            }
        }

        // Temperature minimale
        double tempMin = 33;
        for (int i = 0; i < temperatures.length; i++) {
            if (temperatures[i] < tempMin) {
                tempMin = temperatures[i];
            }
        }

        // Nombre de jour au dessus de 30 C
        int compteur = 0;
        for (int i = 0; i < temperatures.length; i++) {
            if (temperatures[i] > 30.0) {
                compteur = compteur++;
            }
        }

        // Resultat final
        System.out.println("=== RESULTATS FINAUX ===");
        System.out.println("  1. Temperature moyenne : "+ String.format("%.2f",moyenne) +"°C");
        System.out.println("  2. Temperature maximale : "+ tempMax +"°C");
        System.out.println("  3. Temperature minimale : "+ tempMin +"°C");
        System.out.println("  4. Nombre de jours au dessus de 30°C : "+ compteur +"°C");
    }
}
