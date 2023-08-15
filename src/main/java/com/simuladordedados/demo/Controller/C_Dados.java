package com.simuladordedados.demo.Controller;

import com.simuladordedados.demo.Model.M_Dados;
import com.simuladordedados.demo.Service.S_Dados;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class C_Dados {
    @GetMapping("/")
    public String getDados(){

        return "Dados/Simulador";
    }

    @PostMapping("/")
    public String postDados(@RequestParam("dados") int qtdDados,
                            @RequestParam("faces") int qtdFaces,
                            Model model) {

        M_Dados jogada = S_Dados.jogarDados(qtdDados, qtdFaces);
        model.addAttribute("soma", jogada.getSoma());
        model.addAttribute("maximo", jogada.getMaximo());
        model.addAttribute("vetResultado", jogada.getVetResultado());

        return "Dados/Simulador";
    }


}
