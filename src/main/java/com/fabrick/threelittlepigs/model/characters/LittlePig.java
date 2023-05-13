package com.fabrick.threelittlepigs.model.characters;

import com.fabrick.threelittlepigs.model.objects.garments.Garment;
import com.fabrick.threelittlepigs.model.objects.musicalinstruments.MusicalInstrument;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
public abstract class LittlePig extends Character {

    abstract List<Garment> getClothes();

    abstract MusicalInstrument getMusicalInstrument();
}
