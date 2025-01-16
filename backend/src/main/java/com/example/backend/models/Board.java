package com.example.backend.models;

import java.util.List;


public class Board {
    private long id;
    private String title;
    private List<ListT> lists;
    
    public List<ListT> getLists() {
        return lists;
    }

    public void setLists(List<ListT> lists) {
        this.lists = lists;
    }

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

    @Override
    public String toString() {
        return "Board [id=" + id + ", title=" + title + ", lists=" + lists + "]";
    }

}
