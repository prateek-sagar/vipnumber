package com.vipnumberweb.vipnumber.model.entities;

// import jakarta.persistence.Entity;

// @Entity
public class NumberEntry {
    private int[] entry;

    public NumberEntry() {
        entry = new int[10];
    }

    public void setEntryNumber(int[] arr) {
        if (arr.length != 10)
            throw new IllegalArgumentException();

        entry = arr;
    }

    public int[] getEntryNumber() {
        return entry;
    }
}
