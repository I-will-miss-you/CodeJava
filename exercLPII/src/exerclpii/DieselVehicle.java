package exerclpii;

/**
 *
 * @author code36u4r60
 */
public class DieselVehicle extends Vehicle {

    final static int MAX_CARRIAGES = 10;

    private DieselVehicle(double maxSpeed) {
        super(MAX_CARRIAGES, maxSpeed);
    }

    @Override
    public double velocity() {
        return getMaxSpeed() - getMaxSpeed() * 0.2 * numberCarriages();
    }

}
