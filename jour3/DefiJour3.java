package jour3;

public class DefiJour3{
    public static void main(String[] args) {
        //Libelle: cCreer un programme qui calcule le budget mensuel d'une fammille haitienne moyenne
        // avec plusieurs categories de depenses.

        //  REVENUS
        double salairePrincipal = 35000.0;
        double salaireSecondaire = 15000.0;
        double autresRevenus = 5000.0;

        // Depenses fixes (mensuelles)
        final double loyer = 12000.0;
        final double electricite = 5000.0;
        final double eau = 1500.0;
        final double transport = 8000.0;
        final double communication = 3000.0;

        // depenses variables
        double nourriture = 20000.0;
        double sante = 4000.0;
        double education = 6000.0;
        double autres = 5000.0;

        /*
            Calculez le revenu total
            Calculez les dépenses totales
            Calculez l'économie (ou déficit) mensuelle
            Calculez le pourcentage de chaque catégorie par rapport aux dépenses totales
            Affichez un tableau récapitulatif
        */

        // CALCULS
        double revenuTotal = salairePrincipal + salaireSecondaire + autresRevenus;
        double percentSP = (salairePrincipal / revenuTotal) * 100;
        double percentSec = (salaireSecondaire / revenuTotal) * 100;
        double percentAR = (autresRevenus / revenuTotal) * 100;

        double depensesTotales = loyer + electricite + eau + transport + communication + nourriture + sante + education + autres;
        double percentLoyer = (loyer / depensesTotales) * 100;
        double percentElectricite = (electricite / depensesTotales) * 100;
        double percentEau = (eau / depensesTotales) * 100;
        double percentTransport = (transport / depensesTotales) * 100;
        double percentCommunication = (communication / depensesTotales) * 100;
        double percentNourriture = (nourriture / depensesTotales) * 100;
        double percentsante = (sante / depensesTotales) * 100;
        double percentEducation = (education / depensesTotales) * 100;
        double percentAutres = (autres / depensesTotales) * 100;

        double solde = revenuTotal - depensesTotales;
        double rapport = (revenuTotal/depensesTotales)*100;
        
        System.out.println("=".repeat(50));
        System.out.println("=== BUDGET MENSUEL FAMILLE HAITIENNE === \n");
        System.out.println("=".repeat(50));
        System.out.println("REVENUS TOTAUX : "+String.format("%.2f",revenuTotal)+" HTG ");
        System.out.println("- Salaire principal : "+String.format("%.2f",salairePrincipal)+" HTG"+" ("+String.format("%.2f", percentSP)+"%)");
        System.out.println("- Salaire secondaire : "+String.format("%.2f",salaireSecondaire)+" HTG"+" ("+String.format("%.2f", percentSec)+"%)");
        System.out.println("- Autres revenus : "+String.format("%.2f",autresRevenus)+" HTG"+" ("+String.format("%.2f", percentAR)+"%) \n");
        System.out.println("DEPENSES TOTALES: "+String.format("%.2f",depensesTotales)+" HTG ");
        System.out.println("- Loyer : "+String.format("%.2f",loyer)+" HTG"+" ("+String.format("%.2f", percentLoyer)+"%)");
        System.out.println("- Electricite : "+String.format("%.2f",electricite)+" HTG"+" ("+String.format("%.2f", percentElectricite)+"%)");
        System.out.println("- Nourriture : "+String.format("%.2f",nourriture)+" HTG"+" ("+String.format("%.2f", percentNourriture)+"%)");
        System.out.println("- Eau : "+String.format("%.2f",eau)+" HTG"+" ("+String.format("%.2f", percentEau)+"%)");
        System.out.println("- Transport : "+String.format("%.2f",transport)+" HTG"+" ("+String.format("%.2f", percentTransport)+"%)");
        System.out.println("- Communication : "+String.format("%.2f",communication)+" HTG"+" ("+String.format("%.2f", percentCommunication)+"%)");
        System.out.println("- Sante : "+String.format("%.2f",sante)+" HTG"+" ("+String.format("%.2f", percentsante)+"%)");
        System.out.println("- Education : "+String.format("%.2f",education)+" HTG"+" ("+String.format("%.2f", percentEducation)+"%)");
        System.out.println("- Autres depenses : "+String.format("%.2f",autres)+" HTG"+" ("+String.format("%.2f", percentAutres)+"%) \n");
        System.out.println("SOLDE MENSUEL : "+String.format("%.0f", solde));
        System.out.println("Rapport depenses/revenus : "+String.format("%,.0f", rapport)+"%");

    }
}