package ru.babyhall.domain;

public class Category {
    private String id;
    private String parentId;
    private String textContent;

    public Category() {

    }

    public Category(String id, String parentId, String textContent) {
        this.id = id;
        this.parentId = parentId;
        this.textContent = textContent;
    }
    public String getTextContent() {
        return textContent;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

}
