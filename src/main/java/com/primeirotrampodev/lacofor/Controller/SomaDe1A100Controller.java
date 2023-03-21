package com.primeirotrampodev.lacofor.Controller;
import com.primeirotrampodev.lacofor.Service.SomaDe1A100Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/laço-for")
public class SomaDe1A100Controller {
    @Autowired
    SomaDe1A100Service somaDosNumerosService ;
    @GetMapping("/soma")
    private Integer somaDosNumeros(){

       Integer total = somaDosNumerosService.somaDe1A100();

        return total;
    }

}
