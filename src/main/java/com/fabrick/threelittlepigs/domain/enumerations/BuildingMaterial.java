package com.fabrick.threelittlepigs.domain.enumerations;

public enum BuildingMaterial {
    STRAW(false),
    WOOD(false),
    BRICK(true);

    private final boolean windResistant;

    BuildingMaterial(boolean windResistant) {
        this.windResistant = windResistant;
    }

    public boolean isWindResistant() {
        return windResistant;
    }
}
