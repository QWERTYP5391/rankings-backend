package com.fantasy.model;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "FantasyBasketballNerd")
@XmlAccessorType(XmlAccessType.FIELD)
@Getter
@Setter
public class NBAFantasyDraftRanking {

    @XmlElement(name = "Player")
    private List<Player> players;

}
