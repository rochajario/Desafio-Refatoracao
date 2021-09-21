package opcoes;

import javax.swing.JOptionPane;

import aplicacao.Fila;
import aplicacao.Pessoa;

public final class Opcao5 extends OpcaoMenu {

    public Opcao5() {
        this.idOpcao = 5;
    }

    @Override
    protected Fila acao(Fila fila) {
        Pessoa[] pessoas = fila.toArray();
        double valorTotal = 0;

        for (int i = 0; i < pessoas.length; i++) {
            valorTotal = valorTotal + pessoas[i].getValor();
        }

        JOptionPane.showMessageDialog(null,
                "O ATENDIMENTO CONTÉM: " + pessoas.length + " ELEMENTOS.\nVALOR TOTAL: " + valorTotal + "\n",
                "MENSAGEM DO PROGRAMA", JOptionPane.CLOSED_OPTION);
        logger.info("Acessou opção: Verificar quantidade de clientes a atender - " + getDateTime());
        return fila;
    }

}