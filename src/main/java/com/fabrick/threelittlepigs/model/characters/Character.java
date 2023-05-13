package com.fabrick.threelittlepigs.model.characters;

import com.fabrick.threelittlepigs.model.places.DwellingPlace;
import lombok.Data;

@Data
public abstract class Character {

    abstract DwellingPlace getDwellingPlace();

}
