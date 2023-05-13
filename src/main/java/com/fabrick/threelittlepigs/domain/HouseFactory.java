package com.fabrick.threelittlepigs.domain;

import com.fabrick.threelittlepigs.domain.model.characters.LittlePig;
import com.fabrick.threelittlepigs.domain.model.places.House;

public class HouseFactory {

    public static House buildHouse(LittlePig littlePig) {
        return new House(littlePig);
    }
}
