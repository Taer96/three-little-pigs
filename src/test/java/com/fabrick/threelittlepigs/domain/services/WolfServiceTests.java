package com.fabrick.threelittlepigs.domain.services;

import com.fabrick.threelittlepigs.domain.HouseFactory;
import com.fabrick.threelittlepigs.domain.exceptions.WolfSurrendersException;
import com.fabrick.threelittlepigs.domain.models.characters.HardWorkingPig;
import com.fabrick.threelittlepigs.domain.models.characters.LazyPig;
import com.fabrick.threelittlepigs.domain.models.characters.Pig;
import com.fabrick.threelittlepigs.domain.models.places.House;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class WolfServiceTests {

  @Autowired private WolfService wolfService;

  @Test
  void given_wolfAttacksLazyPig_when_handleWind_then_houseIsBlownDown() {
    House h = HouseFactory.buildHouse(new LazyPig());
    Assertions.assertDoesNotThrow(() -> wolfService.blowDownAHouse(h));
    Assertions.assertTrue(h.isBlownDown());
  }

  @Test
  void given_wolfAttacksPig_when_handleWind_then_houseIsBlownDown() {
    House h = HouseFactory.buildHouse(new Pig());
    Assertions.assertDoesNotThrow(() -> wolfService.blowDownAHouse(h));
    Assertions.assertTrue(h.isBlownDown());
  }

  @Test
  void given_wolfAttacksHardWorkingPig_when_handleWind_then_WolfSurrendersException() {
    House h = HouseFactory.buildHouse(new HardWorkingPig());
    Assertions.assertThrows(WolfSurrendersException.class, () -> wolfService.blowDownAHouse(h));
  }
}
