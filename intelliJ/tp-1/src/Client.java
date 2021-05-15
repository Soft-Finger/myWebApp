public class Client {
    private int clientId;
    private String title;
    private String firstname;
    private String lastName;
    private int birthYear;
    private String streetNumber;
    private String zipCode;
    private String phoneNumber;
    private static int lastClientIdenfier;
    private Compte compte;

    static {
        lastClientIdenfier = 0;
    }


    public Client(
            String title,
            String firstname,
            String lastName,
            int birthYear,
            String streetNumber,
            String zipCode,
            String phoneNumber) {

        lastClientIdenfier++;
        this.clientId = lastClientIdenfier;
        this.title = title;
        this.firstname = firstname;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.streetNumber = streetNumber;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
    }

    public Client() {

    }

    public int getClientId() {
        return clientId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void display(){
        System.out.printf("No. %05d \n %s \n %s \n %s \n %d \n %s \n %s \n %s \n", this.clientId, this.title, this.firstname,
                this.lastName, (2021 - birthYear), this.streetNumber, this.zipCode, this.phoneNumber );
    }

    public String toString() {
        return
                "No. 0000" + clientId + "\n" +
                title + " " + firstname + " " + lastName + "\n" +
                        (2021 - birthYear) + "\n" +
                        streetNumber + "\n" +
                        zipCode + "\n" +
                phoneNumber;
    }
}
