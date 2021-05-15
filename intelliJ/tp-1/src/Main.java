public class Main {
    public static void main(String[] args) {
        Client cl1 = new Client(
                "M.",
                "Ned",
                "Stark",
                1992,
                "42, rue des oliviers" ,
                "Montréal, QC, K1M 2H2",
                "223-309-202");

        Client cl2 = new Client(
                "Mrs.",
                "Cersei",
                "Lanister",
                1990,
                "15, rue de Westeros" ,
                "Castral Rock, QC, K1M 2H2",
                "514-2402-34");

        Compte account1 = new Compte(cl1, 503);

        //System.out.println(cl1);
        System.out.println(account1.getClient(cl1));
        account1.withdraw(25, account1);


        System.out.println("==============");
        //System.out.println(cl2);

        //cl2.display();
        //System.out.println("==============");

       /* Compte x = new Compte(new Client(), 6000 );
       // x.deposit(5000);
        x.withdraw(4000, x);

        System.out.println(x.getBalance());*/
    }
}
