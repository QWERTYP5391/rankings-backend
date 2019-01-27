package com.nbafantasy.rankings.controller;

import com.nbafantasy.rankings.model.Player;
import com.nbafantasy.rankings.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(PlayerController.PATH)
public class PlayerController {

    public static final String PATH = "/players";
    public static final String RANKINGS_PATH = "/rankings";

    private PlayerService playerService;

    @Autowired
    PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping(RANKINGS_PATH)
    public ResponseEntity<List<Player>> getPlayerRankings() {
        return ResponseEntity.ok(playerService.getFantasyBasketballRanking().getPlayers());
    }

}
