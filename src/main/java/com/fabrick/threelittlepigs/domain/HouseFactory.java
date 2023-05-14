package com.fabrick.threelittlepigs.domain;

import com.fabrick.threelittlepigs.domain.models.characters.LittlePig;
import com.fabrick.threelittlepigs.domain.models.places.House;

public class HouseFactory {

  public static House buildHouse(LittlePig littlePig) {
    return new House(littlePig);
  }
}
