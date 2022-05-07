package com.player.service;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class Cricket implements Sports{
    @Override
    public List<String> showPlayers() {
        String[] players = {"Sachin","Dhoni","Kohli","Raina","Dravid","Ganguly"};
        return Arrays.stream(players).collect(Collectors.toList());
    }
}
