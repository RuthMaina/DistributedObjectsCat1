package com.example.demo.service;

import com.example.demo.NotFoundException;
import com.example.demo.model.Room;
import com.example.demo.repository.RoomRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {
    private final RoomRepository roomRepository;

    public RoomServiceImpl(RoomRepository roomRepository){
        this.roomRepository = roomRepository;
    }

    @Override
    public List<Room> findAll() {
        return roomRepository.findAll();
    }

    @Override
    public Room createRoom(Room room) {
        return roomRepository.save(room);
    }

    @Override
    public void delete(long id) {
        roomRepository.deleteById(id);
    }

    @Override
    public Room update(Room room) {
        //check if object exists
        return null;
    }

    @Override
    public Room findById(long id) {
        return roomRepository.findById(id).orElseThrow(()
                ->new NotFoundException("NO room with the id"+id)
                );
    }

}
