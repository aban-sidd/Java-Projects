package org.TodoApp.Project.repository;

import org.TodoApp.Project.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo , Long> {
}
