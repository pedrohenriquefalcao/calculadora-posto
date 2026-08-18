package br.com.calculadoraposto.view;

import javax.swing.*;
import java.awt.*;

public class CalculadoraView extends JFrame {

    Color corFundo = new Color(228, 224, 224);

    public JTextField txtT1ValorDesejado = new JTextField();
    public JTextField txtT1ValorAcrescimo = new JTextField();
    public JTextField txtT1ValorLitroAtual = new JTextField();
    public JTextField txtT1ResultadoLitros = new JTextField();

    public JComboBox<String> comboT2QueroDescobrir = new JComboBox<>(new String[]{"VALOR", "LITRO"});
    public JTextField txtT2Quanto = new JTextField();
    public JTextField txtT2ValorLitroAtual = new JTextField();
    public JTextField txtT2ResultadoReais = new JTextField();
    public JTextField txtT2ResultadoLitragem = new JTextField();

    public JTextField txtT3ValorAlcool = new JTextField();
    public JTextField txtT3ValorGasolina = new JTextField();
    public JTextField txtT3Razao = new JTextField();

    public CalculadoraView() {
        setTitle("Calculadora do Posto");
        setSize(700, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JTabbedPane abas = new JTabbedPane();
        abas.addTab("ACRÉSCIMO", montarTelaAcrescimo());
        abas.addTab("DESCOBRIR VALOR/LITRAGEM", montarTelaConversao());
        abas.addTab("RAZÃO ALCOOL/GASOLINA", montarTelaRazao());

        add(abas);

        // blindagem utilitario
        permitirApenasNumeros(txtT1ValorDesejado); permitirApenasNumeros(txtT1ValorAcrescimo); permitirApenasNumeros(txtT1ValorLitroAtual);

        permitirApenasNumeros(txtT2Quanto); permitirApenasNumeros(txtT2ValorLitroAtual);

        permitirApenasNumeros(txtT3ValorAlcool); permitirApenasNumeros(txtT3ValorGasolina);

    }

    private JPanel montarTelaAcrescimo() {
        JPanel painel = new JPanel(new GridBagLayout());
        painel.setBackground(corFundo);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(15, 10, 15, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        txtT1ResultadoLitros.setEditable(false);

        gbc.gridx = 0; gbc.gridy = 0; painel.add(new JLabel("VALOR DESEJADO"), gbc);
        gbc.gridx = 1; gbc.ipadx = 150; painel.add(txtT1ValorDesejado, gbc);
        gbc.gridx = 2; gbc.ipadx = 0; painel.add(new JLabel("R$"), gbc);

        gbc.gridx = 0; gbc.gridy = 1; painel.add(new JLabel("VALOR DO ACRÉSCIMO"), gbc);
        gbc.gridx = 1; painel.add(txtT1ValorAcrescimo, gbc);
        gbc.gridx = 2; painel.add(new JLabel("R$"), gbc);

        gbc.gridx = 0; gbc.gridy = 2; painel.add(new JLabel("VALOR DO LITRO ATUAL"), gbc);
        gbc.gridx = 1; painel.add(txtT1ValorLitroAtual, gbc);
        gbc.gridx = 2; painel.add(new JLabel("R$"), gbc);

        gbc.gridy = 3; gbc.insets = new Insets(40, 10, 15, 10);
        gbc.gridx = 0; painel.add(new JLabel("VOCÊ DEVE ABASTECER"), gbc);
        gbc.gridx = 1; painel.add(txtT1ResultadoLitros, gbc);
        gbc.gridx = 2; painel.add(new JLabel("LITROS"), gbc);

        return painel;
    }

    private JPanel montarTelaConversao() {
        JPanel painel = new JPanel(new GridBagLayout());
        painel.setBackground(corFundo);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(15, 10, 15, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        txtT2ResultadoReais.setEditable(false);
        txtT2ResultadoLitragem.setEditable(false);

        gbc.gridx = 0; gbc.gridy = 0; painel.add(new JLabel("QUERO DESCOBRIR"), gbc);
        gbc.gridx = 1; gbc.ipadx = 150; painel.add(comboT2QueroDescobrir, gbc);

        gbc.gridx = 0; gbc.gridy = 1; painel.add(new JLabel("QUANTO?"), gbc);
        gbc.gridx = 1; painel.add(txtT2Quanto, gbc);

        gbc.gridx = 0; gbc.gridy = 2; painel.add(new JLabel("VALOR DO LITRO ATUAL"), gbc);
        gbc.gridx = 1; painel.add(txtT2ValorLitroAtual, gbc);
        gbc.gridx = 2; gbc.ipadx = 0; painel.add(new JLabel("R$"), gbc);

        gbc.gridy = 3; gbc.insets = new Insets(40, 10, 5, 10);
        gbc.gridx = 0; painel.add(new JLabel("RESULTADO:"), gbc);
        gbc.gridx = 1; painel.add(txtT2ResultadoReais, gbc);
        gbc.gridx = 2; painel.add(new JLabel("REAIS"), gbc);

        gbc.gridy = 4; gbc.insets = new Insets(5, 10, 15, 10);
        gbc.gridx = 0; painel.add(new JLabel(""), gbc);
        gbc.gridx = 1; painel.add(txtT2ResultadoLitragem, gbc);
        gbc.gridx = 2; painel.add(new JLabel("LITRAGEM"), gbc);

        return painel;
    }

    private JPanel montarTelaRazao() {
        JPanel painel = new JPanel(new GridBagLayout());
        painel.setBackground(corFundo);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(15, 10, 15, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        txtT3Razao.setEditable(false);

        gbc.gridx = 0; gbc.gridy = 0; painel.add(new JLabel("VALOR DO ÁLCOOL"), gbc);
        gbc.gridx = 1; gbc.ipadx = 150; painel.add(txtT3ValorAlcool, gbc);
        gbc.gridx = 2; gbc.ipadx = 0; painel.add(new JLabel("R$"), gbc);

        gbc.gridx = 0; gbc.gridy = 1; painel.add(new JLabel("VALOR DA GASOLINA"), gbc);
        gbc.gridx = 1; painel.add(txtT3ValorGasolina, gbc);
        gbc.gridx = 2; painel.add(new JLabel("R$"), gbc);

        gbc.gridy = 2; gbc.insets = new Insets(40, 10, 15, 10);
        gbc.gridx = 0; painel.add(new JLabel("RAZÃO DE"), gbc);
        gbc.gridx = 1; painel.add(txtT3Razao, gbc);

        return painel;
    }

// utilitarios ============================================================================

    // proibe usuario inputar letras e caracteres
    private void permitirApenasNumeros(JTextField campo) {
        campo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c) && c != '.' && c != ',') {
                    e.consume();
                }
            }
        });
    }

}