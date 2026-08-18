package br.com.calculadoraposto;

import br.com.calculadoraposto.controller.CalculadoraController;
import br.com.calculadoraposto.service.CalculoService;
import br.com.calculadoraposto.view.CalculadoraView;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {

            CalculoService service = new CalculoService();

            CalculadoraView view = new CalculadoraView();

            new CalculadoraController(view, service);

            view.setVisible(true);
        });
    }
}