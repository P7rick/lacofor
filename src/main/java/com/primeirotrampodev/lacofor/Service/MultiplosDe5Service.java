package com.primeirotrampodev.lacofor.Service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class MultiplosDe5Service {
    public List<Integer> contador0A50() {

        List<Integer> numeroList = new ArrayList<>();

        for (Integer contador = 0; contador <= 50; contador += 5) {
            numeroList.add(contador);
        }
        return numeroList ;
    }
}