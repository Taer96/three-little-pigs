package com.fabrick.threelittlepigs.domain.model.characters;

import com.fabrick.threelittlepigs.domain.enums.LazinessLevel;
import com.fabrick.threelittlepigs.domain.model.objects.garments.Dungarees;
import com.fabrick.threelittlepigs.domain.model.objects.garments.Garment;
import com.fabrick.threelittlepigs.domain.model.objects.garments.Gloves;
import com.fabrick.threelittlepigs.domain.model.objects.garments.Hat;
import com.fabrick.threelittlepigs.domain.model.objects.musicalinstruments.MusicalInstrument;
import com.fabrick.threelittlepigs.domain.model.objects.musicalinstruments.Piano;

import java.util.List;

public class HardWorkingPig extends LittlePig {

    @Override
    public List<Garment> getClothes() {
        return List.of(new Hat(), new Dungarees(), new Gloves());
    }

    @Override
    public MusicalInstrument getMusicalInstrument() {
        return new Piano();
    }

    @Override
    public LazinessLevel getLazinessLevel() {
        return LazinessLevel.HARD_WORKING;
    }
}
