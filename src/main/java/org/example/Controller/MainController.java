package org.example.Controller;

import org.springframework.stereotype.Controller;

@Controller
public class MainController {

    public String collection() {
        return "index";
    }
}
