package com.example.backend.models;

import java.util.List;

public class ListT {
    private long id;
    private String title;

    private Board board;

    private List<Card> cards;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    @Override
    public String toString() {
        return "ListT [id=" + id + ", title=" + title + ", board=" + board + ", cards=" + cards + "]";
    }
    
}
