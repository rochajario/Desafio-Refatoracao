package opcoes;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import aplicacao.Fila;
import aplicacao.Pessoa;

public final class Opcao11 extends OpcaoMenu {

    public Opcao11() {
        this.idOpcao = 11;
    }

    @Override
    protected Fila acao(Fila fila) {
        Pessoa[] pessoas = fila.toArray();
        if (pessoas.length == 0) {
            JOptionPane.showMessageDialog(null, "NÃO HÁ ATENDIMENTOS", "MENSAGEM DO PROGRAMA",
                    JOptionPane.CLOSED_OPTION);
            return fila;
        }

        JTextArea saida = new JTextArea(7, 45); // HEIGHT X WIDTH
        JScrollPane scroll = new JScrollPane(saida);
        saida.append("NOME\t" + "ENDEREÇO\t\n");
        saida.append("-----------------------\n");

        for (int i = 0; i < pessoas.length; i++) {
            saida.append(pessoas[i].getNome() + "\t" + pessoas[i].hashCode() + "\n");
        }
        saida.append("\n");

        JOptionPane.showMessageDialog(null, scroll, "CONSULTAR DADOS DO ATENDIMENTO", JOptionPane.CLOSED_OPTION);
        logger.info("Acessou opção: Ver endereços hash - " + getDateTime());

        return fila;
    }

}