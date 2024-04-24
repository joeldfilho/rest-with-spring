package br.com.joeltreinos.restwithspring.Controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {
    private static final String template = "Olá %s";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/sum")
    public Double sum(
        @RequestParam(value = "numeroUm") String numeroUm,
        @RequestParam(value = "numeroDois") String numeroDois
    ) throws Exception{
        double primeiro;
        double segundo;
        if(!isNumeric(numeroUm) || !isNumeric(numeroDois)){
            throw new Exception();
        }
        primeiro = convertToDouble(numeroUm);
        segundo = convertToDouble(numeroDois);
        return primeiro + segundo;
    }

    private boolean isNumeric(String numero) {
        if(numero == null) return false;
        String number = numero.replace(',', '.');
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }

    private Double convertToDouble(String number){
        if(number == null) return 0D;
        String newNumber = number.replace(',', '.');
        if (isNumeric(newNumber)) return Double.parseDouble(newNumber);
        return 0D;

    }
}
