package com.primeirotrampodev.lacofor.Controller;

import com.primeirotrampodev.lacofor.Service.DivisoresLaçoForService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/laço-for")
public class DivisoresLaçoForController {

    @Autowired
    private DivisoresLaçoForService divisoresLaçoForService;
    @GetMapping("/dividindo")
    private Integer multiplosDeCinco(@RequestParam("numero") Integer numero) {

        return divisoresLaçoForService.divisores(numero);
    }
}
