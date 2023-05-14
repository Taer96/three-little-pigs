package com.fabrick.threelittlepigs.domain.places;

import com.fabrick.threelittlepigs.domain.HouseFactory;
import com.fabrick.threelittlepigs.domain.exceptions.HouseIsFullException;
import com.fabrick.threelittlepigs.domain.exceptions.HouseResistsException;
import com.fabrick.threelittlepigs.domain.models.characters.HardWorkingPig;
import com.fabrick.threelittlepigs.domain.models.characters.LazyPig;
import com.fabrick.threelittlepigs.domain.models.characters.Pig;
import com.fabrick.threelittlepigs.domain.models.places.House;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HouseTests {

  @Test
  void given_newHouse_when_adding2ndPig_then_pigIsAdded() {
    House h = HouseFactory.buildHouse(new HardWorkingPig());
    Assertions.assertDoesNotThrow(() -> h.welcomeGuest(new LazyPig()));
    Assertions.assertEquals(2, h.getDwellers().size());
  }

  @Test
  void given_newHouse_when_adding3rdPig_then_pigIsAdded() {
    House h = HouseFactory.buildHouse(new HardWorkingPig());
    Assertions.assertDoesNotThrow(() -> h.welcomeGuest(new LazyPig()));
    Assertions.assertDoesNotThrow(() -> h.welcomeGuest(new Pig()));
    Assertions.assertEquals(3, h.getDwellers().size());
  }

  @Test
  void given_newHouse_when_adding4thPig_then_HouseIsFullException() {
    House h = HouseFactory.buildHouse(new HardWorkingPig());
    Assertions.assertDoesNotThrow(() -> h.welcomeGuest(new LazyPig()));
    Assertions.assertDoesNotThrow(() -> h.welcomeGuest(new Pig()));
    Assertions.assertThrows(HouseIsFullException.class, () -> h.welcomeGuest(new HardWorkingPig()));
  }

  @Test
  void given_newHouseForLazyPig_when_handleWind_then_houseIsBlownDown() {
    House h = HouseFactory.buildHouse(new LazyPig());
    Assertions.assertDoesNotThrow(h::handleWind);
    Assertions.assertTrue(h.isBlownDown());
  }

  @Test
  void given_newHouseForPig_when_handleWind_then_houseIsBlownDown() {
    House h = HouseFactory.buildHouse(new Pig());
    Assertions.assertDoesNotThrow(h::handleWind);
    Assertions.assertTrue(h.isBlownDown());
  }

  @Test
  void given_newHouseForHardWorkingPig_when_handleWind_then_HouseResistsException() {
    House h = HouseFactory.buildHouse(new HardWorkingPig());
    Assertions.assertThrows(HouseResistsException.class, h::handleWind);
  }
}
