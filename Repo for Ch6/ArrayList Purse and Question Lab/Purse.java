
import java.util.ArrayList;

public class Purse
{
    //private ArrayList. Stores coins
    ArrayList <Coin> pocket = new ArrayList<>();

    //Constructor
    public Purse ()
    { 
       
       }

    public Purse (Coin acoin)
    {
        pocket.add(acoin);
    }
  /** precondition: Coin will be initialized (value and name) correctly
  *               each variable will have a value
      postcondition: Puts the Coin into the array list change
  */
    public void add (char type, double val)
    {
        //Creates a coin object with the given type and value
        Coin coin1 = new Coin(type, val);
        
        //Adds it to purse using a ArrayList method
        pocket.add(coin1);

        


    }
  
  /**
   * Precondition: The char is entered correctly and the char corresponds to a coin in the purse
   * Postcondition: The coin in purse is removed
   */
  public void remove(char type)
  {
      //Counts
      int count = 0, count2 = 0;
      //Goes through the pocket and finds the first Coin with the same type
      for (Coin c : pocket)
      {
          //Compares and saves the count value
          if (c.getType() == type)
          {
              count2 = count;
            }
          count++;
        }
      //Removes the coin
      pocket.remove(count2);
      
    }
    

  /**
  * Precondition: None
  * Postcondition: Total is printed with the correct value of money
  */
    public void getTotal()
    {
      //Goes through pocket and combines all the values to a singular total
      double total = 0;
      for (Coin c : pocket)
      {
          total += c.getValue();
        }
      System.out.println("Total: " + total);
    }
  /**
   * Pre: None
   * Post: Number of Pennies is returned
   */
  public int getNumberOfPennies()
  {
      //Goes through and finds all pennys and adds them
      int total = 0;
      for (Coin c : pocket)
      {
          if (c.getType() == 'P')
           total++;
        }
        return total;
    }
    
  /**
   * Same as penny just with nickels
   */  
  public int getNumberOfNickels()
  {
      int total = 0;
      for (Coin c : pocket)
      {
          if (c.getType() == 'N')
           total++;
        }
        return total;
    }
  
  /**
   * Same as penny just with dimes
   */    
  public int getNumberOfDimes()
  {
      int total = 0;
      for (Coin c : pocket)
      {
          if (c.getType() == 'D')
           total++;
        }
        return total;
    }
  
  /**
   * Same as penny just with quarters
   */    
  public int getNumberOfQuarters()
  {
      int total = 0;
      for (Coin c : pocket)
      {
          if (c.getType() == 'Q')
           total++;
        }
        return total;
    }



 /**
 *  Returns the all objects in the array list as Strings
 */

   public String toString()
   {
       //Adds the number to the string
      String heythere = "";
      heythere += this.getNumberOfPennies();
      heythere += " Pennies     0.01\n";
      heythere += this.getNumberOfNickels();
      heythere += " Nickels     0.05\n";
      heythere += this.getNumberOfDimes();
      heythere += " Dimes     0.10\n";
      heythere += this.getNumberOfQuarters();
      heythere += " Quarters     0.25\n";
      return heythere;
      
   }

}
//end of purse
