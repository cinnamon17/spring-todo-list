package com.cinnamon.list.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Tareas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String message;

    @Column(nullable = false)
    private Boolean completed;

    // ... additional members, often include @OneToMany mappings

    protected Tareas() {
        // no-args constructor required by JPA spec
        // this one is protected since it should not be used directly
    }

    public Tareas(String message, Boolean completed) {
        this.message = message;
        this.completed = completed;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getCompleted() {
        return this.completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

}
