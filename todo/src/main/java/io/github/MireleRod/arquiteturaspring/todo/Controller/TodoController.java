package io.github.MireleRod.arquiteturaspring.todo.Controller;

import io.github.MireleRod.arquiteturaspring.todo.Entity.TodoEntity;
import io.github.MireleRod.arquiteturaspring.todo.Service.TodoService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/todos")
public class TodoController {

    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping
    public TodoEntity salvar(@RequestBody TodoEntity todo){
        return this.todoService.salvar(todo);
    }

    @PutMapping("{id}")
    public void atualizarStatus(
            @PathVariable("id") Integer id, @RequestBody TodoEntity todo){
            todo.setId(id);
            todoService.atualizarStatus(todo);
    }

    @GetMapping("{id}")
    public TodoEntity buscar (@PathVariable("id") Integer id){
        return todoService.buscarPorId(id);
    }

    @DeleteMapping("{id}")
    public void ExcluirTarefa(@PathVariable("id") Integer id){
        todoService.ExcluirTarefa(id);
    }

}