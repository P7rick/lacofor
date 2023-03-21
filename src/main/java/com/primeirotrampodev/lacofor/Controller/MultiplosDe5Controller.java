package com.primeirotrampodev.lacofor.Controller;

import com.primeirotrampodev.lacofor.Service.MultiplosDe5Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/laço-for")
public class MultiplosDe5Controller {
    @Autowired
    private MultiplosDe5Service multiplosDe5Service;
    @GetMapping("/multiplos-cinco")
    private List<Integer> multiplosDeCinco(){

        return multiplosDe5Service.contador0A50();
    }

}
