package com.fabrick.threelittlepigs.domain.models.characters;

import com.fabrick.threelittlepigs.domain.enums.LazinessLevel;
import com.fabrick.threelittlepigs.domain.models.objects.garments.Gloves;
import com.fabrick.threelittlepigs.domain.models.objects.garments.Hat;
import com.fabrick.threelittlepigs.domain.models.objects.garments.Shirt;
import com.fabrick.threelittlepigs.domain.models.objects.musicalinstruments.Violin;
import java.util.List;

public class Pig extends LittlePig {

  public Pig() {
    super(List.of(new Hat(), new Shirt(), new Gloves()), new Violin(), LazinessLevel.NORMAL);
  }
}
