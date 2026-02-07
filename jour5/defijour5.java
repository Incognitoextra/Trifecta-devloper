package jour5;

public class defijour5 {
    public static void main(String[] args) {
        // SIMULATEUR D'EPARGNE
        /*
           Créez un simulateur d'épargne qui montre comment un capital grandit avec les intérêts composés mensuels.
            Données :
                Capital initial (en HTG)
                Taux d'intérêt annuel (ex: 12%)
                Durée en mois (ex: 24 mois)
                Éventuellement : dépôt mensuel supplémentaire
            À Calculer :
                Taux d'intérêt mensuel (taux annuel / 12)
                Capital à la fin de chaque mois
                Intérêts gagnés chaque mois
                Total des intérêts
                Capital final
            Formules :
                Intérêts du mois = Capital du mois × Taux mensuel
                Capital suivant = Capital du mois + Intérêts du mois + Dépôt mensuel
        */

        // les variables
        double capitalInitial = 10000;
        double tauxAnnuel = 0.18;
        int duree = 36;
        double depotMensuel = 2000;
        double capital =capitalInitial;
        double interetTot = 0;
        double sommeDepot = depotMensuel * duree;

        System.out.println("MOIS    |   CAPITAL DÉBUT   |    INTÉRÊTS    |     DÉPÔT     |   CAPITAL FIN  ");
        System.out.println("--------|-------------------|----------------|---------------|----------------");
        // les calculs
       // ... (tes variables restent les mêmes)

        double tauxMensuel = tauxAnnuel / 12;

        for (int i = 1; i <= duree; i++) {
            double capitalAvantCalcul = capital; // Pour l'affichage
            double interetMois = capital * tauxMensuel;
            
            // On met à jour le capital : Ancien + Intérêt + Dépôt
            capital = capital + interetMois + depotMensuel;
            
            interetTot += interetMois;

            // Affichage propre
            System.out.printf("%4d    |   %,10.2f HTG  |  %,7.2f HTG   |  %,7.2f HTG |    %,10.2f HTG%n",
            i, capitalAvantCalcul, interetMois, depotMensuel, capital);
        }

        System.out.println("\n==========================================");
        System.out.println("RESULTATS APRES " + duree + " MOIS");
        // Correction ici : printf au lieu de println pour le formatage
        System.out.printf("Capital final         : %,10.2f HTG%n", capital);
        System.out.printf("Total interets gagnes : %,10.2f HTG%n", interetTot);
        System.out.printf("Total deposes         : %,10.2f HTG%n", (capitalInitial + sommeDepot));
        

    }
}
