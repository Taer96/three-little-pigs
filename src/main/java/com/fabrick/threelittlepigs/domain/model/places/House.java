package com.fabrick.threelittlepigs.domain.model.places;

import com.fabrick.threelittlepigs.domain.enumerations.BuildingMaterial;
import lombok.Builder;

@Builder
public class House {

    private BuildingMaterial material;
}
