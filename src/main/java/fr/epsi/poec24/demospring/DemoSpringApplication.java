package fr.epsi.poec24.demospring;

import fr.epsi.poec24.demospring.controller.HelloController;
import org.apache.catalina.core.StandardThreadExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class DemoSpringApplication implements CommandLineRunner {

    private HelloController controller;

    public DemoSpringApplication(HelloController controller) {
        this.controller = controller;
    }
    @Autowired
    public static void main(String[] args) {
        SpringApplication.run(DemoSpringApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        System.out.println(controller.getGreeting());

    //Création d'une table utilisateur
    String createQuery = "CREATE TABLE utilisateur (id INT PRIMARY KEI AUTO_INCREMENT, login VARCHAR(50), mot_de_pass VARCHAR(50)";

        JdbcTemplate jdbcTemplate ;

        jdbcTemplate.execute(createQuery);


    }
}
