package com.sezar.model;

import javax.persistence.*;

/**
 * Created by mahmoudbarakat on 12.07.17.
 */


@Entity
public class CaseType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String caseName;

}
