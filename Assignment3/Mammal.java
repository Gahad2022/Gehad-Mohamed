/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

/**
 *
 * @author ABO AMER
 */
public class Mammal  implements Animal{
    public void eat(){
    System.out.println("mammal eats"); 
    }

    @Override
    public void travel() {
     System.out.println("mammal travel");
     
     
    }
    public int Nooflegs()
    {
    
    return 0;
    }
    public String Favfood()
    {
    return "meat";
    }
}
