package com.example.demo.controller;


import com.example.demo.model.Room;
import com.example.demo.service.RoomService;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "rooms",
        produces = {MediaType.APPLICATION_XML_VALUE,
                MediaType.APPLICATION_JSON_VALUE})
public class RoomController {
    private final RoomService roomService;

    public RoomController(RoomService roomService){
        this.roomService = roomService;
    }

    //get all
    @GetMapping
    public List<Room> findAll(){
        return roomService.findAll();
    }

    //get single room
    @GetMapping(value = "{id}")
    Room findById(@PathVariable long id){
        return roomService.findById(id);
    }

    //create
    @PostMapping
    Room createRoom(
            @Validated(Room.Create.class)
            @RequestBody Room room)
    {
        return roomService.createRoom(room);
    }

    //delete room
    @DeleteMapping(value = "{id}")
    public void deleteRoom(@PathVariable long id){
        roomService.delete(id);
    }

    //update room
    @PatchMapping
    public Room updateRoom(
            @Validated(Room.Update.class)
            @RequestBody Room room)
    {
        return roomService.update(room);
    }


}
