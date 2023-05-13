package com.fabrick.threelittlepigs.model.characters;

import com.fabrick.threelittlepigs.model.objects.garments.Garment;
import com.fabrick.threelittlepigs.model.objects.garments.Gloves;
import com.fabrick.threelittlepigs.model.objects.garments.Hat;
import com.fabrick.threelittlepigs.model.objects.garments.Pants;
import com.fabrick.threelittlepigs.model.objects.garments.Suspenders;
import com.fabrick.threelittlepigs.model.places.DwellingPlace;
import com.fabrick.threelittlepigs.model.places.Forest;

import java.util.List;

public class Wolf extends EvilCharacter {

    @Override
    DwellingPlace getDwellingPlace() {
        return new Forest();
    }

    @Override
    List<Garment> getClothes() {
        return List.of(new Hat(), new Suspenders(), new Gloves(), new Pants());
    }
}
