package fr.epsi.poec24.demospring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String greeting(){
        return "Hello world!";
    }
}
