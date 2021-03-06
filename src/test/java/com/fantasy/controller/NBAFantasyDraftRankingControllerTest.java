package com.fantasy.controller;

import com.fantasy.TestUtility;
import com.fantasy.model.Player;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;

import java.util.List;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.mockito.Mockito.when;

@AutoConfigureMockMvc
@SpringBootTest
@RunWith(SpringRunner.class)
public class NBAFantasyDraftRankingControllerTest {

    private static final int SIZE = 1;

    @Autowired
    MockMvc mockMvc;

    @MockBean
    com.fantasy.service.NBAFantasyDraftRankingService NBAFantasyDraftRankingService;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void getPlayerRankings() throws Exception {
        when(NBAFantasyDraftRankingService.getNBAFantasyDraftRanking()).thenReturn(TestUtility.getFantasyBasketBallRanking());
        ResultActions actions = mockMvc.perform(get(NBAFantasyDraftRankingController.PATH + NBAFantasyDraftRankingController.RANKINGS_PATH));
        actions.andExpect(status().isOk());

        MvcResult result = actions.andReturn();
        String contentAsString = result.getResponse().getContentAsString();

        List<Player> response = objectMapper.readValue(contentAsString, new TypeReference<List<Player>>() {
        });

        assertThat(SIZE, equalTo(response.size()));
    }
}