package com.fabrick.threelittlepigs.model.places.materials;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Wood extends BuildingMaterial {
    @Override
    public boolean resistsWind() {
        return false;
    }

    @Override
    public float getHoursToBuildAHouse() {
        return 24;
    }
}
