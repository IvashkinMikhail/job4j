package ru.job4j.tracker;

public class Item {
    private String name;
    private String describe;
    private long created;
    private String[] comments;
    private String id;

    public Item(String name, String describe, long created, String[] comments) {
        this.name = name;
        this.describe = describe;
        this.created = created;
        this.comments = comments;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public void setCreated(long created) {
        this.created = created;
    }

    public void setComments(String[] comments) {
        this.comments = comments;
    }

    public String getName() {
        return name;
    }

    public String getDescribe() {
        return describe;
    }

    public long getCreated() {
        return created;
    }

    public String[] getComments() {
        return comments;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
