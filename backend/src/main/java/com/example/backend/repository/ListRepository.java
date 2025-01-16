package com.example.backend.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.backend.models.ListT;

@Repository
public class ListRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void createList(ListT listT) {
        String sql = "INSERT INTO list (title, board_id) VALUES (?, ?)";
        jdbcTemplate.update(sql, listT.getTitle(), listT.getBoard().getId());
    }

    public ListT getListById(long id) {
        String sql = "SELECT * FROM list WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(ListT.class), id);
    }

    public List<ListT> getAllLists() {
        String sql = "SELECT * FROM list";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(ListT.class));
    }

    public void updateList(ListT listT) {
        String sql = "UPDATE list SET title = ?, board_id = ? WHERE id = ?";
        jdbcTemplate.update(sql, listT.getTitle(), listT.getBoard().getId(), listT.getId());
    }

    public void deleteList(long id) {
        String sql = "DELETE FROM list WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }
}
