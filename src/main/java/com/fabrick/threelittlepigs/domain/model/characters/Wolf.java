package com.fabrick.threelittlepigs.domain.model.characters;

import com.fabrick.threelittlepigs.domain.model.objects.garments.Garment;
import com.fabrick.threelittlepigs.domain.model.objects.garments.Gloves;
import com.fabrick.threelittlepigs.domain.model.objects.garments.Hat;
import com.fabrick.threelittlepigs.domain.model.objects.garments.Pants;
import com.fabrick.threelittlepigs.domain.model.objects.garments.Suspenders;

import java.util.List;

public class Wolf extends EvilCharacter {

    @Override
    public List<Garment> getClothes() {
        return List.of(new Hat(), new Suspenders(), new Gloves(), new Pants());
    }

}
