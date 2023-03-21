package com.primeirotrampodev.lacofor.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
@Service
public class ListaDePalavrasService {

    public List<String> palavasList(String texto) {

        texto = "";
        List<String> palavraList = new ArrayList<>();

        for (String cont = texto; cont < texto ; cont++) {
            palavraList.add(texto);
        }
        return palavraList;
    }
}
