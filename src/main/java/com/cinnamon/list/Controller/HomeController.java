package com.cinnamon.list.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cinnamon.list.Entity.Tareas;
import com.cinnamon.list.Repository.TareasRepository;

@Controller
public class HomeController {

    private TareasRepository tareasRepository;

    @Autowired
    public HomeController(TareasRepository tareasRepository) {
        this.tareasRepository = tareasRepository;
    }

    @GetMapping("/home")
    public ModelAndView todoList() {

        List<Tareas> tareas = tareasRepository.findAll();
        ModelAndView todoList = new ModelAndView("index");
        todoList.addObject("list", tareas);

        return todoList;

    }

    @PostMapping("/home")
    public String createTodo(@RequestParam("todo") String todo) {
       tareasRepository.save(new Tareas(todo, false));
       return "redirect:/home";

    }

    @PostMapping("/home/delete")
    public String DeleteTodo(@RequestParam("itemId") Long id) {
        tareasRepository.deleteById(id);
        return "redirect:/home";


    }


}
