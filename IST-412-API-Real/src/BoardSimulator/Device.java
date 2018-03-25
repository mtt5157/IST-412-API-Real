/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BoardSimulator;

/**
 *
 * @author matthewtucker
 * This class is to set the device name within the board
 */
public class Device {
    private String deviceName;

    public Device(String deviceName){
        this.deviceName = deviceName;
    }
    /**
     * Gets the device name within the board
     * @return 
     */
    public String getDeviceName(){
        return this.deviceName;
    }
    /**
     * Sets the device name within the board
     * @param name 
     */
    public void setDeviceName(String name){
        this.deviceName = name;
    }
}
