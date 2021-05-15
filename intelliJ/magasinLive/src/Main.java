public class Main {
        public static void main(String[] args) {

            Produit anans = new Produit("Ananas", 2, 3);

            System.out.println(anans);

            Magasin m = new Magasin("MAXI", 100, 2);

            m.addProduit("ananas", 3,4);

            System.out.println(m);


        }
    }
