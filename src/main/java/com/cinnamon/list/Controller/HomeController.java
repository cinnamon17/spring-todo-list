package com.cinnamon.list.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.ArrayList;

@Controller
public class HomeController {

    public HomeController() {

    }

    @GetMapping("/home")
    public String name() {

        List<String> names = new ArrayList<String>();

        names.add("Nelson");
        names.add("Leydi");

        return "index";

    }


}
