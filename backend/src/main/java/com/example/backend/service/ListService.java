package com.example.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backend.models.ListT;
import com.example.backend.repository.ListRepository;

@Service
public class ListService {

    @Autowired
    private ListRepository listRepository;

    public void createList(ListT list) {
        listRepository.createList(list);
    }

    public ListT getListById(long id) {
        return listRepository.getListById(id);
    }

    public List<ListT> getAllLists() {
        return listRepository.getAllLists();
    }

    public void updateList(ListT list) {
        listRepository.updateList(list);
    }

    public void deleteList(long id) {
        listRepository.deleteList(id);
    }
}
