package com.example.smartbook.book;

public class Publishers {
    private int publisherId;
    private String name;

    public Publishers() {}

    public Publishers(int publisherId, String name) {
        this.publisherId = publisherId;
        this.name = name;
    }

    public int getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(int publisherId) {
        this.publisherId = publisherId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}