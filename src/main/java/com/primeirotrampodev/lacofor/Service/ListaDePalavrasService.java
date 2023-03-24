package com.primeirotrampodev.lacofor.Service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ListaDePalavrasService {

    public List<Character> palavrasList(String texto) {

        List<Character> palavraList = new ArrayList<>();

        for (Integer cont = 0; cont < texto.length(); cont++) {
            palavraList.add(texto.charAt(cont));

        }

        return palavraList;
    }
}
