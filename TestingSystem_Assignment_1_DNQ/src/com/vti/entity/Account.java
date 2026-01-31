package com.vti.entity;

import java.util.Date;

public class Account {
    public int accountID;
    public String email;
    public String username;
    public String fullName;
    public Department department;
    public Position position;
    public Date createDate;

    @Override
    public String toString() {
        return "Account{" +
                "accountID=" + accountID +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", fullName='" + fullName + '\'' +
                ", department=" + department +
                ", position=" + position +
                ", createDate=" + createDate +
                '}';
    }
}
