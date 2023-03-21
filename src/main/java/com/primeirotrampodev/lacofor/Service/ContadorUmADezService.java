package com.primeirotrampodev.lacofor.Service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContadorUmADezService {

    public List<Integer> contador1a10() {

        List<Integer> contagem = new ArrayList<>();

        for (Integer contador = 1; contador <= 10; contador++) {
            contagem.add(contador);
        }
        return contagem;
    }

}
