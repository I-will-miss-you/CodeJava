package exerclpii;

/**
 *
 * @author code36u4r60
 */
public class Station {

    private String name;
    private String address;
    private boolean electricSupport;
    private boolean dieselSupport;
    private int maxCarriageSupport;
    private Point location;

    public Station(String name, String address, boolean electricSupport, boolean dieselSupport, int maxCarriageSupport, Point location) {
        this.name = name;
        this.address = address;
        this.electricSupport = electricSupport;
        this.dieselSupport = dieselSupport;
        this.maxCarriageSupport = maxCarriageSupport;
        this.location = location;
    }

    public Station(Station station) {
        this.name = station.name;
        this.address = station.address;
        this.electricSupport = station.electricSupport;
        this.dieselSupport = station.dieselSupport;
        this.maxCarriageSupport = station.maxCarriageSupport;
        this.location = station.location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isElectricSupport() {
        return electricSupport;
    }

    public void setElectricSupport(boolean electricSupport) {
        this.electricSupport = electricSupport;
    }

    public boolean isDieselSupport() {
        return dieselSupport;
    }

    public void setDieselSupport(boolean dieselSupport) {
        this.dieselSupport = dieselSupport;
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    public boolean supportsElectricVehicle() {
        return electricSupport;
    }

    public boolean supportsDieselVehicle() {
        return dieselSupport;
    }

    public int getMaxCarriageSupport() {
        return maxCarriageSupport;
    }

    public void setMaxCarriageSupport(int maxCarriageSupport) {
        this.maxCarriageSupport = maxCarriageSupport;
    }

    public double distanceTo(Station to) {
        return location.distanceXY(to.location);
    }

}
