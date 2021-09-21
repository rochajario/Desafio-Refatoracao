package opcoes;

import javax.swing.JOptionPane;

import aplicacao.Fila;

public class Opcao13 extends OpcaoMenu {

    public Opcao13() {
        this.idOpcao = 13;
    }

    @Override
    protected Fila acao(Fila fila) {
        logger.info("Programa finalizado em: " + getDateTime());
        JOptionPane.showMessageDialog(null, "PROGRAMA FINALIZADO!");
        fila.setRecebendoClientes(false);
        return fila;
    }

}
