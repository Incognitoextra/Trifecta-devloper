package jour7.exercices;

public class Exo2 {
    // Créer une méthode de conversion pour :
    // 1. celsiusVersFahrenheit(celsius)
    // 2. htgVersUsd(htg) avec taux fixe
    // 3. piedsVersMetres(pieds)
    // 4. minutesEnHeuresMinutes(minutes) qui retourne un String "Xh Ymin"

    // 1. Conversion de temperature
    public static double celsiusVersFahrenheit(double celcius){
        double fahrenheit = celcius * 9/5 + 32;
        return  fahrenheit;
    }

    // 2. Conversion gourdes en dollars
    public static double  htgVersUsd(double htg){
        double usd = htg / 132.5;
        return usd;
    }
    public static void main(String[] args) {
        
    }
}
