package com.primeirotrampodev.lacofor.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
@Service
public class DivisoresLaçoForService {

    public List<Integer> divisores(Integer numero) {

        List<Integer> resultado = new ArrayList<>();

        for (Integer cont = 1; cont <= numero; cont++) {


            if(numero % cont == 0){
                resultado.add(cont);

            }
        }
        return resultado;
    }
}





