public class defiJour {
    public static void main(String[] args) {
        // Calculateur de salaire Net
        // Salaire brut en gourdes
        double salaireBrut = 50000.0;
        
        // Taux de déductions (exemples)
        double tauxRetraite = 0.03;  // 3%
        double tauxSante = 0.02;     // 2%
        
        // Calculs
        double deductionRetraite = salaireBrut * tauxRetraite;
        double deductionSante = salaireBrut * tauxSante;
        double salaireNet = salaireBrut - deductionRetraite - deductionSante;
        
        // Affichage détaillé
        System.out.println("=== CALCUL SALAIRE ===");
        System.out.println("Salaire brut : " + salaireBrut + " HTG");
        System.out.println("Retraite (3%) : " + deductionRetraite + " HTG");
        System.out.println("Santé (2%) : " + deductionSante + " HTG");
        System.out.println("Salaire net : " + salaireNet + " HTG");
        System.out.println("======================");
    }
}
