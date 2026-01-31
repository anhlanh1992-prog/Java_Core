package com.vti.entity;

public class TypeQuestion {
    public int typeID;
    public TypeQuestionEnum typeName;

    @Override
    public String toString() {
        return "TypeQuestion{" +
                "typeID=" + typeID +
                ", typeName='" + typeName + '\'' +
                '}';
    }
}
