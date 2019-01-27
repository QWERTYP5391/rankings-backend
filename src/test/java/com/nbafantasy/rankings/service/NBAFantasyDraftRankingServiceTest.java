package com.nbafantasy.rankings.service;

import com.nbafantasy.rankings.TestUtility;
import com.nbafantasy.rankings.model.NBAFantasyDraftRanking;
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
public class NBAFantasyDraftRankingServiceTest {

    @Autowired
    private NBAFantasyDraftRankingService NBAFantasyDraftRankingService;

    @MockBean
    private RestTemplate restTemplate;


    @Test
    public void loadPlayers() {

        NBAFantasyDraftRanking NBAFantasyBasketBallRanking = TestUtility.getFantasyBasketBallRanking();
        when(restTemplate.getForObject(NBAFantasyDraftRankingService.getApiUrl(), NBAFantasyDraftRanking.class)).thenReturn(NBAFantasyBasketBallRanking);

        NBAFantasyDraftRankingService.loadPlayers();

        assertThat(NBAFantasyDraftRankingService.getNBAFantasyDraftRanking(), equalTo(NBAFantasyBasketBallRanking));
    }


}
