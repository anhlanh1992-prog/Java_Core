package com.vti.entity;

import java.util.Date;

public class GroupAccount {
    public Group group;
    public Account account;
    public Date joinDate;

    @Override
    public String toString() {
        return "GroupAccount{" +
                "group=" + group +
                ", account=" + account +
                ", joinDate=" + joinDate +
                '}';
    }
}
