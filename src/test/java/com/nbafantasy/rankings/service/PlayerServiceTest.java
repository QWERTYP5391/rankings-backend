package com.nbafantasy.rankings.service;

import com.nbafantasy.rankings.TestUtility;
import com.nbafantasy.rankings.model.FantasyBasketballRanking;
import com.nbafantasy.rankings.model.Player;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;


import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@SpringBootTest
@RunWith(SpringRunner.class)
public class PlayerServiceTest {

    @Autowired
    private PlayerService playerService;

    @MockBean
    private RestTemplate restTemplate;


    @Test
    public void loadPlayers() {

        FantasyBasketballRanking fantasyBasketBallRanking = TestUtility.getFantasyBasketBallRanking();
        when(restTemplate.getForObject(playerService.getApiUrl(), FantasyBasketballRanking.class)).thenReturn(fantasyBasketBallRanking);

        playerService.loadPlayers();

        assertThat(playerService.getFantasyBasketballRanking(), equalTo(fantasyBasketBallRanking));
    }


}
