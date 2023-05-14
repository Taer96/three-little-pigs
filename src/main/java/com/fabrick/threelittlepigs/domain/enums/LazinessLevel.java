package com.fabrick.threelittlepigs.domain.enums;

public enum LazinessLevel {
  LAZY(BuildingMaterial.STRAW),
  NORMAL(BuildingMaterial.WOOD),
  HARD_WORKING(BuildingMaterial.BRICK);

  private final BuildingMaterial buildingMaterial;

  LazinessLevel(BuildingMaterial buildingMaterial) {
    this.buildingMaterial = buildingMaterial;
  }

  public BuildingMaterial getBuildingMaterial() {
    return buildingMaterial;
  }
}
