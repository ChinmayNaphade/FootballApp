
package com.naphade.chinmay.footballapp.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SoccerSeason {

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("caption")
    @Expose
    private String caption;
    @SerializedName("league")
    @Expose
    private String league;
    @SerializedName("year")
    @Expose
    private String year;
    @SerializedName("currentMatchday")
    @Expose
    private int currentMatchday;
    @SerializedName("numberOfMatchdays")
    @Expose
    private int numberOfMatchdays;
    @SerializedName("numberOfTeams")
    @Expose
    private int numberOfTeams;
    @SerializedName("numberOfGames")
    @Expose
    private int numberOfGames;
    @SerializedName("lastUpdated")
    @Expose
    private String lastUpdated;


    /**
     * @return The id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id The id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return The caption
     */
    public String getCaption() {
        return caption;
    }

    /**
     * @param caption The caption
     */
    public void setCaption(String caption) {
        this.caption = caption;
    }

    /**
     * @return The league
     */
    public String getLeague() {
        return league;
    }

    /**
     * @param league The league
     */
    public void setLeague(String league) {
        this.league = league;
    }

    /**
     * @return The year
     */
    public String getYear() {
        return year;
    }

    /**
     * @param year The year
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * @return The currentMatchday
     */
    public int getCurrentMatchday() {
        return currentMatchday;
    }

    /**
     * @param currentMatchday The currentMatchday
     */
    public void setCurrentMatchday(int currentMatchday) {
        this.currentMatchday = currentMatchday;
    }

    /**
     * @return The numberOfMatchdays
     */
    public int getNumberOfMatchdays() {
        return numberOfMatchdays;
    }

    /**
     * @param numberOfMatchdays The numberOfMatchdays
     */
    public void setNumberOfMatchdays(int numberOfMatchdays) {
        this.numberOfMatchdays = numberOfMatchdays;
    }

    /**
     * @return The numberOfTeams
     */
    public int getNumberOfTeams() {
        return numberOfTeams;
    }

    /**
     * @param numberOfTeams The numberOfTeams
     */
    public void setNumberOfTeams(int numberOfTeams) {
        this.numberOfTeams = numberOfTeams;
    }

    /**
     * @return The numberOfGames
     */
    public int getNumberOfGames() {
        return numberOfGames;
    }

    /**
     * @param numberOfGames The numberOfGames
     */
    public void setNumberOfGames(int numberOfGames) {
        this.numberOfGames = numberOfGames;
    }

    /**
     * @return The lastUpdated
     */
    public String getLastUpdated() {
        return lastUpdated;
    }

    /**
     * @param lastUpdated The lastUpdated
     */
    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

}
