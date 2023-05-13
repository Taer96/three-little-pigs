package com.fabrick.threelittlepigs.domain.model.characters;

import com.fabrick.threelittlepigs.domain.enumerations.LazinessLevel;
import com.fabrick.threelittlepigs.domain.model.objects.musicalinstruments.MusicalInstrument;

public abstract class LittlePig extends Character {

    public abstract MusicalInstrument getMusicalInstrument();

    public abstract LazinessLevel getLazinessLevel();

}
