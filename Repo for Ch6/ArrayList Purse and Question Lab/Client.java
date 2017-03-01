import java.util.*;

/**
 * Write a description of class Client here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Client
{
    

    /**
     * Default constructor for objects of class Client
     */
    public Client()
    {
       
    }

    
    //main
    public static void main(String [] args)
    {
        
       //create new object
       Purse purse = new Purse();
       
       //print purse
       System.out.println(purse.getNumberOfPennies());
        
        
        
       Scanner scan = new Scanner(System.in);
        
       int x=0;
       //while loop running the main part of the program
       while(x==0){
           
       //menu
       System.out.println("MENU:\n");
       System.out.println("A-Add a Coin");
       System.out.println("R-Remove a Coin");
       System.out.println("T-Print the Total value of the coins");
       
       //initializing the choice
       char choice;
       choice = scan.next().charAt(0); 
      //choice of adding
       if(choice == 'A'){
        System.out.println("What type of coin?");
        System.out.println("P-Penny");
        System.out.println("N-Nickel");
        System.out.println("D-Dime");
        System.out.println("Q-Quarter");
           
        choice = scan.next().charAt(0);
        
        if(choice == 'P'){
           purse.add('P', 0.01);
           System.out.println("Coin Added!");
        }
        if(choice == 'N'){
           purse.add('N', 0.05);
           System.out.println("Coin Added!");
        }
        if(choice == 'D'){
           purse.add('D', 0.10);
           System.out.println("Coin Added!");
        }
        if(choice == 'Q'){
           purse.add('Q', 0.25);
           System.out.println("Coin Added!");
        }
    }
       
    //choice of removing
    if(choice == 'R'){
        
        System.out.println("What type of coin?");
        System.out.println("P-Penny");
        System.out.println("N-Nickel");
        System.out.println("D-Dime");
        System.out.println("Q-Quarter");
           
        choice = scan.next().charAt(0);
        
        if(choice == 'P'){
           purse.remove('P');
           
        }
        if(choice == 'N'){
           purse.remove('N');
           
        }
        if(choice == 'D'){
           purse.remove('D');
           
        }
        if(choice == 'Q'){
           purse.remove('Q');
           
        }
    
    }
    //choice to print current purse and coins
    if (choice == 'T')
    {
        purse.getTotal();
    }
        System.out.println(purse);
    
    
    
    
    
    Scanner run = new Scanner(System.in);
    
    //run again or not
    System.out.println("Run again? (0 for yes 1 for no)");
    x = run.nextInt();
   }
  }
}
