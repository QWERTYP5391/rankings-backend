package com.fantasy;

import com.fantasy.model.NBAFantasyDraftRanking;
import com.fantasy.model.Player;

import java.util.ArrayList;
import java.util.List;

public class TestUtility {

    public static NBAFantasyDraftRanking getFantasyBasketBallRanking() {


        NBAFantasyDraftRanking rankings = new NBAFantasyDraftRanking();
        List<Player> players = new ArrayList<>();

        Player samplePLayer = new Player();
        samplePLayer.setPlayerId(1);
        samplePLayer.setPosition("SF");
        samplePLayer.setRankPos(1);
        samplePLayer.setRankOverall(1);
        samplePLayer.setName("Ebrima Tunkara");
        samplePLayer.setTeam("New York Knicks");
        samplePLayer.setStandDev(89.23);

        players.add(samplePLayer);


        rankings.setPlayers(players);

        return rankings;
    }
}
