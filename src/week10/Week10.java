
package week10;

import java.util.Scanner;
public class Week10 {
    
    public static void displayMessage()
    { 
        Scanner input = new Scanner(System.in);
    
    String answer1;
    int answer2;
    
    System.out.print("wana play");
    answer1 = input.next();
    

       
        	switch ( answer1 )
	{
	case ("yes"): 
		
		{
		System.out.print("1, 2, or 3 dices?");
                answer2 = input.nextInt();
                }
		//break;
            
            switch ( answer2 )
	{
	case 1: 
		
		{
		Dices.diceOne();
                }
		break;
            
            
	case 2:
                {
                Dices.diceTwo();
		}
		
		break;
            
        case 3:
                {
                Dices.diceThree();
		}
		
		break;
        }
            
            break;
            
	case ("no"):
                {
                System.out.print("later then...");
		}
		
		break;
        }
	

	
	}
       
  

    static void Process(int diceNumber) 
    {
         Scanner input = new Scanner(System.in);
        int guess;
        
        System.out.print("wana play");
    guess = input.nextInt();
        
    
    if (guess == diceNumber)
		
		{
		System.out.print("ganastes wey");
               
                }
		//break;
            
     if (guess != diceNumber)
            {
		System.out.print("perdistes wey");
               
                
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    }

    
}
    

