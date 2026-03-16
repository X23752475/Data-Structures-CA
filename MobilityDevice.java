/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobilitydevice;

/**
 *
 * @author danie
 */
public class MobilityDevice {
    
    // Attributes
    private String deviceID;
    private String type;
    private String location;
    private int battery;
    private boolean available;

    // Constructor
    public MobilityDevice(String deviceID, String type, String location, int battery, boolean available) {
        this.deviceID = deviceID;
        this.type = type;
        this.location = location;
        this.battery = battery;
        this.available = available;
    }

    // Getters
    public String getDeviceID() {
        return deviceID;
    }

    public String getType() {
        return type;
    }

    public String getLocation() {
        return location;
    }

    public int getBattery() {
        return battery;
    }

    public boolean isAvailable() {
        return available;
    }

    // Setters
    public void setLocation(String location) {
        this.location = location;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    // Display device information
    public String displayInfo() {
        return "ID: " + deviceID +
               ", Type: " + type +
               ", Location: " + location +
               ", Battery: " + battery + "%" +
               ", Available: " + available;
    }

    @Override
    public String toString() {
        return displayInfo();
    }
    
}
