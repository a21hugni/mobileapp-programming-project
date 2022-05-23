package com.example.project;

public class Verktyg {

    private String id;
    private String name;
    private String location;
    private String company;
    private int size;

    public Verktyg(String id, String name, String location, String company, int size) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.company = company;
        this.size = size;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
