/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicles;

/**
 *
 * @author 1504307
 */
abstract class Vehicle {
    
    protected int startYear;
    protected int endYear;
    protected int roadTax;
    
    public Vehicle(){
        
        this.startYear = 0;
        this.endYear = 0;
        this.roadTax = 0;
    }
    
    public int getStartYear(){
        
        return startYear;
    }
    
    public int getEndYear(){
        
        return endYear;
    }
    
    public int getRoadTax(){
        
        return roadTax;
    }
}
