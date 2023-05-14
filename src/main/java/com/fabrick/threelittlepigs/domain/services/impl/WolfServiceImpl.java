package com.fabrick.threelittlepigs.domain.services.impl;

import com.fabrick.threelittlepigs.domain.exceptions.HouseResistsException;
import com.fabrick.threelittlepigs.domain.exceptions.WolfSurrendersException;
import com.fabrick.threelittlepigs.domain.models.places.House;
import com.fabrick.threelittlepigs.domain.services.WolfService;
import org.springframework.stereotype.Service;

@Service
public class WolfServiceImpl implements WolfService {

  public void blowDownAHouse(House house) throws WolfSurrendersException {
    try {
      house.handleWind();
    } catch (HouseResistsException e) {
      secondAttemptToBlowDownAHouse(house);
    }
  }

  private void secondAttemptToBlowDownAHouse(House house) throws WolfSurrendersException {
    try {
      house.handleWind();
    } catch (HouseResistsException e) {
      throw new WolfSurrendersException();
    }
  }
}
