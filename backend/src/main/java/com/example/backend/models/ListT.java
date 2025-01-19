package com.example.backend.models;

public class ListT { 
    private long id;
    private String title;
    private long board_id;
    private Long[] cards;
    
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
    public long getBoard_id() {
        return board_id;
    }
    public void setBoard_id(long board_id) {
        this.board_id = board_id;
    }
    public Long[] getCards() {
        return cards;
    }
    public void setCards(Long[] cards) {
        this.cards = cards;
    }
    
    @Override
    public String toString() {
        return "ListT [id=" + id + ", title=" + title + ", board_id=" + board_id + ", cards=" + cards + "]";
    }

}
