package com.primeirotrampodev.lacofor.Controller;

import com.primeirotrampodev.lacofor.Service.ListaDePalavrasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/laço-for")
public class ListaDePalavrasController {
    @Autowired
    private ListaDePalavrasService listaDePalavrasService;

    @GetMapping("/palavras-list")
    public List<String> palavasList(@RequestParam ("texto") String texto){

        return listaDePalavrasService.palavasList(texto);
    }
}
