package com.primeirotrampodev.lacofor.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
@Service
public class ListaDePalavrasService {

    public List<String> palavasList(String nome1) {

        String nome = "";
        List<String> nomeList = new ArrayList<>();

        for (Integer cont = 0; cont < 5; cont++) {
            nomeList.add(nome1);
        }
        return nomeList;
    }
}
