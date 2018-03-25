/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BoardSimulator;

/**
 *
 * @author matthewtucker
 * This class gets the final data collected from the packet delivered from the Component class
 */
public class Packet {
   public double[] accelerometerData;
   public double[] gyroscopeData;
   public double temperature;
   
   public Packet (double[] accelData, double[] gyroData, double temp){
       this.accelerometerData = accelData;
       this.gyroscopeData = gyroData;
       this.temperature = temp;
   }
   /**
    * Sets the accelerometer data received from the packet
    * @param data 
    */
   public void setAccelerometerData(double[] data){
       this.accelerometerData = data;
   }
   /**
    * Sets the acceleration data received from the packet
    * @param data 
    */
   public void setGyroscopeData(double[] data){
       this.gyroscopeData = data;
   }
   /**
    * Sets the temperature received from the packet
    * @param data 
    */
   public void setTemp(double data){
       this.temperature = data;
   }
   /**
    * Gets acceleration data from the packet
    * @return 
    */
   public double[] getAccelerometerData(){
       return this.accelerometerData;
   }
   /**
    * Gets gyroscope data from the packet
    * @return 
    */
   public double[] getGyroscopeData(){
       return this.gyroscopeData;
   }
   /**
    * Gets temperature data from the packet
    * @return 
    */
   public double getTemperature(){
       return this.temperature;
   }
}
