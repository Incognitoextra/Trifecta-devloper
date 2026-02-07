package jour4.exercices;
import java.util.Scanner;
public class Exo1 {

    public static void main(String[] args) {
        // Demandez l'âge d'une personne et affichez :
        // - "Enfant" si < 12
        // - "Adolescent" si 12-17
        // - "Adulte" si 18-64
        // - "Senior" si 65+
        Scanner scanner = new Scanner(System.in);

        System.out.println("=====================================");
        System.out.println("Verification d'age");
        System.out.println("===================================== \n");
        System.out.print("Entrer l'age de la personne: ");
        int age = scanner.nextInt();
        if (age < 12){
            System.out.println("Enfant");
        } else if(age >= 12 && age <= 17){
            System.out.println("Adolescent");
        } else if (age >= 18 && age <= 64){
            System.out.println("Adulte");
        } else{
            System.out.println("Senior");
        }

        scanner.close();;
    }
}
