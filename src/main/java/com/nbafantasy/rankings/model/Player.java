package com.nbafantasy.rankings.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Player {

    private Integer playerId;

    private String position;

    private Integer rankPos;

    private Integer rankOverall;

    private String name;

    private String team;

    private Double standDev;


}
