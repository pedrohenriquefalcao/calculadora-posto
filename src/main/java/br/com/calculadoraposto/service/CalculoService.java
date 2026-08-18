package br.com.calculadoraposto.service;

public class CalculoService {


    private void validarMaiorQueZero(double valor, String nomeDoCampo) {
        if (valor <= 0) {
            throw new IllegalArgumentException(nomeDoCampo + " deve ser maior que zero.");
        }
    }

    private void validarPositivoOuZero(double valor, String nomeDoCampo) {
        if (valor < 0) {
            throw new IllegalArgumentException(nomeDoCampo + " não pode ser negativo.");
        }
    }


    public double calcularValorParaCobrar(double litrosBomba, double precoBomba, double acrescimo) {
        validarPositivoOuZero(litrosBomba, "Litragem");
        validarMaiorQueZero(precoBomba, "Preço da bomba");
        validarPositivoOuZero(acrescimo, "Acréscimo");

        double precoComAcrescimo = precoBomba + acrescimo;
        return litrosBomba * precoComAcrescimo;
    }

    public double calcularValorParaDigitarNaBomba(double valorQueOClienteVaiPagar, double precoBomba, double acrescimo) {
        validarPositivoOuZero(valorQueOClienteVaiPagar, "Valor a pagar");
        validarMaiorQueZero(precoBomba, "Preço da bomba");
        validarPositivoOuZero(acrescimo, "Acréscimo");

        double precoComAcrescimo = precoBomba + acrescimo;
        double litrosQueOClienteTemDireito = valorQueOClienteVaiPagar / precoComAcrescimo;

        return litrosQueOClienteTemDireito * precoBomba;
    }

    public double calcularLitrosComAcrescimo(double valorQueOClienteVaiPagar, double precoBomba, double acrescimo) {
        validarPositivoOuZero(valorQueOClienteVaiPagar, "Valor a pagar");
        validarMaiorQueZero(precoBomba, "Preço da bomba");
        validarPositivoOuZero(acrescimo, "Acréscimo");

        double precoComAcrescimo = precoBomba + acrescimo;
        return valorQueOClienteVaiPagar / precoComAcrescimo;
    }


    public double calcularLitros(double valorReais, double precoLitro) {
        validarPositivoOuZero(valorReais, "Valor em reais");
        validarMaiorQueZero(precoLitro, "Preço do litro");

        return valorReais / precoLitro;
    }

    public double calcularReais(double litros, double precoLitro) {
        validarPositivoOuZero(litros, "Litragem");
        validarMaiorQueZero(precoLitro, "Preço do litro");

        return litros * precoLitro;
    }

    public double calcularProporcaoAlcool(double precoAlcool, double precoGasolina) {
        validarMaiorQueZero(precoAlcool, "Preço do álcool");
        validarMaiorQueZero(precoGasolina, "Preço da gasolina");
        return (precoAlcool / precoGasolina) * 100;
    }

    public boolean compensaAlcool(double proporcao) {
        // se a proporção for menor ou igual a 70% = alcool melhor opcao
        validarPositivoOuZero(proporcao, "Proporção");
        return proporcao <= 70.0;
    }
}