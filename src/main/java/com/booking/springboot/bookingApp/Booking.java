package com.booking.springboot.bookingApp;

public class Booking {
    private long id;
    private String name;
    private String destination;

    //    Constructor

    public Booking(long id, String name, String destination) {
        this.id = id;
        this.name = name;
        this.destination = destination;
    }

//    Getters

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDestination() {
        return destination;
    }

    //toString

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", destination='" + destination + '\'' +
                '}';
    }




}
