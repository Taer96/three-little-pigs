package com.fabrick.threelittlepigs.domain.services;

import com.fabrick.threelittlepigs.domain.exceptions.WolfSurrendersException;
import com.fabrick.threelittlepigs.domain.models.places.House;

public interface WolfService {

  void blowDownAHouse(House house) throws WolfSurrendersException;
}
