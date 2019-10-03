package com.example.demo.service;

import com.example.demo.model.Room;

import java.util.List;

public interface RoomService {
    List<Room> findAll();

    Room createRoom(Room room);

    void delete(long id);

    Room update(Room room);

    Room findById(long id);
}
