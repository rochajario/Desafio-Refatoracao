package opcoes;

import javax.swing.JOptionPane;

import aplicacao.Fila;
import aplicacao.Pessoa;

public final class Opcao4 extends OpcaoMenu {

    public Opcao4() {
        this.idOpcao = 4;
    }

    @Override
    protected Fila acao(Fila fila) {
        Pessoa[] pessoas = fila.toArray();

        if (pessoas.length == 0) {
            JOptionPane.showMessageDialog(null, "NÃO HÁ ATENDIMENTOS", "MENSAGEM DO PROGRAMA",
                    JOptionPane.CLOSED_OPTION);
            return fila;
        }
        JOptionPane.showMessageDialog(null, " * * O ATENDIMENTO FOI LIBERADO * *", "MENSAGEM DO PROGRAMA",
                JOptionPane.CLOSED_OPTION);
        logger.info("Acessou opção: Liberar todos os clientes - " + getDateTime());

        return new Fila();
    }

}