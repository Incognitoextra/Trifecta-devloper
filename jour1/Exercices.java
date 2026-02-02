public class Exercices {
    public static void main(String[] args) {
        // Exercice 1: Calcul de surface
        int longueur = 24 ;
        int largeur = 67;
        int surface = largeur * longueur;
        System.out.println("Calcul surface Rectangle");
        System.out.println("Largeur du rectangle: " + largeur);
        System.out.println("Longueur du rectangle: " + longueur);
        System.out.println("Surface du rectangle: " + surface);
        System.out.println("=*=*=*===============================*=*=*=");

        // Exercie 2: Conversion de monnaies
        double gourdes = 50000;
        double taux = 130.7;
        double dollars = gourdes / taux;
        System.out.println("Conversion de gourdes en dollars");
        System.out.println("Gourdes: "+ gourdes +" gdes");
        System.out.println("Taux: "+ taux +" gdes");
        System.out.println("Dollars: "+ dollars +" USD");
        System.out.println("=*=*=*===============================*=*=*=");

        // Exercice 3: Rotation triangulaire
        int a= 12 , b= 10 , c=20; 
        a = a + b +c;
        b = a - (b+c);
        c = a - (b+c);
        a = a - (b+c);
        System.out.println("Rotation triangulaire entre 3 variables");
        System.out.println("a = " +a);
        System.out.println("b = " +b);
        System.out.println("c = " +c);
        System.out.println("=*=*=*===============================*=*=*=");
        
        // Exercice 4: Calcul d'interet
        double capitalInitial = 100;
        double interet = 0.2;
        double inflation = 0.12;
        int annee = 10;
        double gain_nominal = capitalInitial * (1 + interet);
        double interetReel= (1+interet)/(1+inflation)-1;
        double gainReel = capitalInitial * (1 + interetReel);
        double valeurMensuelle = gainReel / (annee*12);
        System.out.println("EXERCICE 4: CALCUL D'INTERET");
        System.out.println("Capital initial: " + capitalInitial);
        System.out.println("Taux d'interet: " +interet);
        System.out.println("Taux d'inflation: " +inflation);
        System.out.println("Nombre d'annees: " + annee);
        System.out.println("Gain nominal: " + gain_nominal);
        System.out.println("Gain Reelle: " + gainReel);
        System.out.println("Valeur moyenne par mois: " + valeurMensuelle);
        System.out.println("=*=*=*===============================*=*=*=");

        // Exercice 5: Calcul pourcentage
        double nombre = 50000;
        double percent = 15;
        double pourcentage = nombre * (percent/100);
        System.out.println("EXERCICE 5: CALCUL POURCENTAGE NOMBRE");
        System.out.println("Nombre initial: " + nombre);
        System.out.println("Pourcentage: " + percent);
        System.out.println("Pourcentage du nombre: " + pourcentage);
        System.out.println("=*=*=*===============================*=*=*=");

        // Exercice 6: Division avec reste
        int dividande = 256;
        int diviseur = 25;
        double quotient = dividande / diviseur;
        double reste = dividande - (diviseur * quotient);
        System.out.println("EXERCICE 6: DIVISION AVEC RESTE");
        System.out.println("Dividande: " + dividande);
        System.out.println("Diviseur: " + diviseur);
        System.out.println("Quotient: " + quotient);
        System.out.println("Reste: " + reste);
        System.out.println("=*=*=*===============================*=*=*=");

       //Exercice 7:  Calcul de temps
       int minutes = 135;
       int heures = minutes / 60;
       int resteMinute = minutes - (heures*60);
       System.out.println("EXERCICE 7: CALCUL DE TEMPS");
       System.out.println("Nombre de minutes: " + minutes);
       System.out.println("Equivalent: " + heures + "heures et " + resteMinute + " minutes");
       System.out.println("=*=*=*===============================*=*=*=");

       // Exercice 8: Calcul de moyenne
       double Maths = 70;
       double Francais = 26;
       double Physique = 55;
       double moyenne = (Maths + Francais + Physique)/ 3;
       System.out.println("EXERCICE 8: CALCUL DE MOYENNE");
       System.out.println("Maths: " + Maths);
       System.out.println("Francais: " + Francais);
       System.out.println("Physique: " + Physique);
       System.out.println("Moyenne Generale: " + moyenne);
       System.out.println("=*=*=*===============================*=*=*=");


   
    }
}
