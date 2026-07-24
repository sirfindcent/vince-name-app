package com.vince.backend.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // This class can represent tables in the relational database.
public class NameEntry {

    // 1. Field for primary key and data
    @Id // Fields below are primary key of an entity
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; // Primary Key
    private String name;

    // 2. Constructor
    // JPA requires a no-arg constructor
    public NameEntry() {}

    public NameEntry(String name) {
        this.name = name;
    }

    // 3. Required Getters & Setters
    public Long getId(){return id;}
    public void setId(Long id){this.id = id;}

    public String getName() {
        return name;
    }
    public void setName(String name){this.name = name;}





}
