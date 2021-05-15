package simulate.toater;

public class Main {
    public static void main(String[] args) {
        Toaster twoSlot = new Toaster(2, 10);
        Toaster euroFour = new Toaster(4, 220);

        twoSlot.getPower().turnOn();
        twoSlot.getDarkness().setSetting(4);
        twoSlot.insertBread(1);

        System.out.println(twoSlot);
        System.out.println(euroFour);
    }

}
