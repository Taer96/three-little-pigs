package com.fabrick.threelittlepigs.domain.model.characters;

import com.fabrick.threelittlepigs.domain.enumerations.LazinessLevel;
import com.fabrick.threelittlepigs.domain.model.objects.garments.Garment;
import com.fabrick.threelittlepigs.domain.model.objects.garments.Gloves;
import com.fabrick.threelittlepigs.domain.model.objects.garments.Hat;
import com.fabrick.threelittlepigs.domain.model.objects.garments.Shirt;
import com.fabrick.threelittlepigs.domain.model.objects.musicalinstruments.Flute;
import com.fabrick.threelittlepigs.domain.model.objects.musicalinstruments.MusicalInstrument;

import java.util.List;

public class LazyPig extends LittlePig {

    @Override
    public List<Garment> getClothes() {
        return List.of(new Hat(), new Shirt(), new Gloves());
    }

    @Override
    public MusicalInstrument getMusicalInstrument() {
        return new Flute();
    }

    @Override
    public LazinessLevel getLazinessLevel() {
        return LazinessLevel.VERY_LAZY;
    }
}
