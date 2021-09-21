package opcoes;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import aplicacao.Fila;
import aplicacao.Pessoa;

public final class Opcao2 extends OpcaoMenu {

    public Opcao2() {
        this.idOpcao = 2;
    }

    @Override
    protected Fila acao(Fila fila) {
        Pessoa[] pessoas = fila.toArray();

        if (pessoas.length == 0) {
            JOptionPane.showMessageDialog(null, "NÃO HÁ ATENDIMENTOS", "MENSAGEM DO PROGRAMA",
                    JOptionPane.CLOSED_OPTION);
            return fila;
        }

        JTextArea saida = new JTextArea(6, 45); // HEIGHT X WIDTH
        JScrollPane scroll = new JScrollPane(saida);
        saida.append("CARTÃO\t" + "NOME\t" + "SOBRENOME\t" + "VALOR\n");
        saida.append("-------------------------------------------------------------------------\n");

        for (int i = 0; i < pessoas.length; i++) {
            saida.append(pessoas[i].getCartao() + "\t" + pessoas[i].getNome() + "\t" + pessoas[i].getSobrenome() + "\t"
                    + pessoas[i].getValor() + "\n");
        }

        saida.append("\n");

        JOptionPane.showMessageDialog(null, scroll, "CONSULTAR DADOS DO ATENDIMENTO", JOptionPane.CLOSED_OPTION);
        logger.info("Acessou opção: Consultar clientes a serem atendidos - " + getDateTime());
        return fila;
    }

}