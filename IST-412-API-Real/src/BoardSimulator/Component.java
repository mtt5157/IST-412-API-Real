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
    
    public ArrayList<Device> getAvailableDevices(){
    
      return Available;        
    }
    
    public boolean connect(String deviceName){
        Boolean connected = false;
        for(int i = 0; i<Available.size(); i++){
            if(Available.get(i).getDeviceName().equals(deviceName)){
                connected = true;
            }
        }
        return connected;
    }
    
    public double getTemperature(){
       Random r = new Random();
       double tempMin = -20;
       double tempMax = 40;
       double temp = tempMin +(tempMax - tempMin) * r.nextDouble();
       return temp;
    }
    
    public double[] getAccelerometerData(){
       double[] accelerometerData = new double[3];
       Random r = new Random();
       double xMin = 0;
       double xMax = 1;
       double yMin = 5;
       double yMax = 20;
       double zMin = 0;
       double zMax = 1;
       
       double sampleX = xMin+(xMax-xMin)*r.nextDouble();
       accelerometerData[0]=sampleX;
       
       double sampleY = yMin +(yMax - yMin)* r.nextDouble();
       accelerometerData[1] = sampleY;
       
       double sampleZ = zMin +(zMax - zMin)* r.nextDouble();
       accelerometerData[2] = sampleZ;
       
       return accelerometerData;
    } 
    
    public double[] getGyroscopeData(){
        double[] gyroscopeData = new double[3];
        
       double xMin = -4;
       double xMax = 0;
       double yMin = -10;
       double yMax = 0;
       double zMin = -11;
       double zMax = 0;
       
       double sampleX = xMin+(xMax-xMin)*r.nextDouble();
       gyroscopeData[0]=sampleX;
       
       double sampleY = yMin +(yMax - yMin)* r.nextDouble();
       gyroscopeData[1] = sampleY;
       
       double sampleZ = zMin +(zMax - zMin)* r.nextDouble();
       gyroscopeData[2] = sampleZ;
       
       return gyroscopeData;
    }
    
    public Packet getDataAsPacket(){
        return new Packet(getAccelerometerData(), getGyroscopeData(), getTemperature());
    }
    
    
    
}
