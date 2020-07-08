package Models;

public class Zone {
    private int id;
    private String zone_name;

    public Zone(int id, String zone_name) {
        this.id = id;
        this.zone_name = zone_name;
    }

    public Zone() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getZone_name() {
        return zone_name;
    }

    public void setZone_name(String zone_name) {
        this.zone_name = zone_name;
    }
}
