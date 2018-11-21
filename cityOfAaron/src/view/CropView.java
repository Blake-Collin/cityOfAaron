package view;

import model.*;
import control.*;
import java.util.Scanner;
import cityofaaron.CityOfAaron;

/**
 * The CropView Class - Part of the View Layer
 * @Class CIT260
 * @Brother Wright
 * @author Collin Blake
 * Date Last Modified: 11/13/2018
 */
public class CropView {

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
    public static void runCropsView()
    {
        // call the buyLandView( ) method
        //buyLandView();
        
        // Other Calls
        feedPeopleView();
        //sellLandView();

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
        
        // Call the buyLand( ) method in the control layer to buy the land
        
        while (0 > CropControl.buyLand(price,toBuy, cropData))
        {
            System.out.print("This value is invalid \nEnter another value: ");
            toBuy = keyboard.nextInt();
            
        }
        
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
        
        // Promp the user to enter the number of acres to sell
        System.out.format("Land is selling for %d bushels per acre.%n",price);
        System.out.print("How many acres of land do you wish to sell? ");
        
        // Get the user's input and save it.
        int toSell;
        toSell = keyboard.nextInt();
        
        //Call the sellLand() method in the control layer to buy the land 
        while (0 > CropControl.sellLand(price, toSell, cropData))
        {
            System.out.print("This value is invalid \nEnter another value: ");
            toSell = keyboard.nextInt();
            
        }
        CropControl.sellLand(price, toSell, cropData);
        
        // output how much land we now own
        System.out.format("You now own %d acres of land. /n", cropData.getAcresOwned());
        
    }
    
    
}

