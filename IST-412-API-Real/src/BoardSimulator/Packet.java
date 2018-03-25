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
public class Packet {
   public double[] accelerometerData;
   public double[] gyroscopeData;
   public double temperature;
   
   public Packet (double[] accelData, double[] gyroData, double temp){
       this.accelerometerData = accelData;
       this.gyroscopeData = gyroData;
       this.temperature = temp;
   }
   
   public void setAccelerometerData(double[] data){
       this.accelerometerData = data;
   }
   
   public void setGyroscopeData(double[] data){
       this.gyroscopeData = data;
   }
   
   public void setTemp(double data){
       this.temperature = data;
   }
   
   public double[] getAccelerometerData(){
       return this.accelerometerData;
   }
   
   public double[] getGyroscopeData(){
       return this.gyroscopeData;
   }
   
   public double getTemperature(){
       return this.temperature;
   }
}
