package com.example.backend.models;

public class Card {
    private long id;
    private String title;
    private String description;
    private ListT list;
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
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public ListT getList() {
        return list;
    }
    public void setList(ListT list) {
        this.list = list;
    }
    @Override
    public String toString() {
        return "Card [id=" + id + ", title=" + title + ", description=" + description + ", listt=" + list + "]";
    }

    
}
