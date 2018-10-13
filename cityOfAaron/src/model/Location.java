package model;
import java.io.Serializable;

/*
 * CIT-260
 * Fall 2018
 * Team members: Collin Blake, Jacob Gallegos, Daniel Martin
 */
public class Location implements Serializable {
    
    //Variables
    private String description;
    private String symbol;
    
    //constructor
    public Location(){}
    
    //Methods

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getDescription() {
        return description;
    }

    public String getSymbol() {
        return symbol;
    }
    
    
    

}
