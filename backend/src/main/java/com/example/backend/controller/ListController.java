package com.example.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.models.ListT;
import com.example.backend.service.ListService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/lists")
public class ListController {
 @Autowired
    private ListService listTService;

    // Create a new ListT 
    @PostMapping
    public ResponseEntity<String> createList(@RequestBody ListT listT) {
        listTService.createList(listT);
        return ResponseEntity.status(HttpStatus.CREATED).body("List created successfully.");
    }

    // Get a ListT by ID
    @GetMapping("/{id}")
    public ResponseEntity<ListT> getListById(@PathVariable long id) {
        ListT listT = listTService.getListById(id);
        return ResponseEntity.ok(listT);
    }

    // Get all ListTs
    @GetMapping
    public ResponseEntity<List<ListT>> getAllLists() {
        List<ListT> lists = listTService.getAllLists();
        return ResponseEntity.ok(lists);
    }

    // Update a ListT
    @PutMapping("/{id}")
    public ResponseEntity<String> updateList(@PathVariable long id, @RequestBody ListT listT) {
        listT.setId(id);
        listTService.updateList(listT);
        return ResponseEntity.ok("List updated successfully.");
    }

    // Delete a ListT
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteList(@PathVariable long id) {
        listTService.deleteList(id);
        return ResponseEntity.ok("List deleted successfully.");
    }
}
