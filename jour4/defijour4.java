package jour4;
import java.util.Scanner;
public class defijour4 {
    public static void main(String[] args) {
        // 1. Demander le revenu MENSUEL en HTG
        // 2. Calculer le revenu ANNUEL
        // 3. Calculer l'impôt par tranche
        // 4. Afficher un tableau détaillé
        // 5. Afficher les résultats finaux

        Scanner sc = new Scanner(System.in);

        // LES TRANCHES
        final double TRANCHE1_MAX = 60000;
        final double TRANCHE2_MAX = 240000;
        final double TRANCHE3_MAX = 480000;
        final double TRANCHE4_MAX = 900000;

        // LES TAUX D'IMPOT
        final double TAUX_TRANCHE1 = 0; 
        final double TAUX_TRANCHE2 = 0.1; 
        final double TAUX_TRANCHE3 = 0.15; 
        final double TAUX_TRANCHE4 = 0.2; 
        final double TAUX_TRANCHE5 = 0.25; 

        // On demande le revenu mensuel et o calcule le revenu annuel
        System.out.println("=== CALCULATEUR D'IMPOT HAITIEN 2026 === \n");

        System.out.print("Entrer le revenu mensuel: ");
        double revenuMensuel = sc.nextInt();
        double revenuAnnuel = revenuMensuel * 12;

        System.out.println("Revenu mensuel : "+ String.format("%.2f", revenuMensuel));
        System.out.println("Revenu Annuel : "+ String.format("%.2f", revenuAnnuel)+"\n");
        System.out.println("DETAILS DU CALCUL");

        // Calcul des tranches
        double impot = 0;
        double revenuRestant = revenuAnnuel;
        double impotAnnuel = 0;
        double impotMensuel = 0 ;
        double salaireNetAnnuel = 0;
        double salaireNetMensuel = 0;
        double tauxImposition = 0;
        double totalImpot = 0;
        double baseTranche = 0;
        double impotTranche = 0;

        // Tranche 1 (0 - 60,000 HTG) : 0%
        if (revenuRestant > 60000) {
            baseTranche = 60000;
        } else {
            baseTranche = revenuRestant;
        }
        System.out.printf("Tranche 1 (0 - 60k)    : 0%%  sur %,10.2f = 0.00 HTG%n", baseTranche);
        revenuRestant -= baseTranche;

        // Tranche 2 (60,001 - 240,000 HTG) : 10%
        if (revenuRestant > 0) {
            double plafondTranche2 = 240000 - 60000; // soit 180,000
            if (revenuRestant > plafondTranche2) {
                baseTranche = plafondTranche2;
            } else {
                baseTranche = revenuRestant;
            }
            impotTranche = baseTranche * TAUX_TRANCHE2;
            totalImpot += impotTranche;
            revenuRestant -= baseTranche;
            System.out.printf("Tranche 2 (60k - 240k) : 10%% sur %,10.2f = %,10.2f HTG%n", baseTranche, impotTranche);
        }

        // Tranche 3 (240,001 - 480,000 HTG) : 15%
        if (revenuRestant > 0) {
            double plafondTranche3 = 480000 - 240000; // soit 240,000
            if (revenuRestant > plafondTranche3) {
                baseTranche = plafondTranche3;
            } else {
                baseTranche = revenuRestant;
            }
            impotTranche = baseTranche * TAUX_TRANCHE3;
            totalImpot += impotTranche;
            revenuRestant -= baseTranche;
            System.out.printf("Tranche 3 (240k - 480k): 15%% sur %,10.2f = %,10.2f HTG%n", baseTranche, impotTranche);
        }

        // Tranche 4 (480,001 - 900,000 HTG) : 20%
        if (revenuRestant > 0) {
            double plafondTranche4 = 900000 - 480000; // soit 420,000
            if (revenuRestant > plafondTranche4) {
                baseTranche = plafondTranche4;
            } else {
                baseTranche = revenuRestant;
            }
            impotTranche = baseTranche * TAUX_TRANCHE4;
            totalImpot += impotTranche;
            revenuRestant -= baseTranche;
            System.out.printf("Tranche 4 (480k - 900k): 20%% sur %,10.2f = %,10.2f HTG%n", baseTranche, impotTranche);
        }

        // Tranche 5 (> 900,000 HTG) : 25%
        if (revenuRestant > 0) {
            impotTranche = revenuRestant * TAUX_TRANCHE5;
            totalImpot += impotTranche;
            System.out.printf("Tranche 5 (> 900k)     : 25%% sur %,10.2f = %,10.2f HTG%n", revenuRestant, impotTranche);
        }

        salaireNetAnnuel = revenuAnnuel - totalImpot;
        double tauxEffectif = (totalImpot / revenuAnnuel) * 100;

        System.out.println("\n================ RESULTATS ================");
        System.out.printf("IMPÔT TOTAL ANNUEL : %,10.2f HTG%n", totalImpot);
        System.out.printf("IMPÔT MENSUEL      : %,10.2f HTG%n", (totalImpot / 12));
        System.out.printf("SALAIRE NET MENSUEL: %,10.2f HTG%n", (salaireNetAnnuel / 12));
        System.out.printf("TAUX RÉEL D'IMPÔT  : %.2f%%%n", tauxEffectif);
        
    }
}
