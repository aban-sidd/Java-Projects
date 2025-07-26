package org.TodoApp.Project.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "todo_db")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private boolean completed;

}
