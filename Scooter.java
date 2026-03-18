/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobilitydevice;

/**
 *
 * @author danie
 */
public class Scooter extends MobilityDevice {
    
    private int maxSpeed;

    // Constructor
    public Scooter(String deviceID, String location, int battery, boolean available, int maxSpeed) {
        super(deviceID, "Scooter", location, battery, available);
        this.maxSpeed = maxSpeed;
    }

    // Getter
    public int getMaxSpeed() {
        return maxSpeed;
    }

    // Setter
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    
    @Override
    public String displayInfo() {
        return super.displayInfo() + ", Max Speed: " + maxSpeed + " km/h";
    }
    
}
