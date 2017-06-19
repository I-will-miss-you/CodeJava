package exerclpii;

import java.util.ArrayList;

/**
 *
 * @author code36u4r60
 */
public class Vehicle {

    private int maxSupportedCarriages;
    private double maxSpeed;
    private ArrayList<Vehicle> vehicles;

    public Vehicle(int maxSupportedCarriages, double maxSpeed) {
        this.maxSupportedCarriages = maxSupportedCarriages;
        this.maxSpeed = maxSpeed;
        vehicles = new ArrayList<>();
    }

    private void addVehicle(Vehicle tc) throws MaxCarriagesExceededException {
        if (numberCarriages() == maxSupportedCarriages) {
            throw new MaxCarriagesExceededException();
        }

        vehicles.add(tc);
    }

    private Vehicle removeVehicle(String nameTC) {
        Vehicle v = null;
        vehicles.forEach((e) -> {
            //tenho duvidas aqui
        });
        return v;
    }

    private void transferVehicle(String nameTC, Vehicle to) {
        Vehicle v = removeVehicle(nameTC);
        try {
            to.addVehicle(v);
        } catch (MaxCarriagesExceededException ex) {

        }
    }

    public double velocity() {
        return 0;
    }

    public int numberCarriages() {
        return vehicles.size();
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

}
