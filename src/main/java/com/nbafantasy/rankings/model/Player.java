package com.nbafantasy.rankings.model;


public class Player {

    private Integer playerId;

    private String position;

    private Integer rankPos;

    private Integer rankOverall;

    private String name;

    private String team;

    private Double standDev;

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getRankPos() {
        return rankPos;
    }

    public void setRankPos(Integer rankPos) {
        this.rankPos = rankPos;
    }

    public Integer getRankOverall() {
        return rankOverall;
    }

    public void setRankOverall(Integer rankOverall) {
        this.rankOverall = rankOverall;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public Double getStandDev() {
        return standDev;
    }

    public void setStandDev(Double standDev) {
        this.standDev = standDev;
    }

}
