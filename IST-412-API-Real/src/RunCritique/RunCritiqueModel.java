/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RunCritique;

import java.util.ArrayList;

/**
 *
 * @author Matt Peron
 * This class will store the various pieces of feedback for the riders.
 */
public class RunCritiqueModel {
    
    public ArrayList <Object> feedback;
    
    /**
     *
     * 
     * Returns a piece of feedback to the controller.
     */
    public Object sendFeedback(){
        
        return feedback;
    }
}
