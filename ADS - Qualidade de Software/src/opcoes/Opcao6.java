package opcoes;

import javax.swing.JOptionPane;

import aplicacao.Fila;
import aplicacao.Pessoa;

public final class Opcao6 extends OpcaoMenu {

    public Opcao6() {
        this.idOpcao = 6;
    }

    @Override
    protected Fila acao(Fila fila) {
        Pessoa[] pessoas = fila.toArray();
        int cartao = Integer.parseInt(JOptionPane.showInputDialog("Informe o número do cartão", "0"));

        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getCartao() == cartao) {
                String texto = "CARTÃO: " + pessoas[i].getCartao() + "\n" + "NOME: " + pessoas[i].getNome() + "\n"
                        + "SOBRENOME: " + pessoas[i].getSobrenome() + "\n" + "VALOR: " + pessoas[i].getValor() + "\n"
                        + "POSIÇÃO: " + (i + 1) + "a. POSIÇÃO";
                JOptionPane.showMessageDialog(null, "DADOS DO CLIENTE: \n\n" + texto, "MENSAGEM DO PROGRAMA",
                        JOptionPane.CLOSED_OPTION);
            }
        }

        logger.info("Acessou opção: Localizar cliente por número - " + getDateTime());
        return fila;
    }

}