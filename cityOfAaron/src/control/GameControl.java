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

/**
 * @Class CIT260
 * @Brother Wright
 * @author Collin Blake, Jacob Gallegos, Daniel Martin
 */
public class GameControl {
    
    public static void createNewGame(String pName)
    {
        // create the game object
        Game game= new Game();
        // create the player object and set the name
        Player player= new Player();
        player.setName(pName);
        // save reference to the player object in the game
        game.setPlayer(player);
        
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
        game.setCropData(cropData);
        // when all is done, save a reference to the Game object
        CityOfAaron.setTheGame(game);
        
    }

}
