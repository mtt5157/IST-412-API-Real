/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChallenegeMode;

import java.util.ArrayList;

/**
 * 
 * @author matthewtucker
 * This class will contain all of the information related to the various challenges that will be available to rider
 */
public class ChallengeModel {
    public ArrayList <Object> challenges;
    
    public ChallengeModel(){
        
    }
    
    /**
     * 
     * @return
     * Returns all available challenges
     */
    public ArrayList getChallenges(){
        return this.challenges;
    }
    
    
    
}
