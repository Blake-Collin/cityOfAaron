package model;

import java.io.Serializable;


/*  
 * CIT-260
 * Fall 2018
 * Team members: Collin Blake, Jacob Gallegos, Daniel Martin
 */
public class CropData {
    
    //Variables
    private int year;
    private int population;
    private int acresOwned;
    private int wheatInStore;
    private int numberWhoDied;
    private int newPeople;
    private int harvest;
    private int harvestAfterOffering;
    private int offering;
    private int offeringBushels;
    private int peopleFed;
    private int acresPlanted;
    private int numStarved;
    private int eatenByRats;
    private int wheatForPeople;
    
    //Functions

    public int getYear() {
        return year;
    }

    public int getPopulation() {
        return population;
    }

    public int getAcresOwned() {
        return acresOwned;
    }

    public int getWheatInStore() {
        return wheatInStore;
    }

    public int getNumberWhoDied() {
        return numberWhoDied;
    }

    public int getNewPeople() {
        return newPeople;
    }

    public int getHarvest() {
        return harvest;
    }

    public int getHarvestAfterOffering() {
        return harvestAfterOffering;
    }

    public int getOffering() {
        return offering;
    }

    public int getOfferingBushels() {
        return offeringBushels;
    }

    public int getPeopleFed() {
        return peopleFed;
    }

    public int getAcresPlanted() {
        return acresPlanted;
    }

    public int getNumStarved() {
        return numStarved;
    }

    public int getEatenByRats() {
        return eatenByRats;
    }

    public int getWheatForPeople() {
        return wheatForPeople;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setAcresOwned(int acresOwned) {
        this.acresOwned = acresOwned;
    }

    public void setWheatInStore(int wheatInStore) {
        this.wheatInStore = wheatInStore;
    }

    public void setNumberWhoDied(int numberWhoDied) {
        this.numberWhoDied = numberWhoDied;
    }

    public void setNewPeople(int newPeople) {
        this.newPeople = newPeople;
    }

    public void setHarvest(int harvest) {
        this.harvest = harvest;
    }

    public void setHarvestAfterOffering(int harvestAfterOffering) {
        this.harvestAfterOffering = harvestAfterOffering;
    }

    public void setOffering(int offering) {
        this.offering = offering;
    }

    public void setOfferingBushels(int offeringBushels) {
        this.offeringBushels = offeringBushels;
    }

    public void setPeopleFed(int peopleFed) {
        this.peopleFed = peopleFed;
    }

    public void setAcresPlanted(int acresPlanted) {
        this.acresPlanted = acresPlanted;
    }

    public void setNumStarved(int numStarved) {
        this.numStarved = numStarved;
    }

    public void setEatenByRats(int eatenByRats) {
        this.eatenByRats = eatenByRats;
    }

    public void setWheatForPeople(int wheatForPeople) {
        this.wheatForPeople = wheatForPeople;
    }
}
