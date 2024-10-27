package com.cinnamon.list.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cinnamon.list.Entity.Tareas;
import com.cinnamon.list.Repository.TareasRepository;

@RestController
@RequestMapping("/api")
public class HomeController {

    private TareasRepository tareasRepository;

    public HomeController(TareasRepository tareasRepository) {
        this.tareasRepository = tareasRepository;
    }

    @GetMapping("/")
    public List<Tareas> todoList() {
        List<Tareas> tareas = tareasRepository.findAll();
        return tareas;
    }

    @PostMapping("/home")
    public Tareas createTodo(@RequestParam("todo") String todo) {
        Tareas tarea = tareasRepository.save(new Tareas(todo, false));
        return tarea;

    }

    @PostMapping("/home/delete")
    public String DeleteTodo(@RequestParam("itemId") Long id) {
        tareasRepository.deleteById(id);
        return "true";

    }

}
