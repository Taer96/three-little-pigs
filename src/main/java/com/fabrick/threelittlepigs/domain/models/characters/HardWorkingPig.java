package com.fabrick.threelittlepigs.domain.models.characters;

import com.fabrick.threelittlepigs.domain.enums.LazinessLevel;
import com.fabrick.threelittlepigs.domain.models.objects.garments.Dungarees;
import com.fabrick.threelittlepigs.domain.models.objects.garments.Gloves;
import com.fabrick.threelittlepigs.domain.models.objects.garments.Hat;
import com.fabrick.threelittlepigs.domain.models.objects.musicalinstruments.Piano;
import java.util.List;

public class HardWorkingPig extends LittlePig {

  public HardWorkingPig() {
    super(
        List.of(new Hat(), new Dungarees(), new Gloves()), new Piano(), LazinessLevel.HARD_WORKING);
  }
}
