package fr.epsi.poec24.demospring.controller;

import fr.epsi.poec24.demospring.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class HelloController {
    private HelloService service;

    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    public HelloController(HelloService service) {
        this.service = service;
    }

    public String getGreeting() {
        return service.greeting();
    }

    public HelloController(HelloService service, JdbcTemplate jdbcTemplate) {
        this.service = service;
        this.jdbcTemplate = jdbcTemplate;
    }
}
