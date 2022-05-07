package com.player.service;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class Football implements Sports{
    @Override
    public List<String> showPlayers() {
        String[] players = {"Ronaldo","Messi","Jidan","Pele","Beckham","Neymar"};
        return Arrays.stream(players).collect(Collectors.toList());
    }
}
