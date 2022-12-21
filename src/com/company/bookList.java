package com.company;

import java.util.ArrayList;

public class bookList {
    String listName;
    ArrayList<books> list;

    public bookList(String listName) {
        this.listName = listName;
        list= new ArrayList<books>();
    }
}
