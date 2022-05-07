package com.player.service;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class Hockey implements Sports{
    @Override
    public List<String> showPlayers() {
        String[] players = {"Manpreet","Sreejesh","Krishan","Harmanpreet","Amit","Gurinder"};
        return Arrays.stream(players).collect(Collectors.toList());
    }
}
