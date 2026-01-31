package com.vti.entity;

public class CategoryQuestion {
    public int categoryID;
    public String categoryName;

    @Override
    public String toString() {
        return "CategoryQuestion{" +
                "categoryID=" + categoryID +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }
}
