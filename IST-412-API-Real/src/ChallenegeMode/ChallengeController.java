/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChallenegeMode;

/**
 *
 * @author matthewtucker
 * This class is responsible for handling run data and comparing it to challenge requirements
 */
public class ChallengeController {
    public boolean challengeCompleted;
    public ChallengeModel model;
    
    public ChallengeController(){
        
    }
    
    /**
     * This method works in conjunction with the RunDataController to get the run data that is being collected for the challenge
     */
    public void getRunData(){
        
    }
    
    /**
     * This method works in conjunction with the ChallengeModel to get the challenge data
     */
    public void getChallenges(){
        
    }
    
    /**
     * This method compares the challenge requirements with the run data to determine if the challenge has been completed
     * @return 
     * Boolean
     */
    public boolean isChallengeCompleted(){
        return this.challengeCompleted;
    }
    
}
