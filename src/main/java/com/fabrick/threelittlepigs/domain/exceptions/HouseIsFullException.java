package com.fabrick.threelittlepigs.domain.exceptions;

public class HouseIsFullException extends Exception {

    public HouseIsFullException() {
        super("the house is full");
    }
}
