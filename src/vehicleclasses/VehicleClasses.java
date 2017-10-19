/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicleclasses;

import vehicles.Car;
import vehicles.Lorry;
import vehicles.Motorcycle;

/**
 *
 * @author 1504307
 */
public class VehicleClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //tests
        testCar();
        testMotorcycle();
        testLorry();
    }
    
    public static int testLorry(){
        
        System.out.print("Lorry accumulated road tax is: ");
        Lorry lorry1 = new Lorry(2015);
        System.out.println(lorry1.getAccumulatedRTax(2017));
        
        return 0;
    }
    
    public static int testMotorcycle(){
        
        System.out.print("Motorcyle accumulated road tax is: ");
        Motorcycle bike1 = new Motorcycle(2015);
        System.out.println(bike1.getAccumulatedRTax(2017));
        
        return 0;
    }
    
    public static int testCar(){
        
        System.out.print("Car accumulated road tax is: ");
        Car car1 = new Car(2015);
        System.out.println(car1.getAccumulatedRTax(2017));
        
        return 0;
    }
}
