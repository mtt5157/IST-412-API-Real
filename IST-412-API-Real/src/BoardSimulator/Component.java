/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BoardSimulator;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author matthewtucker
 * This class is to identify the sensors that are working on the board, get the information from each sensor, encapsulate it, and then send it back to view
 */
public class Component {
    private ArrayList<Device> Available = new ArrayList<Device> ();
    
    public Component(){
      Device ble1 = new Device("BLE1");
      Device ble2 = new Device("BLE2");
      Device ble3 = new Device ("BLE3");
      
      Available.add(ble1);
      Available.add(ble2);
      Available.add(ble3);
      
    }
    /**
     * This method will look for the connected devices within the board and return them
     * @return 
     */
    public ArrayList<Device> getAvailableDevices(){
    
      return Available;        
    }
    /**
     * This method is to know if the available devices are connected or not
     * @param deviceName
     * @return 
     */
    public boolean connect(String deviceName){
        Boolean connected = false;
        //checks the list of available devices for the selected device
        for(int i = 0; i<Available.size(); i++){
            if(Available.get(i).getDeviceName().equals(deviceName)){
                connected = true;
            }
        }
        return connected;
    }
    /**
     * This method gets the temperature data from the device and returns it
     * @return 
     */
    public double getTemperature(){
       //generates a random temperature between -20 degrees and 40 degrees fahrenheit
       Random r = new Random();
       double tempMin = -20;
       double tempMax = 40;
       double temp = tempMin +(tempMax - tempMin) * r.nextDouble();
       return temp;
    }
    /**
     * This method gets the accelerometer data from the device, calculates it and returns it
     * @return 
     */
    public double[] getAccelerometerData(){
       //generates random doubles for the x, y, and z coordinates of the accelerometer. The min and max ranges were determined by using the values from the powerpoint presented by Qortek. This method generates numbers in a similar range
       double[] accelerometerData = new double[3];
       Random r = new Random();
       double xMin = 0;
       double xMax = 1;
       double yMin = 5;
       double yMax = 20;
       double zMin = 0;
       double zMax = 1;
       
       //generating random x
       double sampleX = xMin+(xMax-xMin)*r.nextDouble();
       accelerometerData[0]=sampleX;
       
       //generating random y
       double sampleY = yMin +(yMax - yMin)* r.nextDouble();
       accelerometerData[1] = sampleY;
       
       //generating random z
       double sampleZ = zMin +(zMax - zMin)* r.nextDouble();
       accelerometerData[2] = sampleZ;
       
       return accelerometerData;
    } 
    /**
     * This method gets the gyroscope data, calculates it and returns it
     * @return 
     */
    public double[] getGyroscopeData(){
       //generates random doubles for the x, y, and z coordinates of the gyroscope. The min and max ranges were determined by using the values from the powerpoint presented by Qortek. This method generates numbers in a similar range 
       double[] gyroscopeData = new double[3];
       Random r = new Random();
       
       double xMin = -4;
       double xMax = 0;
       double yMin = -10;
       double yMax = 0;
       double zMin = -11;
       double zMax = 0;
       
       //generating random x
       double sampleX = xMin+(xMax-xMin)*r.nextDouble();
       gyroscopeData[0]=sampleX;
       
       //generating random y
       double sampleY = yMin +(yMax - yMin)* r.nextDouble();
       gyroscopeData[1] = sampleY;
       
       //generating random z
       double sampleZ = zMin +(zMax - zMin)* r.nextDouble();
       gyroscopeData[2] = sampleZ;
       
       return gyroscopeData;
    }
    /**
     * This method encapsulates all of the data taken from the devices into a single packet and returns it
     * @return 
     */
    public Packet getDataAsPacket(){
        return new Packet(getAccelerometerData(), getGyroscopeData(), getTemperature());
    }
    
    
    
}
