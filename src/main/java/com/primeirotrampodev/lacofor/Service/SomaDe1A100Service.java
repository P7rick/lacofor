package com.primeirotrampodev.lacofor.Service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SomaDe1A100Service {
    public Integer somaDe1A100 (){

       /* Integer soma = 1+2+3+4+5;*/

        Integer resultado = 0;


        for(Integer cont = 1; cont <=100; cont++){
            resultado += cont;
        }

        return resultado;
    }


}


