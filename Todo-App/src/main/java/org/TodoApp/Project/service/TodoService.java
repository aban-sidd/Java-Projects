package org.TodoApp.Project.service;

import org.TodoApp.Project.model.Todo;
import org.TodoApp.Project.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> getAllTodos(){
        return todoRepository.findAll();
    }

    public Todo findById(Long id){
        return todoRepository.findById(id).orElseThrow();
    }

    public Todo createTodo(Todo todo){
        return  todoRepository.save(todo);
    }

    public void deleteTodo(Long id){
        todoRepository.deleteById(id);
    }

    public Todo updateTodo (long id , Todo updateTodo){
        Todo todo = todoRepository.findById(id).orElseThrow();
        todo.setTitle(updateTodo.getTitle());
        todo.setCompleted(updateTodo.isCompleted());
        return todoRepository.save(todo);
    }
}
