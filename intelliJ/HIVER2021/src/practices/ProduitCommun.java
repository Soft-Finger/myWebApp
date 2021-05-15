package practices;

public class ProduitCommun {
    public static void main(String[] args) {

        // Création des tableaux "tab1" et "tab2"

        int[] tab1 = {4, 3, 10, 5, 2};
        int[] tab2 = {2, 3, 6, 5, 1, 9, 7};

        // Affichage du contenu tableau "tab1"
        afficheTableau(tab1);

        // Affichage du contenu tableau "tab2"
        afficheTableau(tab2);

        // Calcul de la longueur du tableau le plus court
        int min = tab1.length;
        if (tab2.length < min)
            min = tab2.length;

        // Création du tableau "produit", le produit des éléments de même indice

        int[] produit = new int[min];
        produit = calculProduit(tab1, tab2, min);

        // Création du tableau "commun", un tableau contenant les éléments communs à tab1 et tab2
        int[] commun;
        commun = extraitCommun(tab1, tab2, min);

        // Affichage du contenu des tableaux "produit" et "commun"

        afficheTableau(produit);
        afficheTableau(commun);
    }

    public static void afficheTableau(int[] t) {
        System.out.println();
        for (int i = 0; i < t.length; i++)
            System.out.print(t[i] + " ");
    }

    public static int[] calculProduit(int[] t1, int[] t2, int min) {
        int[] produit = new int[min];
        for (int i = 0; i < min; i++)
            produit[i] = t1[i] * t2[i];
        return produit;
    }

    public static int[] extraitCommun(int[] t1, int[] t2, int min) {
        int memes = 0;
        for (int i = 0; i<min; i++)
            if (t1[i] == t2[i])
                memes++;
        int[] commun = new int[memes];
        memes = 0;
        for (int i=0; i < min; i++)
            if (t1[i] == t2[i]) {
                commun[memes] = t1[i];
                memes++;
            }
        return commun;
    }
}
