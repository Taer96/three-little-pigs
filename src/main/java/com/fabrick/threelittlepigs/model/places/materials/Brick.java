package com.fabrick.threelittlepigs.model.places.materials;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Brick extends BuildingMaterial {
    @Override
    public boolean resistsWind() {
        return true;
    }

    @Override
    public float getHoursToBuildAHouse() {
        return 168;
    }
}
