package com.nbafantasy.rankings.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "FantasyBasketballNerd")
@XmlAccessorType(XmlAccessType.FIELD)
public class FantasyBasketballNerd {

    @XmlElement(name = "Player")
    private List<Player> playerList;

    public List<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }
}
