package com.gingerbread.coder.domain;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

/**
 * todo Document type Solution
 */
@Entity
public class Solution {
    //solution that can be added to a task
    ////implementation
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private Task task;
    @Column
    private int version;

    private User author;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

}
