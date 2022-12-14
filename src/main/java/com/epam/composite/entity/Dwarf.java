package com.epam.composite.entity;

import com.epam.composite.UnitComponent;

import java.util.StringJoiner;

public class Dwarf implements UnitComponent {
    private long id;
    private int power;

    public Dwarf(long id, int power) {
        this.id = id;
        this.power = power;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public int count() {
        return 1;
    }

    @Override
    public int attack() {
        return power;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", "Dwarf[", "]")
                .add("id=" + id)
                .add("power=" + power)
                .toString();
    }
}
