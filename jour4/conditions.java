package jour4;

public class conditions {
    public static void main (String[] args){
        // Ici on va apprendre les structures conditionnelles.
        /*
           les structures conditionnelles sont des bouts de codes qui ne s'executent que dans
           des cas particuliers. C'est comme si x remplit telle condition alors fait telle 
           ou telle chose. On distance:
              1. La structure IF: si x remplit telle condition fait telle chose
        */

        System.out.println("===========================================");
        System.out.println("IF POUR DIRE SI \n");
        int age = 18; 
        System.out.println("Soit age = "+age);
        if (age > 10){
            System.out.println("Tu as plus de 10 ans");
        }

        /*
             2.La structure IF/ELSE: Si x remplit telle condition faiit ceci sinon
               on fait cela.
        */

        System.out.println("\n");
        System.out.println("===========================================");
        System.out.println("IF/ELSE POUR DIRE SI ET SINON \n");
        int nombre = 45;
        if (nombre <= 45) {
            System.out.println("Le nombre est inferieur a 45");
        } else {
            System.out.println("Le nombre est superieur a 45");
        }

        /*
             3.La structure IF/ELSE-ELSE...: Au cas il y aurait plusieurs conditions 
        */

        System.out.println("\n");
        System.out.println("===========================================");
        System.out.println("IF-ELSE / IF-ELSE POUR DIRE SI SINON SI \n");
        int exemple = 13;
        if (exemple > 2) {
            System.out.println("L'exemple est superieur a 2");
        } else if(exemple > 5){
            System.out.println("L'exemple est superieur a 5");
        } else if(exemple > 7){
            System.out.println("L'exemple est superieur a 7");
        } else{
            System.out.println("L'exemple est superieur a 10");
        }

        /*
            4. lA STRUCTURE COMPOSEE: Au cas ou un code doit s'executer apres plusieurs conditios
        */

        System.out.println("\n");
        System.out.println("===========================================");
        System.out.println("PLUSIEURS CONDITIONS \n");
        int solde = 5000;
        int annee = 2004;
        if (solde > 2000 && annee > 2000){
            System.out.println("Vous etes elligible");
        }

        /*
            5. La stucture ternaire(condition compacte): 
            Syntaxe : condition ? valeur_si_vrai : valeur_si_faux
        */

        System.out.println("\n");
        System.out.println("===========================================");
        System.out.println("Condition Compacte \n");
        String message = (age>=18) ? "Majeur" : "Mineur";
        System.out.println(message);
    }

    // Avec ca on a fait le tour des structures conditionelles
    
}
