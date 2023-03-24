package com.primeirotrampodev.lacofor.Service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Imprimir1A10Service {

    public  void imprimir1a10(){

        for(Integer cont = 1; cont <=10; cont++){
            System.out.println(cont);
        }

    }

}
