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
        
    }
}
