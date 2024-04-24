package br.com.joeltreinos.restwithspring.Service;

import org.springframework.stereotype.Service;

import br.com.joeltreinos.restwithspring.Exceptions.UnsupportedMathOperationException;

@Service
public class SimpleMathService {



    public boolean isNumeric(String numero) {
        if(numero == null) return false;
        String number = numero.replace(',', '.');
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }

    public Double convertToDouble(String number){
        if(number == null) return 0D;
        String newNumber = number.replace(',', '.');
        if (isNumeric(newNumber)) return Double.parseDouble(newNumber);
        return 0D;

    }

    public Double soma(String numeroUm, String numeroDois) {
        double primeiro;
        double segundo;
        verificaNumeros(numeroUm, numeroDois);
        primeiro = convertToDouble(numeroUm);
        segundo = convertToDouble(numeroDois);
        return primeiro + segundo;
    }

    private void verificaNumeros(String numeroUm, String numeroDois) {
        if(!isNumeric(numeroUm) || !isNumeric(numeroDois)){
            throw new UnsupportedMathOperationException("Por favor envie um número válido");
        }
    }

    public Double subtrai(String numeroUm, String numeroDois) {
        double primeiro;
        double segundo;
        verificaNumeros(numeroUm, numeroDois);
        primeiro = convertToDouble(numeroUm);
        segundo = convertToDouble(numeroDois);
        return primeiro - segundo;
    }

    public Double multiplica(String numeroUm, String numeroDois) {
        double primeiro;
        double segundo;
        verificaNumeros(numeroUm, numeroDois);
        primeiro = convertToDouble(numeroUm);
        segundo = convertToDouble(numeroDois);
        return primeiro * segundo;
    }

    public Double divide(String numeroUm, String numeroDois) {
        double primeiro;
        double segundo;
        verificaNumeros(numeroUm, numeroDois);
        primeiro = convertToDouble(numeroUm);
        segundo = convertToDouble(numeroDois);
        return primeiro / segundo;
    }

}
