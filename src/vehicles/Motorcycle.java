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
public class Motorcycle extends Vehicle{
    
    private final int roadTax = 200;
    private int startYear;
    
    public Motorcycle (int pStartYear){
        
        super(); // call the base class's constructor
        this.startYear = pStartYear;
    }
    
    public int getAccumulatedRTax (int pCurrentYear){
      
        return roadTax * (pCurrentYear - startYear);
    }
    
}
