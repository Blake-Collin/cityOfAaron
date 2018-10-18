/*
 * The main() class file for the cityOfAaron project
 * CIT-260
 * Fall 2018
 * Team members: Collin Blake, Jacob Gallegos, Daniel Martin
 */
package cityofaaron;

import model.*;


public class CityOfAaron {

    public static void main(String[] args) {
        
        //Player Test
        Player player1 = new Player();
        
        player1.setName("Lord Vader");
        
        System.out.println(player1.getName());
        
        //Team Member Test
        System.out.println("Name: " + TeamMember.Daniel.getName() 
                            + " Title: " + TeamMember.Daniel.getTitle());
        
        //CropData Test
         CropData Kingdom1 = new CropData();
        
        Kingdom1.setYear(2018);
        Kingdom1.setPopulation(2150912);
        Kingdom1.setAcresOwned(200);
        Kingdom1.setWheatInStore(1000);
        Kingdom1.setNumberWhoDied(0);
        Kingdom1.setNewPeople(26);
        Kingdom1.setHarvest(20);
        Kingdom1.setHarvestAfterOffering(15);
        Kingdom1.setOffering(5);
        Kingdom1.setOfferingBushels(2);
        Kingdom1.setPeopleFed(2150938);
        Kingdom1.setAcresPlanted(205);
        Kingdom1.setNumStarved(0);
        Kingdom1.setEatenByRats(0);
        Kingdom1.setWheatForPeople(25);
        
        System.out.println(Kingdom1.toString());
                
        //Test for Location Class
        Location Rexburg = new Location();
        
        Rexburg.setDescription("Rexburg is a city in Madison County, Idaho,");
        Rexburg.setSymbol("The Spirit of Ricks");
        
        System.out.println("Description: " + Rexburg.getDescription()
                        + " Symbol: " + Rexburg.getSymbol());
    }
}
