package com.fabrick.threelittlepigs.model.characters;

import com.fabrick.threelittlepigs.model.places.DwellingPlace;
import com.fabrick.threelittlepigs.model.places.Forest;

public class Wolf extends EvilCharacter {

    @Override
    DwellingPlace getDwellingPlace() {
        return new Forest();
    }
}
