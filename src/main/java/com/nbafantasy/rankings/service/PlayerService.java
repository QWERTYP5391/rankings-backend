package com.nbafantasy.rankings.service;

import com.nbafantasy.rankings.model.FantasyBasketballNerd;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PlayerService {


    private RestTemplate restTemplate;

    @Getter
    @Setter
    @Value("${fantasy.api.url}")
    private String apiUrl;

    @Autowired
    PlayerService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public void loadPlayers(){
        FantasyBasketballNerd value = restTemplate.getForObject(apiUrl, FantasyBasketballNerd.class);
    }

}
