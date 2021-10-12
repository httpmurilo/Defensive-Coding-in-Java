package com.defcoding.entities;

import java.time.LocalDate;
import java.util.Optional;

public class Flight {

    private String fromDest;
    private String toDest;
    private LocalDate date;
    private int seatsAvailable;
    private PlaneModel model;

    public Flight(String fromDest,
                  String toDest,
                  LocalDate date,
                  int seatsAvailable,
                  PlaneModel model){
        this.fromDest = fromDest;
        this.toDest = toDest;
        this.date = date;
        this.seatsAvailable = seatsAvailable;

        this.model = Optional.ofNullable(model).orElse(PlaneModel.BOEING737_700);

        //OR TERNARY
        this.model = model != null ? model : PlaneModel.BOEING737_800;
    }

    public String getFromDest() {
        return fromDest;
    }

    public String getToDest() {
        return toDest;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getSeatsAvailable() {
        return seatsAvailable;
    }

    @Override
    public String toString(){
        return String.format("From %s to %s. Date: %s. Available seats left: %s", fromDest, toDest, date, seatsAvailable);
    }
}
