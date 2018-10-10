package model;

/*
 * The main() class file for the cityOfAaron project
 * CIT-260
 * Fall 2018
 * Team members: Collin Blake, Jacob Gallegos, Daniel Martin
 */
public enum TeamMember {

    Collin("Collin", "He who works too much!"),
    Jacob("Jacob", "He who naps!"),
    Daniel("Daniel", "He who is speechless!");
    
    //Variables
    private String name;
    private String title;

    TeamMember(String name, String title)
    {
        this.name = name;
        this.title = title;        
    }
    
    //function
    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }
    
}
