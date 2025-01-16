package com.example.backend.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.backend.models.Board;

@Repository
public class BoardRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void createBoard(Board board) {
        String sql = "INSERT INTO board (title) VALUES (?)";
        jdbcTemplate.update(sql, board.getTitle());
    }

    public Board getBoardById(long id) {
        String sql = "SELECT * FROM board WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Board.class), id);
    }

    public List<Board> getAllBoards() {
        String sql = "SELECT * FROM board";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Board.class));
    }

    public void updateBoard(Board board) {
        String sql = "UPDATE board SET title = ? WHERE id = ?";
        jdbcTemplate.update(sql, board.getTitle(), board.getId());
    }

    public void deleteBoard(long id) {
        String sql = "DELETE FROM board WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }
}
