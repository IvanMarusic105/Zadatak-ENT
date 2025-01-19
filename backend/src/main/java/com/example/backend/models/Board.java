package com.example.backend.models;


public class Board {
    private long id;
    private String title;
    private Long[] lists;
    
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
    public Long[] getLists() {
        return lists;
    }
    public void setLists(Long[] lists) {
        this.lists = lists;
    }
    
    @Override
    public String toString() {
        return "Board [id=" + id + ", title=" + title + ", lists=" + lists + "]";
    }

}
