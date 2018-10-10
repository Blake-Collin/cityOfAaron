package model;

import java.io.Serializable;

/*
 * The main() class file for the cityOfAaron project
 * CIT-260
 * Fall 2018
 * Team members: Collin Blake, Jacob Gallegos, Daniel Martin
 */

public class Player implements Serializable {

    //Variables
    private String name;
    
    //constructor
    public Player(){}
    
    //Functions
    public void setName(String pName)
    {
        name = pName;
    }
    
    public String getName()
    {
        return name;
    }        
}
