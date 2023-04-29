package com.cinnamon.list.Repository;

import org.springframework.data.repository.CrudRepository;

import com.cinnamon.list.Entity.Tareas;
import java.util.List;

/**
 * TareasRepository
 */
public interface TareasRepository extends CrudRepository<Tareas, Long> {

    List<Tareas> findAll();

    Tareas findById(long id);

}

