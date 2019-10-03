package com.example.demo.repository;

import com.example.demo.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

/*
* Create a repository based on a model
* with a unique idenfier which is a long
* */
public interface RoomRepository extends JpaRepository<Room, Long> {
}
