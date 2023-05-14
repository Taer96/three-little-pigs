package com.fabrick.threelittlepigs.domain.models.characters;

import com.fabrick.threelittlepigs.domain.enums.LazinessLevel;
import com.fabrick.threelittlepigs.domain.models.objects.garments.Gloves;
import com.fabrick.threelittlepigs.domain.models.objects.garments.Hat;
import com.fabrick.threelittlepigs.domain.models.objects.garments.Shirt;
import com.fabrick.threelittlepigs.domain.models.objects.musicalinstruments.Flute;

import java.util.List;

public class LazyPig extends LittlePig {

  public LazyPig() {
    super(List.of(new Hat(), new Shirt(), new Gloves()), new Flute(), LazinessLevel.LAZY);
  }
}
