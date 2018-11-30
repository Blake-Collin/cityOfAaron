package view;

import model.*;
import control.*;
import exceptions.*;
import java.util.Scanner;
import cityofaaron.CityOfAaron;

/**
 * The CropView Class - Part of the View Layer
 * @Class CIT260
 * @Brother Wright
 * @author Collin Blake
 * Date Last Modified: 11/13/2018
 */
public class CropView extends MenuView 
{

    //Variables
    private static Scanner keyboard = new Scanner(System.in);
    private static Game theGame = CityOfAaron.getTheGame();
    private static CropData cropData= theGame.getCropData();
    
    /**
    * The runCropsView method()
    * Purpose: runs the crop view methods
    * Parameters: none
    * Returns: none
    */
    public CropView()
    {
        super("\n" +
            "**********************************\n" +
            "*CITY OF AARON: Manage Crops Menu* \n" +
            "**********************************\n" +
            " 1 -Buy Land\n" +
            " 2 -Sell Land\n" +
            " 3 -Feed the People\n" +
            " 4 -Plant the Crops\n" +
            " 5 -Return to Game Menu\n",
             5);
    }
    
    /**
    *The doActionmethod
    * Purpose: performs the selected action    
    * Returns: none
     * @param option
    */
    @Override public void doAction(int option)
    {
      int options = option;
      if(options == 1){
          buyLandView();
      }
      else if(options == 2){          
          sellLandView();
      }
      else if(options == 3){          
          feedPeopleView();          
      }
      else if(options == 4){
          plantCropsView();
      }
      else if(options == 5){
          System.out.println("Returning to game menu view.");
      }            
    }
       
    /**
    * The buyLandViewmethod
    * Purpose: interface with the user input for buying land
    * Parameters: none
    * Returns: none
    */
    public static void feedPeopleView()
    {
        //Ask User
        System.out.println("How many bushels of grain do you want to give to the people?");
        
        //Get value and save it
        int toGive;
        toGive = keyboard.nextInt();
        
        //Call feed people
        while ( 0 > CropControl.feedThePeople(toGive, cropData))
        {
            System.out.print("This value is invalid.\nPlease enter another value: ");
            toGive = keyboard.nextInt();
        }
        
        //output amonunt of wehat left.
         System.out.format("You now own %d bushels of wheat. \n", cropData.getWheatInStore());
    }
    
    /**
    * The buyLandViewmethod
    * Purpose: interface with the user input for buying land
    * Parameters: none
    * Returns: none
    */
    public static void buyLandView()
    {
        // Get the cost of land for this round.
        int price = CropControl.calcLandCost();
        
        // Prompt the user to enter the number of acres to buy
        System.out.format("Land is selling for %d bushels per acre.%n",price);
        System.out.print("How many acres of land do you wish to buy? ");
        
        // Get the user’s input and save it.
        int toBuy;
        toBuy = keyboard.nextInt();
        boolean paramsNotOkay;
                
        // Call the buyLand( ) method in the control layer to buy the land        
        do
        {
            paramsNotOkay = false;
            toBuy = keyboard.nextInt();
            try
            {
                CropControl.buyLand(price, toBuy, cropData);
            }
            catch(CropException e)
            {
                System.out.println("I am sorry master, I cannot do this.");
                System.out.println(e.getMessage());
                paramsNotOkay = true;
            }
        }
        while(paramsNotOkay);
        
        // output how much land we now own
        System.out.format("You now own %d acres of land. \n", cropData.getAcresOwned());
    }
    
    /**
    * Purpose: Display the corps report view
    * Parameters: none
    * Returns: none 
     */
    
    
    /**
    * Purpose: Display the sellLandView
    * Parameters: none
    * Returns: none
    * Author: Jacob Gallegos
    */
    
    public static void sellLandView(){
        
        // Get the cost of land of this round.
        int price = CropControl.calcLandCost();
        System.out.format("Land is selling for %d bushels per acre.%n",price);
        boolean paramsNotOkay;        
        int toSell;           
        
        //Call the sellLand() method in the control layer to buy the land
        //Add exeptions for error handling 
        do
        {
            paramsNotOkay = false;
            // Promp the user to enter the number of acres to sell
            System.out.print("How many acres of land do you wish to sell? ");
            // Get the user's input and save it.
            toSell = keyboard.nextInt();
            try
            {
                CropControl.sellLand(price, toSell, cropData);
            }
            catch(CropException e)
            {
                System.out.println("I am sorry master, I cannot do this.");
                System.out.println(e.getMessage());
                paramsNotOkay = true;
            }
        }
        while(paramsNotOkay);
        
        // output how much land we now own
        System.out.format("You now own %d acres of land. \n", cropData.getAcresOwned());
        
    }
    
        /**
    * The plantCropsView method
    * Purpose: interface with the user input for planting crops
    * Parameters: none
    * Returns: none
    */
    public static void plantCropsView()
    {
        // Ask the user “How many acres of land do you want to plant?”
        System.out.print("How many acres of land do you wish to plant?");
        
        // Get the user’s input and save it.
        int toPlant;
        toPlant = keyboard.nextInt();
        
        // Call the plantCrops( ) method in the control layer to plant crops
        CropControl.plantCrops(toPlant, cropData);
        
        //output amount of wheat left in store
        System.out.format("you now have %d bushels of wheat in store.", cropData.getWheatInStore());
                
    }
      
}

