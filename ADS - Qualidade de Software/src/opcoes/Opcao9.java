package opcoes;

import javax.swing.JOptionPane;

import aplicacao.Fila;

public final class Opcao9 extends OpcaoMenu {

    public Opcao9() {
        this.idOpcao = 9;
    }

    @Override
    protected Fila acao(Fila fila) {
        int resposta = JOptionPane.showConfirmDialog(null, "DESEJA VER ARQUIVO?", "MENSAGEM",
                JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            try {
                Process pro = Runtime.getRuntime().exec("cmd.exe /c  c://Dados//Atendimento.txt");
                pro.waitFor();
            } catch (Exception e) {
                logger.warning("Erro . . . ");
            }
        }
        logger.info("Acessou opção: Ver relatório de clientes - " + getDateTime());

        return fila;
    }

}