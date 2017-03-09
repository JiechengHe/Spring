package com.entity;

import java.io.Serializable;

/**
 * Created by hejiecheng on 17/3/9.
 */
public class Category implements Serializable {
    private static final long serialVersionUID = 3168164439038068372L;

    private int id ;
    private String name ;

    public Category() {
    }

    public Category(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
