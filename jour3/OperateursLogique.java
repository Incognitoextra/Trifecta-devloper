package jour3;
public class OperateursLogique{
    public static void main(String[] args) {
        // On va apprendre a utiliser les operateurs logiques
        // ON COMMENCE AVEC LES OPERATEUR D'INCREMENTATION/DECREMENTATIION
        System.out.println("Operateurs de comparaison");
        int i = 10;
        System.out.println("Valeur initiale de i: "+ i);
        int preincrement = ++i; // l'incementation vient en avant
        System.out.println("Preincrementation de i (++i): "+ preincrement +" et i = "+ i);
        int postincrement = i++; // l'incrementation vient en arriere
        System.out.println("Postincrementation de i (i++): "+postincrement +" et i = "+ i);
        int predecrement = --i; // la decrementation vient en avant
        System.out.println("Predecrementation de i (--i): "+predecrement +" et i = "+ i);
        int postdecrement = i--; // la decrementation vient en arriere
        System.out.println("Postdecrementation de i(i--): "+postdecrement +" et i = "+ i);
        System.out.println("=========================================================");
        
        // Ensuite les operateurs de comparaisons
        System.out.println("Operateurs de comparaison");
        int a = 10, b = 20;
        System.out.println("Nous avons a = "+a+" et b = "+b);
        boolean egal = (a == b);      // false
        System.out.println("Egalite: "+egal);
        boolean different = (a != b); // true
        System.out.println("Different: "+different);
        boolean plusGrand = (a > b);  // false
        System.out.println("A est plus grand que B: "+plusGrand);
        boolean plusPetit = (a < b);  // true
        System.out.println("A est plus petit que B: "+plusPetit);
        boolean plusGrandEgal = (a >= b); // false
        System.out.println("A est plu grand ou egal a B: "+plusGrandEgal);
        boolean plusPetitEgal = (a <= b); // true
        System.out.println("A est plus petit ou egal a B: "+plusPetitEgal);

        // Et les operateurs logiques
        //  && = ET
        // || = OU
        // ! = non
    }
}