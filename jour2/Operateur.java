public class Operateur {
    public static void main(String[] args){
        // Ici on va apprendre les differents operateur de calculs utilises en Java
        /*
        +  pour l'addition
        *  pour la multiplication
        -  pour la soustraction
        /  pour la division
        %  modulo(reste de la division euclidiene)
        ++ Pour l'incrementation
        -- pour la decrementation
        */

        int a = 22;
        int b = 88;
        int c = 100;

        int somme = a + b;
        int difference = b - a;
        int produit = a * b;
        int quotient = b / a;
        int reste = c % a;
        int incrementation = a++;
        int decrementation = a--;
        System.out.println("lES OPERATEURS ARITHMETIQUES");
        System.out.println(" Soient les nombres: a = " + a + ", b = " + b + " et c = " + c);
        System.out.println("L'addition de a + b vaut : " + somme);
        System.out.println("La difference de b - a vaut : " + difference);
        System.out.println("Le produit de a * b vaut : " + produit);
        System.out.println("Le quotient de b / a vaut : " + quotient);
        System.out.println("Le reste de la division de c / a vaut : " + reste);
        System.out.println("L'incrementation de a ++ vaut : " + incrementation);
        System.out.println("La decrementation de a -- vaut : " + decrementation);
        System.out.println("==================================================");
        
        int resultat1 = 10/3;
        double resultat2 = 10/3;
        double resultat3 = 10.0/3;
        // Il ya ue difference entre l'insertion des nombres lors des  divisions entieres et divisions decimales
        System.out.println("DIVISION ENTIERE ET DECIMALES");
        System.out.println("int resultat1 = 10/3; = " + resultat1);
        System.out.println("double resultat2 = 10/3; = " + resultat2);
        System.out.println("double resultat3 = 10.0/3; = " + resultat3);
        System.out.println("==================================================");

        /*
        Raccourci utiles:
            += : x = x + 5 → x += 5
            -= : x = x - 3 → x -= 3
            *= : x = x * 2 → x *= 2
            /= : x = x / 2 → x /= 2
            %= : x = x % 3 → x %= 3
         */
         System.out.println("RACCOURCI DE CALCUL");
         int x = 10;
         System.out.println("Soit X = " + x);
         int add = x += 5;
         System.out.println("Ajout rapide: x += 5 = " + add);
         int less = x -= 3;
         System.out.println("Reduc rapide: x -= 3 = " + less);
         int by = x *= 3;
         System.out.println("Multiplication rapide: x -= 3 = " + by);
         int divide = x /= 2;
         System.out.println("Division rapide: x -= 3 = " + divide);
         int mod = x %= 3;
         System.out.println("Reste rapide: x -= 3 = " + mod);
         System.out.println("==================================================");

        // Notions de priorites
        /* 
           A savoir
           En programmation les memes notions de priorites en mathematiques s'appliquent
              1. Multiplication et division
              2. Parentheses
              3. Addition et soustractions
         */
    }
}