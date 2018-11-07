package view;

import java.util.Scanner;
import cityofaaron.CityOfAaron;
import control.*;

/**
 * The MainMenuView Class - Part of the view Layer
 * @Class CIT260
 * @Brother Wright
 * @author Collin Blake, Jacob Gallegos, Daniel Martin
 * Date Last Modified 10/30/2018
 */

public class MainMenuView 
{
    //Variables
    Scanner keyboard = new Scanner(System.in);
    private int max;
    private String theMenu;
    
    
    /**
    * The MainMenuViewconstructor
    * Purpose: Initialize the menu data
    * Parameters: none
    * Returns: none
    */
    // ===================================
    public MainMenuView()
    {
        theMenu= "\n" +
            "**********************************\n" +
            "* CITY OF AARON: MAIN GAME MENU *\n" +
            "**********************************\n" +
            " 1 -Start new game\n" +
            " 2 -Get and start a saved game\n" +
            " 3 -Get help on playing the game\n" +
            " 4 -Save game\n" +
            " 5 -Quit\n";
        max = 5;
    }
    
    /**
    * The displayMenumethod
    * Purpose: displays the menu, gets the user's input, and does the
    * selected action
    * Parameters: none
    * Returns: none
    */
    // =========================================================
    public void displayMenu()
    {
        int menuOption = 0;
        do
        {
        // Display the menu
        System.out.println(theMenu);
        
        // Prompt the user and get the user’s input
        menuOption = getMenuOption();
        
        // Perform the desired action
        doAction(menuOption);

        // Determine and display the next view        
        } while(menuOption != max);
    }
    
    /**
    * The getMenuOptionmethod
    * Purpose: gets the user's input
    * Parameters: none
    * Returns: integer -the option selected
    */
    // ===================================
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
    *The doActionmethod
    * Purpose: performs the selected action
    * Parameters: none
    * Returns: none
    */
    // ===================================
    public void doAction(int option)
    {
        switch (option)
        {
            // if the option is 1, call startNewGame( )
            case 1:
                startNewGame();
                break;
            // if the option is 2, call startExistingGame( )
            case 2:
                startSavedGame();
                break;
            // if the option is 3, call displayHelpMenu( )
            case 3:
                displayHelpMenuView();
                break;
            // if the option is 4, call displaySaveGame( )
            case 4:
                displaySaveGameView();
                break;
            // if the option is 5, display a goodbye message
            case 5:
                System.out.println("Thanks for playing... goodbye.");
        }
    }
    
    
    /**
    * The startNewGamemethod
    * Purpose: creates game object and starts the game
    * Parameters: none
    * Returns: none
    * Last Modified:11/06/2018
    */
    // ===================================
    public void startNewGame()
    {
        // Display the Banner Page.
        System.out.println("Welcome to the city of Aaron.");
        // Prompt for and get the user’s name.
        String name;
        System.out.println("Please type in your first name: ");
        name = keyboard.next();
        // Call the createNewGame() method in GameControlclass
        // pass the name as a parameter
        GameControl.createNewGame(name);
        
        // Display a welcome message
        System.out.println("Welcome " + name + " have fun!!!");
        // Display the Game menu
        GameMenuView gmv = new GameMenuView();
        gmv.displayMenuView();
    }
    
    /**
    * The startSavedGame
    * Purpose: creates game object from save file
    * Parameters: none
    * Returns: none
    */
    // ===================================
    public void startSavedGame()
    {
        System.out.println("Start saved game option selected.");
    }
    
        /**
    * The displayHelpMenuView
    * Purpose: Displays help menu
    * Parameters: none
    * Returns: none
    */
    // ===================================
    public void displayHelpMenuView()
    {
        System.out.println("Display Help Menu View option selected.");
        // Display the help menu
        HelpMenuView hmv = new HelpMenuView();
        hmv.displayMenuView();
        
    }
    
        /**
    * The SaveGameView
    * Purpose: Shows save game files
    * Parameters: none
    * Returns: none
    */
    // ===================================
    public void displaySaveGameView()
    {
        System.out.println("Display Save Game View option selected.");
    }
}
