package jour5.exercices;
import java.util.Scanner;
public class Exo6 {
    public static void main(String[] args) {
        // Menu restaurant avec plusieurs plats
        // Permettre d'ajouter des plats jusqu'à ce que l'utilisateur dise "stop"
        // Calculer le total, ajouter 10% de service et 10% de TVA
        // Afficher le détail et le total à payer

        Scanner sc1 = new Scanner(System.in);   
        Scanner sc2 = new Scanner(System.in);   
        Scanner sc3 = new Scanner(System.in);   

        double total = 0; 
        double service = 0.1;
        double TVA = 0.1;

        do {
            System.out.println("1. Ajouter un plat");
            System.out.println("2. Faire l'addition");
            System.out.println("Faites un choix: ");
            int choix = sc3.nextInt();
            switch (choix) {
                case 1:
                    System.out.print("Entrer le nom du plat: ");
                    String nom = sc1.next();
                    System.out.print("Entrer le prix du plat: ");
                    double prix = sc2.nextDouble();

                    total = total + prix;
                    break;
            
                default:
                    break;
            }
            
        } while (condition);
    }
}
