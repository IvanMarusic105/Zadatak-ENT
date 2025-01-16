package com.example.backend.repository;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.backend.models.Card;

@Repository
public class CardRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void createCard(Card card) {
        String sql = "INSERT INTO card (title, description, list_id) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, card.getTitle(), card.getDescription(), card.getList().getId());
    }

    public Card getCardById(long id) {
        String sql = "SELECT * FROM card WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Card.class), id);
    }

    public List<Card> getAllCards() {
        String sql = "SELECT * FROM card";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Card.class));
    }

    public void updateCard(Card card) {
        String sql = "UPDATE card SET title = ?, description = ?, list_id = ? WHERE id = ?";
        jdbcTemplate.update(sql, card.getTitle(), card.getDescription(), card.getList().getId(), card.getId());
    }

    public void deleteCard(long id) {
        String sql = "DELETE FROM card WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }
}