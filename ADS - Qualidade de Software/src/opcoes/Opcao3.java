package opcoes;

import javax.swing.JOptionPane;

import aplicacao.Fila;
import aplicacao.Pessoa;

public final class Opcao3 extends OpcaoMenu {

    public Opcao3() {
        this.idOpcao = 3;
    }

    @Override
    protected Fila acao(Fila fila) {
        Pessoa[] pessoas = fila.toArray();

        if (pessoas.length == 0) {
            JOptionPane.showMessageDialog(null, "N�O H� ATENDIMENTOS", "MENSAGEM DO PROGRAMA",
                    JOptionPane.CLOSED_OPTION);
            return fila;
        }

        Pessoa pessoa = pessoas[0];

        fila.proximo();

        JOptionPane.showMessageDialog(null,
                "CART�O:  " + pessoa.getCartao() + ", NOME: " + pessoa.getNome() + " foi atendido(a)!",
                "MENSAGEM DO PROGRAMA", JOptionPane.CLOSED_OPTION);

        logger.info("Acessou op��o: Atender cliente - " + getDateTime());
        return fila;
    }

}