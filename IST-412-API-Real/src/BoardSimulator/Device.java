/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BoardSimulator;

/**
 *
 * @author matthewtucker
 */
public class Device {
    private String deviceName;
    
    public Device(String deviceName){
        this.deviceName = deviceName;
    }
    
    public String getDeviceName(){
        return this.deviceName;
    }
    
    public void setDeviceName(String name){
        this.deviceName = name;
    }
}
