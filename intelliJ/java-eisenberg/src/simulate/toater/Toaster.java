package simulate.toater;

public class Toaster {
    private int nSlots;
    private int nSlices;
    private PowerSupply power;
    private Dial darkness;

    public Toaster(int nSlots, int nSlices) {
        this.power = new PowerSupply(power.getVoltage());
        this.darkness = new Dial(1, 1, 10);
        this.setNSlots(nSlots);
        this.nSlices = 0;
    }

    public int getnSlots() {
        return nSlots;
    }

    public void setNSlots(int nSlots) {
        this.nSlots = nSlots;
    }

    public int getnSlices() {
        return nSlices;
    }

    public void setNSlices(int nSlices) {
        this.nSlices = Math.min(nSlots, Math.abs(nSlices));
    }

    void insertBread(int n) {
        if(power.getTurnedOn()) {
            setNSlices(nSlices + n);
        }
    }

    void popBread() {
        if(power.getTurnedOn()) {
            setNSlices(0);
        }
    }

    public PowerSupply getPower() {
        return power;
    }

    public void setPower(PowerSupply power) {
        this.power = power;
    }

    public Dial getDarkness() {
        return darkness;
    }

    public void setDarkness(Dial darkness) {
        this.darkness = darkness;
    }

    public String toString() {
        return String.format("%d slot %dV toaster with %d slices%s at darkness %d: %s",
                nSlots, power.getVoltage(),
                nSlices, ((nSlices == 1) ? "" : "s"),
                darkness.getSetting(),
                        ((power.getTurnedOn()) ? "ON" : "OFF"));

    }
}
