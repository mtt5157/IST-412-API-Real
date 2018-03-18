/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmergencySignal;

/**
 *
 * @author Maxwell Kosabutski
 */
public class EmergencyController {
    
    /**
     * 
     * @return 
     * Gets and returns the viewer for the emergency menu feature
     */
    private static emergencyViewer getViewer(){
        return null;
        
    }
    /**
     * Impacts above a certain threshold will be logged by the application.
     * This will return a true of false variable and call the checkup method
     */
    private static boolean senseImpact(){
        boolean hadAccident = false;
        if(hadAccident){
            checkUp();
        }
        return hadAccident;    
    }
/**
 * If the user had an accident, pops over the screen to ask if they are okay.
 * If no affirmation received, will call the local ski patrol.
 */
    private static void checkUp() {
        boolean isOkay = true;
        if(!isOkay){
            callSkiPatrol();
        }
    }
    /**
     * 
     * @return
     * Gets the user's GPS coordinates from the snowboard
     */
    private static GPS getCoordinates(){
        return null;
        
    }
/**
 * alerts ski patrol to the location of the user. Also lets the user know ski patrol is on their way.
 */
    private static void callSkiPatrol() {
        
    }
    
}
