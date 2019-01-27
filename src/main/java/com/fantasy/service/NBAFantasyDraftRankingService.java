package com.fantasy.service;

import com.fantasy.model.NBAFantasyDraftRanking;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;

@Service
public class NBAFantasyDraftRankingService implements PlayerService {


    private RestTemplate restTemplate;

    @Getter
    @Value("${fantasy.api.url}")
    private String apiUrl;


    @Getter
    private NBAFantasyDraftRanking NBAFantasyDraftRanking;

    @Autowired
    NBAFantasyDraftRankingService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @PostConstruct
    public void loadPlayers(){
        NBAFantasyDraftRanking = restTemplate.getForObject(apiUrl, NBAFantasyDraftRanking.class);
    }




}
