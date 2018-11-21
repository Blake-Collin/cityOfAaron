package view;

import java.util.Scanner;
import cityofaaron.CityOfAaron;
import control.*;
import model.*;

/**
 * The MainMenuView Class - Part of the view Layer
 * @Class CIT260
 * @Brother Wright
 * @author Jacob Gallegos
 * Date Last Modified 10/30/2018
 */

public class ListMenuView 
{
    //Variables
    Scanner keyboard = new Scanner(System.in);
    private int max;
    private String listMenu;
    private Game theGame = CityOfAaron.getTheGame();
    
    
    /**
    * The ListMenuconstructor
    * Purpose: Initialize the list data
    * Parameters: none
    * Returns: none
    */
    // ===================================
    public ListMenuView()
    {
        listMenu= "\n" +
            "**********************************\n" +
            "* CITY OF AARON: MAIN GAME MENU *\n" +
            "**********************************\n" +
            " 1 -View animals in the storehouse\n" +
            " 2 -View the tools in the storehouse\n" +
            " 3 -View the provisions in the storehouse\n" +
            " 4 -View the authors of this game\n" +
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
        System.out.println(listMenu);
        
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
     * @return 
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
    * Returns: none
     * @param option
    */
    // ===================================
    public void doAction(int option)
    {
      int options = option;
      if(options == 1){
          listAnimals();          
      }
      else if(options == 2){
          listTools();
      }
      else if(options == 3){
          listProvisions();
      }
      else if(options == 4){
          listTeam();
      }
      else if(options == 5){
          System.out.println("Thanks for playing... goodbye.");
      }
      
      
    }
    
    
    /**
    * The listAnimals method
    * Purpose: List the number of Animals in the storehouse
    * Parameters: none
    * Returns: none
    * Last Modified:11/06/2018
    */
    // ===================================
    public void listAnimals()
    {
      // List the number of Animals in the storehouse
        System.out.println("View Animals Selected");
    }
    
    /**
    * The listTools method
    * Purpose: List the number of Tools in the storehouse
    * Parameters: none
    * Returns: none
    */
    // ===================================
    public void listTools()
    {
        //List the number of Tools in the storehouse
        System.out.println("View tools selected");
    }
    
        /**
    * The listTools method
    * Purpose: Displays help menu
    * Parameters: none
    * Returns: none
    */
    // ===================================
    public void listProvisions()
    {
        //List the number of provisions in the storehouse
        System.out.println("View Porvisons Selected");
        
    }
    
        /**
    * The listTeam method
    * Purpose: List the number of Teams
    * Parameters: none
    * Returns: none
    */
    // ===================================
    public void listTeam()
    {
        //List the number of Teams
        System.out.println("View Teams selected");
    }
}

