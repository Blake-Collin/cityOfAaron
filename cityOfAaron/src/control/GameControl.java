/**
* Source code for the GameControlclass
* The GameControlclass is a member of the controllayer
* Methods in the GameControlclass manage Game objects
* Author: your team name
* Date Last modified: date you wrote this code
*/
// ==============================================================
package control;

import model.*;
import cityofaaron.CityOfAaron;
import java.util.Set;
import java.util.ArrayList;

/**
 * @Class CIT260
 * @Brother Wright
 * @author Collin Blake, Jacob Gallegos, Daniel Martin
 */
public class GameControl {
    
    //size of the locations array
    private static final int MAX_ROW = 5;
    private static final int MAX_COL = 5;
    private static Game theGame;
    
    
    public static void createNewGame(String pName)
    {                            
        // create the game object
        Game game= new Game();
        
        // create the player object and set the name              
        Player thePlayer = new Player();
        thePlayer.setName(pName);
        // save reference to the player object in the game        
        game.setPlayer(thePlayer);
        
        //Assign game to CityOfAaron
        CityOfAaron.setTheGame(game);
        theGame = CityOfAaron.getTheGame();
                
        //Create Game Objects
        createCropDataObject();
        createMap();
        createAnimalsList();
        createToolsList();
        createProvisionsList();
    }
    
    public static void createCropDataObject()
    {
        //Set starting values
        CropData cropData = new CropData();
        cropData.setYear(0);
        cropData.setPopulation(100);
        cropData.setNewPeople(5);
        cropData.setCropYield(3);
        cropData.setNumberWhoDied(0);
        cropData.setWheatInStore(2700);
        cropData.setAcresOwned(1000);
        cropData.setAcresPlanted(1000);
        cropData.setHarvest(3000);
        cropData.setAcresPlanted(1000);
        theGame.setCropData(cropData);
        // when all is done, save a reference to the Game object
        theGame.setCropData(cropData);
    }
    
    /**
     * the creatMap method
     * Purpose: creates the location objects and the map
     * Parameters: none
     * Returns: none
     */
    public static void createMap()
    {
        /**
         * Corner    0   1   2   3   4
         *      0   ^^^ !!! !!! !!! ~~~
         *      1   ^^^ !!! !!! !!! ~~~
         *      2   ^^^ &&& ØØØ !!! ~~~
         *      3   ^^^ !!! !!! !!! ~~~
         *      4   ^^^ !!! !!! !!! ~~~
         */
        
        
        //Create the map object
        Map theMap = new Map(MAX_ROW, MAX_COL);
        
        //Farm land base replace as needed
         String farmland = "You are on the fertile banks of the river.\n" +
        "In the spring, this low farmland floods and is covered with rich\n" +
        "new soil. Wheat is planted as far as you can see.";
         
        Location loc = new Location();
        loc.setDescription(farmland + "\nOne bushel will plant two acres of wheat."); 
        loc.setSymbol("!!!");
        for(int i = 0; i < MAX_ROW; i++)
        {            
            for(int j = 0; j < MAX_COL; j++)
            {
                theMap.setLocation(i,j,loc);
            }
        }
        
        //Craete river
        String river = "You are on the River. The river is the source\n" +
                    "of life for our city. The river marks the eastern\n " +
                    "boundary of the city - it is wilderness to the East.\n";

        loc = new Location();
        loc.setDescription(river);
        loc.setSymbol("~~~");
        
        for(int i = 0; i < MAX_ROW; i++)
        {
            theMap.setLocation(i,4,loc);
        }               
                
        //Create Garnary
        String garnary = "You are standing before a large Garnary located in the\n" +
                "middle of your fields.\n";
                
        loc = new Location();
        loc.setDescription(garnary + "\nNeed a hint still."); 
        loc.setSymbol("ØØØ");
        theMap.setLocation(2,2,loc);
        
        //Create Village
        String village = "You stand among the City of Aaron long streets, full of\n" +
                      "busy people going about their day to day lives.\n";
        loc = new Location();
        loc.setDescription(village + "\nNeed a hint still."); 
        loc.setSymbol("&&&");
        theMap.setLocation(2,1,loc);
        
        //Create Mountains
        String mountains = "You are standing on the peaks of mountains overlooking\n" +
                "a valley of farmland, a village, and flowring river.\n";
        loc = new Location();
        loc.setDescription(village + "\nNeed a hint still."); 
        loc.setSymbol("^^^");
        
        for(int i = 0; i < MAX_ROW; i++)
        {
            theMap.setLocation(i,0,loc);
        }        
        
        //Save to game
        theGame.setMap(theMap);
    }
    
    public static void displayMap()
    {   
        System.out.println("---------Map----------");
        System.out.println("    0 | 1 | 2 | 3 | 4 ");
        
        for(int i = 0; i < MAX_ROW; i++)
        {
            System.out.print(" " + i + " ");
            for(int j = 0; j < MAX_COL; j++)
            {
                String temp = theGame.getMap().getLocation(i, j).getSymbol();
                                                
                System.out.print(temp);
                if(j != MAX_COL-1)
                {
                    System.out.print("|");
                }
            }
            if(i != MAX_ROW-1)
            {
                System.out.print("\n   ---+---+---+---+---\n");
            }
            else
            {
                System.out.print("\n");
            }
            
        }
    }
    
    //Author: Daniel
    public static void createAnimalsList()
    {
        
    }
    
    //Author: Collin
    public static void createToolsList()
    {
        ArrayList<ListItem> tools = new ArrayList<>();
        
        tools.add(new ListItem(,));
    }
    
    //Author: Jocab
    public static void createProvisionsList()
    {
        
    }
}
