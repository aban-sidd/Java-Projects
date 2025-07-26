package org.TodoApp.Project.controller;

import org.TodoApp.Project.model.Todo;
import org.TodoApp.Project.service.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todo")
public class TodoController {
    private final TodoService todoService;

    public TodoController(TodoService todoService){
        this.todoService = todoService;
    }

    @GetMapping
    public List<Todo>  findAll(){
        return todoService.getAllTodos();
    }

    @GetMapping("/{id}")
    public Todo findById(@PathVariable Long id){
        return todoService.findById(id);
    }

    @PostMapping
    public String createTodo(@RequestBody Todo todo){
         todoService.createTodo(todo);
         return "Created Successfully";
    }

    @DeleteMapping("/{id}")
    public String deleteTodo(@PathVariable Long id){
        todoService.deleteTodo(id);
        return "Deleted Successfully";
    }

    @PutMapping("/{id}")
    public String updateTod (@PathVariable Long id , @RequestBody Todo todo){
        todoService.updateTodo(id , todo);
        return "Updated Successfully";
    }
}
