package com.primeirotrampodev.lacofor.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@Service
public class DivisoresLaçoForService {

    public Integer divisores(Integer numero) {


        Integer cont;
        for (cont = numero; cont > 1 && !(numero % cont == 0); cont--) { //  != operador não, / perguntar se o resto da divisao por cont for igual a 0

        }
        return cont;
    }
}





