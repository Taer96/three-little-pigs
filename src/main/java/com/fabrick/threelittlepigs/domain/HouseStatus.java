package com.fabrick.threelittlepigs.domain;

import com.fabrick.threelittlepigs.domain.model.places.House;
import lombok.Data;

@Data
public class HouseStatus {

    private House house;
    private boolean blownDown;

    public HouseStatus(House house) {
        this.house = house;
        this.blownDown = false;
    }

}
