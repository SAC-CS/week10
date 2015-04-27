/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;

/**
 *
 * @author Cesar
 */
public class Dices {
    
    
    public static void diceOne()
    {
        int diceNumber = 1 + (int)(Math.random ()*6);
               Week10.Process(diceNumber);

    }
    
    public static void diceTwo()
    {
        int diceNumber = 2 + (int)(Math.random ()*12);
               Week10.Process(diceNumber);

    }
    
    public static void diceThree()
    {
        int diceNumber = 3 + (int)(Math.random ()*18);
       Week10.Process(diceNumber);
    }
    
    
}
