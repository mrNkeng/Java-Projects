package com.example.demo;

import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorldSeriesController {

    private WorldSeries worldSeries;
  

    public WorldSeriesController() {
        try {
            this.worldSeries = new WorldSeries();
        } catch (IOException e) {
            // Handle the exception or throw a runtime exception
            throw new RuntimeException("Failed to initialize WorldSeries", e);
        }
    }

    @GetMapping("/winners")
    public String[] getAllWinners() {
        return worldSeries.getWinners();
    }

    @GetMapping("/winners/{year}")
    public String getWinnerByYear(@PathVariable int year) {
        return worldSeries.winner(year);
    }

    @GetMapping("/teams/{teamName}/wins")
    public int getWinsForTeam(@PathVariable String teamName) {
        return worldSeries.findWinner(teamName);
    }

    @GetMapping("/teams/{teamName}/years")
    public int[] getYearsWonByTeam(@PathVariable String teamName) {
        return worldSeries.findYears(teamName);
    }
}
