package Desafio.ConversaoDolar;

public class ConversorMoeda implements ConversaoFinanceira {

    @Override
    public void converterDolarEmReal(double valorDolar) {
        double cotacaoDolar = 5.60;
        double valorEmReal = valorDolar * cotacaoDolar;
        System.out.println("O valor convertido em real é de:  R$ " + valorEmReal + " reais.");
    }
}
