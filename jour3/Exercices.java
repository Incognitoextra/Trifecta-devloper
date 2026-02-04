package jour3;

public class Exercices {
    public static void main(String[] args) {
        System.out.println("EXO 1: Operateurs d'assignation");
        int a = 5, b = 3, c = 2;
        System.out.println("Soient a = "+ a + " b = " + b + " c = " + c);
        a += b*c;
        b -= a/2;
        c *= a+b;
        System.out.println("La valeur de a = "+a);
        System.out.println("La valeur de b = "+b);
        System.out.println("La valeur de c = "+c);
        System.out.println("========================================");

        System.out.println("Exo 2: Incrementattion");
        int x = 10;
        System.out.println("Valeur initiale de X: "+x);
        int y = x++ + ++x - x-- + --x;
        System.out.println("Valeur finale de X = "+ x+" et Y = "+y);
        System.out.println("========================================");

        System.out.println("EXO 3: Expressions Booleenes");
        int age = 25;
        double salaire = 50000;
        boolean condition1 = (age>18) && (salaire<60000);
        boolean condition2 = (age >= 21) || (salaire > 45000);
        boolean condition3 = !(age < 30);
        System.out.println("On a: Age = "+age+" et SALAIRE = "+salaire);
        System.out.println("Condition 1: Age sup. a 18 ET salaire inf. a 60000: "+condition1);
        System.out.println("Condition 2: Age sup.ou egal a 21 OU salaire sup. a 45000: "+condition2);
        System.out.println("Condition 3: Negation de Age inf. a 30: "+condition3);
        System.out.println("========================================");
    }
}
