package br.com.joeltreinos.restwithspring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.joeltreinos.restwithspring.Service.SimpleMathService;

@RestController
public class MathController {

    @Autowired
    private SimpleMathService simpleMathService;

    @RequestMapping(path="/soma",method = RequestMethod.POST)
    public Double soma(
        @RequestParam(value = "numeroUm") String numeroUm,
        @RequestParam(value = "numeroDois") String numeroDois
    ) throws Exception{
        return simpleMathService.soma(numeroUm, numeroDois);
    }

    @RequestMapping(path="/subtrai",method = RequestMethod.POST)
    public Double subtrai(
        @RequestParam(value = "numeroUm") String numeroUm,
        @RequestParam(value = "numeroDois") String numeroDois
    ) throws Exception{
        return simpleMathService.subtrai(numeroUm, numeroDois);
    }

    @RequestMapping(path="/multiplica",method = RequestMethod.POST)
    public Double multiplica(
        @RequestParam(value = "numeroUm") String numeroUm,
        @RequestParam(value = "numeroDois") String numeroDois
    ) throws Exception{
        return simpleMathService.multiplica(numeroUm, numeroDois);
    }

    @RequestMapping(path="/divide",method = RequestMethod.POST)
    public Double divide(
        @RequestParam(value = "numeroUm") String numeroUm,
        @RequestParam(value = "numeroDois") String numeroDois
    ) throws Exception{
        return simpleMathService.divide(numeroUm, numeroDois);
    }

}
