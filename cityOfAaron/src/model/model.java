package model;

/*
 * CIT-260
 * Fall 2018
 * Team members: Collin Blake, Jacob Gallegos, Daniel Martin
 */

public class model {
    
    public static void main(String[] args) 
    {
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
        
        System.out.print("In the Year " + Kingdom1.getYear() 
                        + " with a current population of " 
                        + Kingdom1.getPopulation() + ".\nAcres Owned:" 
                        + Kingdom1.getAcresOwned() 
                        + "\nWheat in Storage: " + Kingdom1.getWheatInStore() 
                        + "\nNumber of Dead: " 
                        + Kingdom1.getNumberWhoDied()
                        + "\nNew People: " + Kingdom1.getNewPeople() 
                        + "\nHarvest: " + Kingdom1.getHarvest()
                        + "\nHarvest after Offering: " 
                        + Kingdom1.getHarvestAfterOffering() 
                        + "\nOffering: " + Kingdom1.getOffering() 
                        + "\nOffering Bushels: " + Kingdom1.getOfferingBushels() 
                        + "\nPeople Fed: " + Kingdom1.getPeopleFed()
                        + "\nAcres Planted: " + Kingdom1.getAcresPlanted() 
                        + "\nPeople Starved: " + Kingdom1.getNumStarved() 
                        + "\nWheat Eaten by Rats: " + Kingdom1.getEatenByRats()
                        + "\nWhheat for People: " 
                        + Kingdom1.getWheatForPeople() + "\n");
        
        
    }
}
