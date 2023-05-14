package com.fabrick.threelittlepigs.domain.places;

import com.fabrick.threelittlepigs.domain.HouseFactory;
import com.fabrick.threelittlepigs.domain.exceptions.HouseIsFullException;
import com.fabrick.threelittlepigs.domain.model.characters.HardWorkingPig;
import com.fabrick.threelittlepigs.domain.model.characters.LazyPig;
import com.fabrick.threelittlepigs.domain.model.characters.Pig;
import com.fabrick.threelittlepigs.domain.model.places.House;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HouseTests {

    @Test
    void given_newHouse_when_adding4thPig_then_HouseIsFullException() throws HouseIsFullException {
        House h = HouseFactory.buildHouse(new HardWorkingPig());
        h.welcomeGuest(new LazyPig());
        h.welcomeGuest(new Pig());
        Assertions.assertThrows(HouseIsFullException.class, () -> h.welcomeGuest(new HardWorkingPig()));
    }
}
