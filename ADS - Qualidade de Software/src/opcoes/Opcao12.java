package opcoes;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import aplicacao.Fila;

public final class Opcao12 extends OpcaoMenu {

    public Opcao12() {
        this.idOpcao = 12;
    }

    @Override
    protected Fila acao(Fila fila) {
        JTextArea saida = new JTextArea(8, 30); // HEIGHT X WIDTH
        saida.append("\n");
        saida.append("PROGRAMA DE ATENDIMENTO AO CLIENTE\n");
        saida.append("-------------------------------------------------------------\n");
        saida.append("Copyright (c) Byta Bug Informática Ltda\n");
        saida.append("Programadores: Asdrubal, Zemprônia e Gilmar\n");
        saida.append("Versão 1.0\n");
        saida.append("Data: Abril de 2021\n");
        saida.append("refatorado por: JARIO ROCHA - ADS-UNA 2021/1!");
        saida.append("\n");
        JOptionPane.showMessageDialog(null, saida, "SOBRE O PROGRAMA", JOptionPane.CLOSED_OPTION);
        logger.info("Acessou opção: Sobre - " + getDateTime());

        return fila;
    }

}