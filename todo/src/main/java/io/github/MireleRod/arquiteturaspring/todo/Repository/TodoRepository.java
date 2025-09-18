package io.github.MireleRod.arquiteturaspring.todo.Repository;

import io.github.MireleRod.arquiteturaspring.todo.Entity.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<TodoEntity, Integer> {

}