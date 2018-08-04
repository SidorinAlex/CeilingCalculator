package com.example.alex.activity;

import android.util.ArrayMap;

/**
 * Created by alex on 04.03.2018.
 */

public class Order {
    ArrayMap<String, Room> rooms = new ArrayMap<>();
    String address;

    public Order(String address) {
        this.address = address;
    }

    public Room getRoom(String roomName) {
        Room room = null;
        try {
            room = rooms.get(roomName);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        return room;

    }

    public ArrayMap<String, Room> getRooms() {
        return rooms;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
