package opcoes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

import aplicacao.Fila;
import aplicacao.Pessoa;

public final class Opcao8 extends OpcaoMenu {

    public Opcao8() {
        this.idOpcao = 8;
    }

    @Override
    protected Fila acao(Fila fila) {
        Pessoa[] pessoas = fila.toArray();

        if (pessoas.length == 0) {
            JOptionPane.showMessageDialog(null, "NÃO HÁ ATENDIMENTOS", "MENSAGEM DO PROGRAMA",
                    JOptionPane.CLOSED_OPTION);
            return fila;
        }

        this.criaArquivo("C:/DADOS");

        try {
            FileWriter arq = new FileWriter("c:\\Dados\\Atendimento.txt");

            try (PrintWriter gravar = new PrintWriter(arq)) {
                for (int i = 0; i < pessoas.length; i++) {
                    gravar.printf("%d, %s, %s, %.2f %n", pessoas[i].getCartao(), pessoas[i].getNome(),
                            pessoas[i].getSobrenome(), pessoas[i].getValor());
                }

                gravar.printf("%s %n", "--------------------------");
                gravar.printf("%s %n", "copyright (c) by: Fulano de Tal, Sicrano de Tal");
            }

            arq.close();

        } catch (IOException e) {
            logger.warning("MENSAGEM / CLASS ArquivoTexto:\nErro ao tentar gravar no arquivo");
        }

        JOptionPane.showMessageDialog(null, "ARQUIVO GRAVADO COM SUCESSO", "MENSAGEM DO SISTEMA",
                JOptionPane.CLOSED_OPTION);

        logger.info("Acessou opção: Emitir relatório de clientes - " + getDateTime());

        return fila;
    }

    private void criaArquivo(String local) {
        File file = new File(local);
        if (!file.exists()) {
            file.mkdirs();
        }
    }

}