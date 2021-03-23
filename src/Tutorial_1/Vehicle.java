package Tutorial_1;

//no, you cannot create an instance of Vehicle as it is an abstract class

public abstract class Vehicle {
    private double maxSpeed;
    protected double currentSpeed;

    public Vehicle(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public abstract void accelerate();

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void pedatToTheMetal(){
        while (currentSpeed < maxSpeed) {
            accelerate();
        }
    }
}
