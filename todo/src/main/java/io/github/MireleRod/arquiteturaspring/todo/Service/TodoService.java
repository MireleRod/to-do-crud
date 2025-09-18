package io.github.MireleRod.arquiteturaspring.todo.Service;

import io.github.MireleRod.arquiteturaspring.todo.Entity.TodoEntity;
import io.github.MireleRod.arquiteturaspring.todo.Repository.TodoRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class TodoService {

    private TodoRepository repository;

    public TodoService(TodoRepository todoRepository) {
        this.repository = todoRepository;
    }


    public TodoEntity salvar (TodoEntity novoTodo){
        return repository.save(novoTodo);
    }

    public void atualizarStatus (TodoEntity novoTodo){
             repository.save(novoTodo);
    }

    public TodoEntity buscarPorId(Integer id){
        return repository.findById(id).orElse(null);
    }

    public void ExcluirTarefa(Integer id){
        repository.deleteById(id);
    }

}