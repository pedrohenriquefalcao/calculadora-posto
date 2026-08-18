package br.com.calculadoraposto.service;

public class CalculoService {

    // regra tela 1
    public double calcularValorParaCobrar(double litrosBomba, double precoBomba, double acrescimo) {
        double precoComAcrescimo = precoBomba + acrescimo;
        return litrosBomba * precoComAcrescimo;
    }

    public double calcularValorParaDigitarNaBomba(double valorQueOClienteVaiPagar, double precoBomba, double acrescimo) {
        double precoComAcrescimo = precoBomba + acrescimo;
        double litrosQueOClienteTemDireito = valorQueOClienteVaiPagar / precoComAcrescimo;
        
        return litrosQueOClienteTemDireito * precoBomba;
    }

    public double calcularLitrosComAcrescimo(double valorQueOClienteVaiPagar, double precoBomba, double acrescimo) {
        double precoComAcrescimo = precoBomba + acrescimo;
        return valorQueOClienteVaiPagar / precoComAcrescimo;
    }

    // regra tela 2
    public double calcularLitros(double valorReais, double precoLitro) {
        return valorReais / precoLitro;
    }

    public double calcularReais(double litros, double precoLitro) {
        return litros * precoLitro;
    }

    // regra tela 3
    public double calcularProporcaoAlcool(double precoAlcool, double precoGasolina) {
        return (precoAlcool / precoGasolina) * 100;
    }

    public boolean compensaAlcool(double proporcao) {
        // se a proporção for menor ou igual a 70% = alcool melhor opcao
        return proporcao <= 70.0;
    }
}
