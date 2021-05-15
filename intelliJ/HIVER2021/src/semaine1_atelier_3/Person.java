package semaine1_atelier_3;

import org.w3c.dom.ls.LSOutput;

public class Person {
    String firstName;
    String lastName;
    int age;
    String address;

    Person() {
        this("James", "Bond", 35, "007 rue des Espions" );
    }

    Person(String firstName, String lastName, int age, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }

    public  void afficher() {System.out.println(this);}

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    boolean isOlder(Person p) {
     return    (this.getAge() > p.getAge()) ? true : false ;
    }

    /*boolean compare(Person person) {
        Person p = new Person();
        for(int i = 0; i < p.get)
    }*/


    public String toString() {
        return
                "firstName = '" + getFirstName() + '\'' + "\n" +
                "lastName = '" + getLastName() + '\'' + "\n" +
                "age = " + getAge() + "\n" +
                "address = '" + getAddress() + '\'' + "\n";
    }
}
