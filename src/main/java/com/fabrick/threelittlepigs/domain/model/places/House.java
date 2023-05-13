package com.fabrick.threelittlepigs.domain.model.places;

import com.fabrick.threelittlepigs.domain.enums.BuildingMaterial;
import com.fabrick.threelittlepigs.domain.exceptions.HouseIsFullException;
import com.fabrick.threelittlepigs.domain.exceptions.HouseResistsException;
import com.fabrick.threelittlepigs.domain.model.characters.LittlePig;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class House {

    private final BuildingMaterial material;
    private final List<LittlePig> dwellers = new ArrayList<>(3);
    private boolean blownDown;

    public House(LittlePig dweller) {
        dwellers.add(dweller);
        this.material = dweller.getLazinessLevel().getBuildingMaterial();
    }

    public void welcomeGuest(LittlePig littlePig) throws HouseIsFullException {
        if (dwellers.size() < 3) {
            dwellers.add(littlePig);
        } else {
            throw new HouseIsFullException();
        }
    }

    public void handleWind() throws HouseResistsException {
        if (!material.isWindResistant()) {
            this.blownDown = true;
        } else {
            throw new HouseResistsException();
        }
    }
}
