package com.fabrick.threelittlepigs.domain.enums;

public enum LazinessLevel {

    VERY_LAZY(BuildingMaterial.STRAW),
    LAZY(BuildingMaterial.WOOD),
    HARD_WORKING(BuildingMaterial.BRICK);

    private final BuildingMaterial buildingMaterial;

    LazinessLevel(BuildingMaterial buildingMaterial) {
        this.buildingMaterial = buildingMaterial;
    }

    public BuildingMaterial getBuildingMaterial() {
        return buildingMaterial;
    }
}
