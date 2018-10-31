package model;

import java.io.Serializable;
import java.util.Objects;

/*
 * CIT-260
 * Fall 2018
 * Team members: Collin Blake, Jacob Gallegos, Daniel Martin
 */

public class Game implements Serializable {

    //Variables
    Player player = new Player();
    CropData cropData = new CropData();

    
    //Functions
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player thePlayer) {
        this.player = thePlayer;
    }

    public CropData getCropData() {
        return cropData;
    }

    public void setCropData(CropData cropData) {
        this.cropData = cropData;
    }
    
    
}
