package com.example.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.models.Board;
import com.example.backend.service.BoardService;

@RestController
@RequestMapping("/boards")
public class BoardController {
     @Autowired
    private BoardService boardService;

    // Create a new Board
    @PostMapping
    public ResponseEntity<String> createBoard(@RequestBody Board board) {
        boardService.createBoard(board);
        return ResponseEntity.status(HttpStatus.CREATED).body("Board created successfully.");
    }

    // Get a Board by ID
    @GetMapping("/{id}")
    public ResponseEntity<Board> getBoardById(@PathVariable long id) {
        Board board = boardService.getBoardById(id);
        return ResponseEntity.ok(board);
    }

    // Get all Boards
    @GetMapping
    public ResponseEntity<List<Board>> getAllBoards() {
        List<Board> boards = boardService.getAllBoards();
        return ResponseEntity.ok(boards);
    }

    // Update a Board
    @PutMapping("/{id}")
    public ResponseEntity<String> updateBoard(@PathVariable long id, @RequestBody Board board) {
        board.setId(id);
        boardService.updateBoard(board);
        return ResponseEntity.ok("Board updated successfully.");
    }

    // Delete a Board
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteBoard(@PathVariable long id) {
        boardService.deleteBoard(id);
        return ResponseEntity.ok("Board deleted successfully.");
    }
}
