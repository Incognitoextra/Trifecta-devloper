package jour4.exercices;
import java.util.Scanner;
public class Exo2 {
    public static void main(String[] args) {
        // Un magasin offre des réductions :
        // - 10% si achat > 5000 HTG
        // - 15% si achat > 10000 HTG
        // - 20% si achat > 20000 HTG
        // Calculez le prix final
        Scanner scanner = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("Calcul de reduction");
        System.out.println("====================================== \n");

        System.out.print("Entrer le pris d'achat: ");
        int achat = scanner.nextInt();
        double reduc = 0;
        if (achat > 5000 && achat < 10000) {
            reduc = 0.1;
        } else if(achat>10000 && achat < 20000){
            reduc = 0.15;
        }else {
            reduc = 0.2;
        }

        double prixFinal = achat - (achat * reduc);
        System.out.println("Le prix final devient : "+prixFinal+" apres une reduction de: "+reduc+"%");

        scanner.close();
    }
}
