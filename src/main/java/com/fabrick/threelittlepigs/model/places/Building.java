package com.fabrick.threelittlepigs.model.places;

import com.fabrick.threelittlepigs.model.places.materials.BuildingMaterial;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Building<T extends BuildingMaterial> extends DwellingPlace {

    private T material;

}
