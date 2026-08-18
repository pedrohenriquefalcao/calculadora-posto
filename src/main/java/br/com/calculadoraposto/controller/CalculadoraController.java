package br.com.calculadoraposto.controller;

import br.com.calculadoraposto.service.CalculoService;
import br.com.calculadoraposto.view.CalculadoraView;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class CalculadoraController {

    private CalculadoraView view;
    private CalculoService service;

    public CalculadoraController(CalculadoraView view, CalculoService service) {
        this.view = view;
        this.service = service;
        iniciarOuvintesDeTexto();
    }

    private void iniciarOuvintesDeTexto() {
        KeyAdapter listenerTela1 = new KeyAdapter() {
            public void keyReleased(KeyEvent e) { processarAcrescimo(); }
        };
        view.txtT1ValorDesejado.addKeyListener(listenerTela1);
        view.txtT1ValorAcrescimo.addKeyListener(listenerTela1);
        view.txtT1ValorLitroAtual.addKeyListener(listenerTela1);

        KeyAdapter listenerTela2 = new KeyAdapter() {
            public void keyReleased(KeyEvent e) { processarConversao(); }
        };
        view.txtT2Quanto.addKeyListener(listenerTela2);
        view.txtT2ValorLitroAtual.addKeyListener(listenerTela2);
        view.comboT2QueroDescobrir.addActionListener(e -> processarConversao());

        KeyAdapter listenerTela3 = new KeyAdapter() {
            public void keyReleased(KeyEvent e) { processarCombustivel(); }
        };
        view.txtT3ValorAlcool.addKeyListener(listenerTela3);
        view.txtT3ValorGasolina.addKeyListener(listenerTela3);
    }


    private void processarAcrescimo() {
        try {
            double valorDesejado = Double.parseDouble(view.txtT1ValorDesejado.getText().replace(",", "."));
            double acrescimo = Double.parseDouble(view.txtT1ValorAcrescimo.getText().replace(",", "."));
            double precoAtual = Double.parseDouble(view.txtT1ValorLitroAtual.getText().replace(",", "."));

            double litrosParaAbastecer = service.calcularLitrosComAcrescimo(valorDesejado, precoAtual, acrescimo);

            view.txtT1ResultadoLitros.setText(String.format("%.3f", litrosParaAbastecer).replace(".", ","));
        } catch (NumberFormatException ex) {
            view.txtT1ResultadoLitros.setText("");
        }
    }


    private void processarConversao() {
        try {
            String opcao = view.comboT2QueroDescobrir.getSelectedItem().toString();
            double quanto = Double.parseDouble(view.txtT2Quanto.getText().replace(",", "."));
            double precoLitro = Double.parseDouble(view.txtT2ValorLitroAtual.getText().replace(",", "."));

            if (opcao.equals("VALOR")) {
                double reaisCalculado = service.calcularReais(quanto, precoLitro);
                view.txtT2ResultadoReais.setText(String.format("%.2f", reaisCalculado).replace(".", ","));
                view.txtT2ResultadoLitragem.setText(String.format("%.3f", quanto).replace(".", ","));
            } else {
                double litrosCalculado = service.calcularLitros(quanto, precoLitro);
                view.txtT2ResultadoLitragem.setText(String.format("%.3f", litrosCalculado).replace(".", ","));
                view.txtT2ResultadoReais.setText(String.format("%.2f", quanto).replace(".", ","));
            }
        } catch (NumberFormatException ex) {
            view.txtT2ResultadoReais.setText("");
            view.txtT2ResultadoLitragem.setText("");
        }
    }

    private void processarCombustivel() {
        try {
            double alcool = Double.parseDouble(view.txtT3ValorAlcool.getText().replace(",", "."));
            double gasolina = Double.parseDouble(view.txtT3ValorGasolina.getText().replace(",", "."));

            double razao = service.calcularProporcaoAlcool(alcool, gasolina);

            view.txtT3Razao.setText(String.format("%.1f%%", razao).replace(".", ","));
        } catch (NumberFormatException ex) {
            view.txtT3Razao.setText("");
        }
    }
}