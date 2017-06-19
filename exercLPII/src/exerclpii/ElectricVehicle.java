package exerclpii;

/**
 *
 * @author code36u4r60
 */
public class ElectricVehicle extends Vehicle {

    private final static int MAX_CARRIAGES = 5;

    public ElectricVehicle(double maxSpeed) {
        super(MAX_CARRIAGES, maxSpeed);
    }

    @Override
    public double velocity() {
        return getMaxSpeed() - getMaxSpeed() * 0.2 * numberCarriages();
    }

}
