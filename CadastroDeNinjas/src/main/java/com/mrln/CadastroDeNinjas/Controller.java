package com.mrln.CadastroDeNinjas;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {
    @RequestMapping("/boasvindas")
    public String BoasVindas() {

        return "essa é minha primeira mensagem nessa rota !";
    }
}

