package com.fabrick.threelittlepigs.domain.models.characters;

import com.fabrick.threelittlepigs.domain.enums.LazinessLevel;
import com.fabrick.threelittlepigs.domain.models.objects.garments.Garment;
import com.fabrick.threelittlepigs.domain.models.objects.musicalinstruments.MusicalInstrument;
import lombok.Getter;

import java.util.List;

@Getter
public abstract class LittlePig extends Character {

  private final MusicalInstrument musicalInstrument;
  private final LazinessLevel lazinessLevel;

  LittlePig(
      List<Garment> clothes, MusicalInstrument musicalInstrument, LazinessLevel lazinessLevel) {
    super(clothes);
    this.musicalInstrument = musicalInstrument;
    this.lazinessLevel = lazinessLevel;
  }
}
