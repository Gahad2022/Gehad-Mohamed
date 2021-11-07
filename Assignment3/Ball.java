/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3.pkg1;

/**
 *
 * @author ABO AMER
 */
public class Ball implements Tossable{
    public String brandName;
    public void toss(){
    System.out.println("toss");
 
    }
    public Ball(String brandName){
    this.brandName=brandName;
    }
    public String getbrandName()
    {
    return brandName;
    }
    public void bounce()
    {
    }
}
