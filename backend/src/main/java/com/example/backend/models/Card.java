package com.example.backend.models;

public class Card { 
    private long id;
    private String title;
    private String description;
    private long list_id;
    
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
    public long getList_id() {
        return list_id;
    }
    public void setList_id(long list_id) {
        this.list_id = list_id;
    }

    @Override
    public String toString() {
        return "Card [id=" + id + ", title=" + title + ", description=" + description + ", list_id=" + list_id + "]";
    }
    
}
