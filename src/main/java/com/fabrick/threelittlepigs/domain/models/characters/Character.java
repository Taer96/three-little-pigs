package com.fabrick.threelittlepigs.domain.models.characters;

import com.fabrick.threelittlepigs.domain.models.objects.garments.Garment;
import lombok.Getter;

import java.util.List;

@Getter
public abstract class Character {

  private final List<Garment> clothes;

  Character(List<Garment> clothes) {
    this.clothes = clothes;
  }
}
