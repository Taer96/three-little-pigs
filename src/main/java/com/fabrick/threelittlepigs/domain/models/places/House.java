package com.fabrick.threelittlepigs.domain.models.places;

import com.fabrick.threelittlepigs.domain.enums.BuildingMaterial;
import com.fabrick.threelittlepigs.domain.exceptions.HouseIsFullException;
import com.fabrick.threelittlepigs.domain.exceptions.HouseResistsException;
import com.fabrick.threelittlepigs.domain.models.characters.LittlePig;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class House {

  private final BuildingMaterial material;
  private final List<LittlePig> dwellers = new ArrayList<>(3);
  private boolean blownDown;

  public House(LittlePig dweller) {
    this.dwellers.add(dweller);
    this.material = dweller.getLazinessLevel().getBuildingMaterial();
  }

  public void welcomeGuest(LittlePig littlePig) throws HouseIsFullException {
    if (this.dwellers.size() < 3) {
      this.dwellers.add(littlePig);
    } else {
      throw new HouseIsFullException();
    }
  }

  public void handleWind() throws HouseResistsException {
    if (!this.material.isWindResistant()) {
      this.blownDown = true;
    } else {
      throw new HouseResistsException();
    }
  }
}
