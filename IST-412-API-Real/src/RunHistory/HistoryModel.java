/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RunHistory;

import java.util.ArrayList;

/**
 *
 * @author home
 * This class will show all of the previous rides the rider has recorded
 */
public class HistoryModel {

    public ArrayList <Object> runs;

    public HistoryModel(){
        
    }
    
    /**
     * This method will get all of the previous run data collected
     * @return
     */
    public ArrayList getPastRunData(){
        return runs;
    }
    
}
