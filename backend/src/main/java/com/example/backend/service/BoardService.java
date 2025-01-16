package com.example.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backend.models.Board;
import com.example.backend.repository.BoardRepository;

@Service
public class BoardService {
    @Autowired
    private BoardRepository boardRepository;

    public void createBoard(Board board) {
        boardRepository.createBoard(board);
    }

    public Board getBoardById(long id) {
        return boardRepository.getBoardById(id);
    }

    public List<Board> getAllBoards() {
        return boardRepository.getAllBoards();
    }

    public void updateBoard(Board board) {
        boardRepository.updateBoard(board);
    }

    public void deleteBoard(long id) {
        boardRepository.deleteBoard(id);
    }
}
