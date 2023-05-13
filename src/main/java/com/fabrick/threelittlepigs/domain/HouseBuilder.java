package com.fabrick.threelittlepigs.domain;

import com.fabrick.threelittlepigs.domain.model.characters.LittlePig;
import com.fabrick.threelittlepigs.domain.model.places.House;

public class HouseBuilder {

    public static House buildHouse(LittlePig littlePig) {
        return House.builder()
                .material(littlePig.getLazinessLevel().getBuildingMaterial())
                .build();
    }
}
