package exerclpii;

import java.util.ArrayList;
import javafx.scene.paint.Color;

/**
 *
 * @author code36u4r60
 */
public class Line extends Station {

    ArrayList<Station> stations = new ArrayList<>();

    private Color color;

    public Line(Color color, Station station) {
        super(station);
        this.color = color;
    }

    public void addStation(Station station) {
        stations.add(station);
    }

    public void addStationBeforeStation(Station newStation, Station existingStation) {

    }

    public ArrayList<Station> getStationsFromTo(Station from, Station to) {

        return null;
    }

    public String[] getStationsNamesFromTo(Station from, Station to) {
        String[] names = {};

        return names;
    }

}
