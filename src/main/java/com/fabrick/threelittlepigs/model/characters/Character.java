package com.fabrick.threelittlepigs.model.characters;

import com.fabrick.threelittlepigs.model.objects.garments.Garment;
import com.fabrick.threelittlepigs.model.places.DwellingPlace;
import lombok.Data;

import java.util.List;

@Data
public abstract class Character {

    abstract DwellingPlace getDwellingPlace();

    abstract List<Garment> getClothes();

}
