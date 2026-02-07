package jour4.exercices;
import java.util.Scanner;

public class Exo4 {
    public static void main(String[] args) {
        // Convertir une note sur 100 en lettre :
        // - 90-100 : A
        // - 80-89 : B
        // - 70-79 : C
        // - 60-69 : D
        // - <60 : F
        // Ajouter "+" si note finit par 7-9, "-" si 0-2

        Scanner sc = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("Conertisseur de note");
        System.out.println("==========================================");

        System.out.println("Entrer la note (sur 100)");
        int note = sc.nextInt();
        String noteConverti = "";
        if (note < 0 && note > 100) {
            System.out.println("Note invalide");
        } else if(note >= 93 && note<=96){
            noteConverti = "A";
        } else if(note >=97){
            noteConverti = "A+";
        } else if(note >= 92){
            noteConverti = "A-";
        } else if(note >= 83 && note <= 86){
            noteConverti = "B";
        } else if(note >= 87){
            noteConverti = "B+";
        } else if(note <= 82){
            noteConverti = "B-";
        }else if (note >= 73 && note <= 76){
            noteConverti = "C";
        } else if(note >= 77){
            noteConverti = "C+";
        } else if(note <= 72){
            noteConverti = "C-";
        } else if (note >= 60 && note <= 69){
            noteConverti = "D";
        } else{
            noteConverti = "F";
        }

        System.out.println("Vous avez eu un : "+noteConverti);
        sc.close();
    }
}
