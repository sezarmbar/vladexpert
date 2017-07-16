package com.sezar.model;

import javax.persistence.*;

/**
 * Created by mahmoudbarakat on 12.07.17.
 */

@Entity
public class Experts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String Name;
    private boolean flag;

    public Experts() {}

    public Experts(String name, boolean flag) {
        Name = name;
        this.flag = flag;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}