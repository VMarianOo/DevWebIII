package com.fatec.ProjetoSpringTeste.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping("/saudacao/{nome}")
    public String saudacao(@PathVariable String nome, ModelMap model){

            model.addAttribute("nome", nome);

            return  "saudacao";
    }

}