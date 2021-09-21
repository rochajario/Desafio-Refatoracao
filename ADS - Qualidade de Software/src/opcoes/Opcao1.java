package opcoes;

import javax.swing.JOptionPane;

import aplicacao.Fila;
import aplicacao.Pessoa;

public final class Opcao1 extends OpcaoMenu {

    public Opcao1() {
        this.idOpcao = 1;
    }

    @Override
    protected Fila acao(Fila fila) {
        int numeroCartao = 0;
        Fila processamentoFila = fila;

        try {
            numeroCartao = Integer.parseInt(JOptionPane.showInputDialog("NÚMERO DO CARTÃO: ", "0"));
        } catch (NumberFormatException e) {
            agenteDeErro(e);
            return fila;
        }

        if (this.cartaoFoiCriado(fila, numeroCartao)) {
            JOptionPane.showMessageDialog(null, "Esse número do cartão já foi usado.\nFavor verificar!");
            return fila;
        }

        if (!this.cartaoFoiCriado(fila, numeroCartao)) {
            try {
                int cartao = numeroCartao;
                String nome = JOptionPane.showInputDialog("NOME: ", "");
                String sobrenome = JOptionPane.showInputDialog("SOBRENOME: ", "");
                double valor = Double.parseDouble(JOptionPane.showInputDialog("VALOR: ", "0"));

                processamentoFila.adicionaPessoa(new Pessoa(cartao, nome, sobrenome, valor));

            } catch (NumberFormatException e) {
                agenteDeErro(e);
                return fila;
            }
        }

        JOptionPane.showMessageDialog(null, "O cartão número " + numeroCartao + ", foi inserido para atendimento: ",
                "MENSAGEM DO PROGRAMA", JOptionPane.CLOSED_OPTION);
        logger.info("Acessou opção: Recepcionar cliente - " + getDateTime());

        return processamentoFila;
    }

    private boolean cartaoFoiCriado(Fila fila, int cartao) {
        boolean status = false;

        Pessoa[] pessoas = fila.toArray();

        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getCartao() == cartao) {
                status = true;
            }
        }
        return status;
    }
}
