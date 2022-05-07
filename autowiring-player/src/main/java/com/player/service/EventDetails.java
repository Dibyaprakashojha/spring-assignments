package com.player.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component

public class EventDetails {

    @Autowired
    @Qualifier("cricket")
    private Sports sports;

    @Autowired
    @Qualifier("football")
    private Sports fsports;

    @Autowired
    @Qualifier("hockey")
    private Sports hsports;

    List<String> printEvent(String choice) {
        System.out.println("Printing sports details:");
        if (choice.equals("c"))
            return sports.showPlayers();
        if (choice.equals("f"))
            return fsports.showPlayers();
        if (choice.equals("h"))
            return hsports.showPlayers();

        return null;
    }
}
