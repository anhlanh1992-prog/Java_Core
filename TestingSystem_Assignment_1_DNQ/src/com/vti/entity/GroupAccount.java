package com.vti.entity;

import java.util.Date;

public class GroupAccount {
    public Group group;
    public Account account;
    public Date joinDate;
    public Account[] groupAccounts;

    @Override
    public String toString() {
        return "GroupAccount{" +
                "group=" + group +
                ", account=" + account +
                ", joinDate=" + joinDate +
                '}';
    }
}
