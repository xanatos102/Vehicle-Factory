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
public class Car extends Vehicle{
    
    private final int roadTax = 500; //fixed value
    private int startYear;
    
    public Car (int pStartYear){ //pStartYear = paramater being passed
        
        super(); //accessing Vehicle.java (supertype)
        this.startYear = pStartYear;
    }
    
    public int getAccumulatedRTax (int pCurrentYear){ //pCurrentYear = parameter being passed
        
        return roadTax * (pCurrentYear - startYear);
    }
}
