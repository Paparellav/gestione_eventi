package controller;

import org.springframework.web.bind.annotation.GetMapping;

public class EventoController {

    @GetMapping("/")
    public String home() {
        return "evento";
    }
}
