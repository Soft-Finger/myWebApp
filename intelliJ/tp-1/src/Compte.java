public class Compte {
    private static int lastAccountId = 21;
    private int accountId;
    private Client client;
    private double balance;

    public Compte(Client client, double balance) {
        lastAccountId++;
        accountId = lastAccountId;
        this.client = new Client();
        this.balance = balance;
    }

    public Client getClient(Client cl) {
        return this.client = cl;
    }

    public int getAccountId() {
        return this.accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double balance) {
        this.balance += balance;
    }

    public void withdraw(double amount, Compte compte) {
        String name = this.client.getClass().getName();

        if (this.balance < 100) {
            System.out.println("Solde insuffisant pour effectuer un retrait !" + client.getClientId());
        } else {
            this.balance -= amount;
        }
        System.out.println("---");
        System.out.println("compte: #1478" + getAccountId());
        System.out.println("Solde: " + getBalance());
    }


    public void displayAccount() {
        System.out.println();
    }

    @Override
    public String toString() {
        return "Compte{" +
                "accountId = " + accountId +
                ", client = " + client + client.getFirstname() + client.getLastName() +
                ", balance = " + balance +
                '}';
    }
}



