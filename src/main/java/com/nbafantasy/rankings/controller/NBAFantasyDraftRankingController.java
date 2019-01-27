package com.nbafantasy.rankings.controller;

import com.nbafantasy.rankings.model.Player;
import com.nbafantasy.rankings.service.NBAFantasyDraftRankingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(NBAFantasyDraftRankingController.PATH)
public class NBAFantasyDraftRankingController {

    protected static final String PATH = "/players";
    protected static final String RANKINGS_PATH = "/rankings";

    private NBAFantasyDraftRankingService NBAFantasyDraftRankingService;

    @Autowired
    NBAFantasyDraftRankingController(NBAFantasyDraftRankingService NBAFantasyDraftRankingService) {
        this.NBAFantasyDraftRankingService = NBAFantasyDraftRankingService;
    }

    @GetMapping(RANKINGS_PATH)
    public ResponseEntity<List<Player>> getPlayerRankings() {
        return ResponseEntity.ok(NBAFantasyDraftRankingService.getNBAFantasyDraftRanking().getPlayers());
    }

}
