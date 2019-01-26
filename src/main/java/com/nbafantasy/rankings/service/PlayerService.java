package com.nbafantasy.rankings.service;

import com.nbafantasy.rankings.model.FantasyBasketballRanking;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;

@Service
public class PlayerService {


    private RestTemplate restTemplate;

    @Getter
    @Value("${fantasy.api.url}")
    private String apiUrl;


    @Getter
    private FantasyBasketballRanking fantasyBasketballRanking;

    @Autowired
    PlayerService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @PostConstruct
    public void loadPlayers(){
        fantasyBasketballRanking= restTemplate.getForObject(apiUrl, FantasyBasketballRanking.class);
    }




}
