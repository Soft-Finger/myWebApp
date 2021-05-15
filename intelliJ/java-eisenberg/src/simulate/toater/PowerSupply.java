package simulate.toater;

public class PowerSupply {
    private int voltage;
    private boolean turnedOn;

    PowerSupply(int voltage) {
        this.setVoltage(voltage);
        this.turnedOn = false;
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        if(voltage == 110 || voltage == 220) {
            this.voltage = voltage;
        } else {
            this.voltage = 110;
        }
    }

    public boolean getTurnedOn() {
        return turnedOn;
    }

    public void setTurnedOn(boolean turnedOn) {
        this.turnedOn = turnedOn;
    }

    void turnOn() {
        setTurnedOn(true);
    }

    void turnOff() {
        setTurnedOn(false);
    }

}
