package view;

import model.*;
import control.*;
import java.util.Scanner;
import cityofaaron.CityOfAaron;

/**
 * The GameMenuView Class - Part of the view Layer
 * @Class CIT260
 * @Brother Wright
 * @author Collin Blake
 * Date Last Modified: 11/06/2018
 */
public class GameMenuView {
    
    //Variables
    private static Scanner keyboard = new Scanner(System.in);
    private static String gameMenu;
    private static int max;
    private static Game theGame= CityOfAaron.getTheGame();
    private static CropData cropData= theGame.getCropData();
    
    
    //Constructor
    public GameMenuView()
    {
        gameMenu= "\n" +
            "**********************************\n" +
            "**** CITY OF AARON: GAME MENU ****\n" +
            "**********************************\n" +
            " 1 -View Map\n" +
            " 2 -View List\n" +
            " 3 -Move to New Location\n" +
            " 4 -Manage Crops\n" +
            " 5 -Return to Main Menu\n";
        max = 5;
    }
    
    
    //Functions
    
    /**
    *The displayMenuView method
    * Purpose: displays the menu, gets the user's input, and does the
    * selected action
    * Parameters: none
    * Returns: none
    */
    public void displayMenuView()
    {
        int menuOption = 0;
        do
        {
        // Display the menu
        System.out.println(gameMenu);
        
        // Prompt the user and get the user’s input
        menuOption = getMenuOption();
        
        // Perform the desired action
        doAction(menuOption);

        // Determine and display the next view        
        } while(menuOption != max);
    }
    
    /**
    *The getMenuOption method
    * Purpose: gets the user's input
    * Parameters: none
    * Returns: number entered by the user
    */
    public int getMenuOption()
    {
        // declare a variable to hold user’s input
        int userInput;
        // begin loop
        do
        {
            // get user input from the keyboard
            userInput = keyboard.nextInt();
            
            // if it is not a valid value, output an error message
            if (userInput < 1 || userInput > max)
            {
                System.out.println("Option must be between 1 and " + max);
            }
            
        } while (userInput < 1 || userInput > max);
        // loop back to the top if input was not valid
        
        // return the value input by the user
        return userInput;
    }
    
    /**
    *The doAction method
    * Purpose: performs the selected action
    * Parameters: option selected by user
    * Returns: none
    */
    public void doAction(int option)
    {
        switch (option)
        {
            // if the option is 1, call viewMap()
            case 1:
                viewMap();
                break;
            // if the option is 2, call viewList()
            case 2:
                viewList();
                break;
            // if the option is 3, call moveToNewLocation()
            case 3:
                moveToNewLocation();
                break;
            // if the option is 4, call manageCrops()
            case 4:
                manageCrops();
                break;
            // if the option is 5, display a returning message
            case 5:
                System.out.println("Returning to Main Menu");
        }
    }
    
    /**
    *The viewMap
    * Purpose: to show the map
    * Parameters: none
    * Returns: none
    */
    public void viewMap()
    {
        System.out.println("View Map Option Selected.");    
    }
    
    /**
    *The viewList Method
    * Purpose: to open the view list menu
    * Parameters: none
    * Returns: none
    */
    public void viewList()
    {
        System.out.println("View List Option Selected.");
    }
    
    /**
    *The moveToNewLocation method
    * Purpose: Move to new location
    * Parameters: none
    * Returns: none
    */
    public void moveToNewLocation()
    {
        System.out.println("Move to New Location Option Selected.");
    }
    
    /**
    *The manageCrops method
    * Purpose: To give choices for managing the crops
    * Parameters: none
    * Returns: none
    */
    public void manageCrops()
    {       
        CropView.runCropsView();
        System.out.println("Manage Crops Selected.");
    }
}
