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
public class Lorry extends Vehicle {
    
    private final int roadTax = 7000;
    private int startYear;
    
    public Lorry (int pStartYear){
        
        super();
        this.startYear = pStartYear;
    }
    
    public int getAccumulatedRTax (int pCurrentYear){
        
        return roadTax * (pCurrentYear - startYear);
    }
}
