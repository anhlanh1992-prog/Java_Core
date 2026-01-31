package com.vti.entity;

import com.vti.entity.Account;

import java.util.Arrays;
import java.util.Date;

public class Group {
    public int groupID;
    public String groupName;
    public Account creator;
    public Date createDate;
    public Account[]accounts;

    @Override
    public String toString() {
        return "Group{" +
                "groupID=" + groupID +
                ", groupName='" + groupName + '\'' +
                ", creator=" + creator +
                ", createDate=" + createDate +
                ", accounts=" + Arrays.toString(accounts) +
                '}';
    }
}
