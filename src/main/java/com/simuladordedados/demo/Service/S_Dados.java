package com.simuladordedados.demo.Service;

import com.simuladordedados.demo.Model.M_Dados;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class S_Dados{
    public static M_Dados jogarDados(int qtdDados, int qtdFaces){
        Random rd = new Random();

        int soma = 0;
        int maximo = 0;
        int resultado;
        int [] vetResultado = new int[qtdDados];

        for (int i = 0; i < vetResultado.length; i++) {
            resultado = rd.nextInt(qtdFaces) + 1;
            soma+=resultado;
            vetResultado[i] = resultado;
            if(resultado > maximo) {
                maximo = resultado;
            }
        }
        M_Dados m_dados = new M_Dados(soma,maximo,vetResultado);
        return m_dados;
    }

}

