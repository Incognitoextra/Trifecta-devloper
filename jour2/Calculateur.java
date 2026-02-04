import java.util.Scanner;


public class Calculateur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. Demander montant initial en HTG
        System.out.print("==== ENTRER LE MONTANT INITIAL (en HTG): "); 
        int montant = scanner.nextInt();
        // 2. Demander taux USD (ex: 132.5)
        System.out.print("==== ENTRER LE TAUX USD: ");
        double taux = scanner.nextDouble();
        // 3. Calculer valeur en USD
        double USD = montant / taux;
        // 4. Appliquer commission de 2%
        double commission = montant * 0.02;
        // 5. Calculer montant net en HTG
        double net = montant - commission;
        // 6. Afficher tous les résultats
        System.out.println("Montant en gourdes: " + montant + " HTG");
        System.out.println("Montant en dollars: " + USD + " USD");
        System.out.println("Comission de 2%: " + commission + " HTG");
        System.out.println("Montant Net: " + net + " HTG");

        scanner.close();
    }
}
