package jour5;

public class Boucles {
    public static void main(String[] args){
        // Ici on va apprende a utiliser les differentes boucles

    /*  On commence avec la boucle For
        Syntaxe: 
        for (initialisation; condition; incrementation){
            instruction;
        }
    */

    System.out.println("=== Boucle for ===");
    for (int i = 0; i < 10; i++) {
        System.out.println("Iteration for no: "+i);
    }

    /* Boucle while (Tant que)
       While(condition){
          instruction;
          incrementation
       }
    */
    System.out.println("=== Boucle While ===");
    int iteration = 0;
    while (iteration < 10){
        System.out.println("Itreration while no: "+iteration);
        iteration++;
    }

    /* Boucle do-while 
       do {
           instruction;
       } while(condition)
    */

    System.out.println("=== Boucle do-while ===");
    int compteur = 0;
    do {
        System.out.println("Iteration do-while no: "+compteur);
        compteur++;
    } while (compteur <10);
    

    /* NB:
       break; Sort immedaitement de la boucle
       continue; Saute le reste de l'iteration, passe a la suivante
    */

    /*Boucles imbriquees(Matrice)*/

    System.out.println("=== Boucle imbriquee(Multiplication)");
    for (int j = 0; j <=3; j++){
        for (int k=0; k<= 3; k++){
            System.out.println(j + " x " + k + " = "+ (j*k));
        }
    }
   }
}