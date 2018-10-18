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
    Player thePlayer = new Player();

    //Functions
    public Player getThePlayer() {
        return thePlayer;
    }

    public void setThePlayer(Player thePlayer) {
        this.thePlayer = thePlayer;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.thePlayer);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (!Objects.equals(this.thePlayer, other.thePlayer)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "thePlayer=" + thePlayer + '}';
    }
    
}
