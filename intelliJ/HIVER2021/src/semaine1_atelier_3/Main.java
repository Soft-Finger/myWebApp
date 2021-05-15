package semaine1_atelier_3;

public class Main {
    public static void main(String[] args) {
       Person john = new Person();
        System.out.println(john);
        Person p1 = new Person("Ned", "Stark", 40, "2020 rue Westeros");
        Person p2 = new Person("Ned", "Stark", 40, "2020 rue Westeros");
        Person p3 = new Person("Joffrey", "Baratheon", 18, "20 rue CastralRock");

        //System.out.println(p1.compare(p3));

        System.out.println(p1.isOlder(p3));


        }
    }

