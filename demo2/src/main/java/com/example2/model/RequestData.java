package com.example2.model;

public class RequestData {
    private String name;
    private String address;

    // Default constructor (required by Spring for deserialization)
    public RequestData() {
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
