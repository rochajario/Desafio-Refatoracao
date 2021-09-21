package opcoes;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import aplicacao.Fila;
import aplicacao.Pessoa;

public class Opcao10 extends OpcaoMenu {

    public Opcao10() {
        this.idOpcao = 10;
    }

    @Override
    protected Fila acao(Fila fila) {
        Pessoa[] pessoas = fila.toArray();

        double filtro = Double
                .parseDouble(JOptionPane.showInputDialog("FILTRAR ATENDIMENTOS PARA VALORES SUPERIORES A: ", ""));
        JTextArea saida = new JTextArea(6, 45); // HEIGHT X WIDTH
        JScrollPane scroll = new JScrollPane(saida);
        saida.append("CARTÃO\t" + "NOME\t" + "SOBRENOME\t" + "VALOR\n");
        saida.append("----------------------------------------------------------------------------\n");

        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getValor() > filtro) {
                saida.append(pessoas[i].getCartao() + "\t" + pessoas[i].getNome() + "\t" + pessoas[i].getSobrenome()
                        + "\t" + pessoas[i].getValor() + "\n");
            }
        }
        saida.append("\n");

        JOptionPane.showMessageDialog(null, scroll, "ATENDIMENTOS COM VALORES SUPERIORES A: " + filtro,
                JOptionPane.CLOSED_OPTION);
        logger.info("Acessou opção: Filtrar clientes por valor - " + getDateTime());

        return fila;
    }

}