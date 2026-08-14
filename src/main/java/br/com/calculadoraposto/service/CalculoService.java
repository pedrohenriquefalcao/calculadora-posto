package br.com.calculadoraposto.service;

public class CalculosService {

    // regra tela 1
    public double calcularAcrescimo(double valorAtual, double porcentagem) {
        return valorAtual + (valorAtual * (porcentagem / 100));
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
