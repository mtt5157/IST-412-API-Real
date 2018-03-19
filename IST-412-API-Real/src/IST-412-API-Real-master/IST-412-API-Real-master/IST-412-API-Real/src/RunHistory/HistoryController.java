/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RunHistory;

/**
 *
 * @author George Georgakopoulos
 * This will take the data from all of the runs and then will calculate it in order to show aggregate data
 */
public class HistoryController {

    public HistoryModel model;
    public float aggregateRun;

    public HistoryController(){
        
    }
    
    /**
     * This method works in conjunction with the RunDataController to get the run data that is being collected
     */
    public void getRunData(){
        
    }
    
    /**
     * This method calculates all of the run data in order to show historical statistics
     * @return
     */
    public float calcAggregateRuns(){
        return aggregateRun;
    }
    
}
