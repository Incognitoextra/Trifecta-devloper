package jour7;

public class methode {

    // A partir de maintenant on va commencer a utiliser les methodes
        /*
              Les methodes sont des structures de codes qui permettent de diviser le travail en plusieurs partide 
              De cette facon quand on a un meme travail a faire plusieurs fois on n'a pas besoin d'ecrire les memes
              instructions plusieurs fois. Il nous suffit alors de faire appel a la fonction qu'on a cree.


              1. DECLARATION D'UNE METHODE EN JAVA
                modificateur typeRetour nomMethode(paramètre1, paramètre2, ...) {
                  corps de la méthode
                return valeur;  // si typeRetour n'est pas void
                }   
        */
        // Exemple de methode sans retour (void)
        public static void afficherMessage(){
                System.out.println("Bonjour, ce message est affiche grace a une methode");
        }

        // Exemple de methode avec retour
        public static int addition(int a, int b){
            return a+b;
        }

        // Exemple de methode avec plusieurs parametres 
        public static double calculerMoyenne(double note1, double note2, double note3) {
            return (note1 + note2 + note3) / 3;
        }

        // On parle de surchage de methode quand on a plusieurs methodes avec le meme nom ayant des parametres differents
        public static int additionner(int a, int b) {
            return a + b;
        }

        public static double additionner(double a, double b) {
            return a + b;
        }

        public static int additionner(int a, int b, int c) {
            return a + b + c;
        }

    public static void main(String[] args) {

        // Dans la methode main on va faire l'appel de nos methodes
        // Méthode sans retour
        afficherMessage();

        // Méthode avec retour (stocker ou utiliser le résultat)
        int somme = addition(5, 3);
        System.out.println("Somme : " + somme);

        // Utilisation directe
        System.out.println("Moyenne : " + calculerMoyenne(15, 18, 12));

        // Pour les methodes on droit apprendre a faire la difference entre deux types de variables. 
        /*
            1.  les vrables globales: Les variables locales sont les variables que l'on declare a l'interieur 
                de la methode.De ce fait ils n'existent qu'a l'interieur de la methode
            2.  Les variables globales: Les variables globales sont toutes les autres variables declarees dans 
                le programmes
        */

        /*

        Nota Bene:
            // MAUVAIS
            public static void f1(int x) {...}

            // BON
            public static double calculerMoyenne(double[] notes) {...}

            // MAUVAIS - fait trop de choses
            public static void traiterUtilisateur() {
                // 1. Demander nom
                // 2. Valider nom
                // 3. Sauvegarder dans DB
                // 4. Envoyer email
                // 5. Générer rapport
            }

            // BON - chaque méthode a un rôle clair
            public static String demanderNom() {...}
            public static boolean validerNom(String nom) {...}
            public static void sauvegarderUtilisateur(String nom) {...}

            une methode doit tenir sur l'ecran en 20 lignes max
            sinon decouper en sous methodes
        */
    }
}
