package com.fabrick.threelittlepigs.model.characters;

import com.fabrick.threelittlepigs.model.objects.garments.Garment;
import com.fabrick.threelittlepigs.model.objects.garments.Gloves;
import com.fabrick.threelittlepigs.model.objects.garments.Hat;
import com.fabrick.threelittlepigs.model.objects.garments.Shirt;
import com.fabrick.threelittlepigs.model.objects.musicalinstruments.Flute;
import com.fabrick.threelittlepigs.model.objects.musicalinstruments.MusicalInstrument;
import com.fabrick.threelittlepigs.model.places.Building;
import com.fabrick.threelittlepigs.model.places.DwellingPlace;
import com.fabrick.threelittlepigs.model.places.materials.Straw;

import java.util.List;

public class LazyPig extends LittlePig {

    @Override
    DwellingPlace getDwellingPlace() {
        return new Building<Straw>();
    }

    @Override
    List<Garment> getClothes() {
        return List.of(new Hat(), new Shirt(), new Gloves());
    }

    @Override
    MusicalInstrument getMusicalInstrument() {
        return new Flute();
    }
}
