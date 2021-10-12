package com.defcoding.entities;

public enum PlaneModel {

    BOEING737_800("Boeign 737-800"),
    BOEING737_700("Boeign 737-700");

    private String model;

    PlaneModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return model;
    }
}
