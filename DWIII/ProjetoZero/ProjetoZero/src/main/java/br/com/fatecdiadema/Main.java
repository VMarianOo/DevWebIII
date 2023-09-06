package br.com.fatecdiadema;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Main {

    @Autowired
    @Qualifier("configNome")
    private String configNome;

    @Autowired
    @Qualifier("configIdade")
    private String configIdade;

    @GetMapping("/")
    public String index(){

        return "Página Principal do Projeto";
    }

    @GetMapping("/nome")
    public String rota1(){

        return configNome;
    }

    @GetMapping("/idade")
    public String rota2(){


        return configIdade;
    }
    public static void main(String[] args){

        SpringApplication.run(Main.class, args);
        System.out.println("Hello World");

    }
}