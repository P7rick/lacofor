package com.primeirotrampodev.lacofor.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.primeirotrampodev.lacofor.Service.ContadorUmADezService;
import java.util.List;

@RestController
@RequestMapping("laço-for")
public class ContadorUmADezController {
    @Autowired
    private ContadorUmADezService contadorUmADezService;
    @GetMapping("/metodo-umadez")
    public List<Integer> contadorUmADez(){

        return contadorUmADezService.contador1a10();
    }

}
