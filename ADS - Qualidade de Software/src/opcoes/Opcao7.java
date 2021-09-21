package opcoes;

import javax.swing.JOptionPane;

import aplicacao.Fila;
import aplicacao.Pessoa;

public final class Opcao7 extends OpcaoMenu {

    public Opcao7() {
        this.idOpcao = 7;
    }

    @Override
    protected Fila acao(Fila fila) {
        String nome = JOptionPane.showInputDialog("Nome do cliente", "");
        Pessoa[] pessoas = fila.toArray();

        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getNome().equals(nome)) {
                String texto = "CART�O: " + pessoas[i].getCartao() + "\n" + "NOME: " + pessoas[i].getNome() + "\n"
                        + "SOBRENOME: " + pessoas[i].getSobrenome() + "\n" + "VALOR: " + pessoas[i].getSobrenome()
                        + "\n" + "POSI��O: " + (i + 1) + "a. POSI��O";
                JOptionPane.showMessageDialog(null, "DADOS DO CLIENTE: \n\n" + texto, "MENSAGEM DO PROGRAMA",
                        JOptionPane.CLOSED_OPTION);
            }
        }
        logger.info("Acessou op��o: Localizar cliente por nome - " + getDateTime());

        return fila;
    }

}