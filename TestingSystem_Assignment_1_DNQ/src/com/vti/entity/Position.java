package com.vti.entity;

public class Position {
    public int positionID;
    public PositionEnum positionName;

    @Override
    public String toString() {
        return "Position{" +
                "positionID=" + positionID +
                ", positionName='" + positionName + '\'' +
                '}';
    }
}
