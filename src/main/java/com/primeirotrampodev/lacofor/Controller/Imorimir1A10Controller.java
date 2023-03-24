package com.primeirotrampodev.lacofor.Controller;

import com.primeirotrampodev.lacofor.Service.Imprimir1A10Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contador")
public class Imorimir1A10Controller {

    @Autowired
    private Imprimir1A10Service imprimir1A10Service;
    @GetMapping("/imprimir1a10")
    public void  imprimir1a10(){
        imprimir1A10Service.imprimir1a10();

    }
}
