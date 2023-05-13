package com.fabrick.threelittlepigs.model.characters;

import com.fabrick.threelittlepigs.model.objects.garments.Dungarees;
import com.fabrick.threelittlepigs.model.objects.garments.Garment;
import com.fabrick.threelittlepigs.model.objects.garments.Gloves;
import com.fabrick.threelittlepigs.model.objects.garments.Hat;
import com.fabrick.threelittlepigs.model.objects.musicalinstruments.MusicalInstrument;
import com.fabrick.threelittlepigs.model.objects.musicalinstruments.Piano;
import com.fabrick.threelittlepigs.model.places.Building;
import com.fabrick.threelittlepigs.model.places.DwellingPlace;
import com.fabrick.threelittlepigs.model.places.materials.Brick;

import java.util.List;

public class HardWorkingPig extends LittlePig {

    @Override
    DwellingPlace getDwellingPlace() {
        return new Building<Brick>();
    }

    @Override
    List<Garment> getClothes() {
        return List.of(new Hat(), new Dungarees(), new Gloves());
    }

    @Override
    MusicalInstrument getMusicalInstrument() {
        return new Piano();
    }
}
