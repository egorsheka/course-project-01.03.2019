package by.sheka.app.javaFX.entity;

import java.io.Serializable;

public class Entity implements Serializable {
    private int id;

    public Entity(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
