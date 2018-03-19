/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecordRun;

import java.util.ArrayList;

/**
 *
 * @author danny_000
 */
public class RunModel 
{
    public ArrayList <Object> currentRun;
    
    public RunModel()
    {
        
    }
    
    /**
    * This class will get the sensor data from the board.
    * @return 
    */
    public ArrayList GetSensorData()
    {
        return currentRun;
    }
}
