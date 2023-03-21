package com.primeirotrampodev.lacofor.Service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SomaDe1A100Service {
    public Integer somaDe1A100 (){

        Integer soma = 0;

        for(Integer contador = 1; contador <= 100; contador++) {
            soma += contador;

        }

        return soma;
    }


}
