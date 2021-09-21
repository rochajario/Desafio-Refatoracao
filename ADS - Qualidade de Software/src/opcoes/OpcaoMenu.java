package opcoes;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import aplicacao.Fila;

public abstract class OpcaoMenu {

    protected final Logger logger = Logger.getLogger(OpcaoMenu.class.getName());

    protected int idOpcao;

    public Fila executa(int opcaoUsuario, Fila fila) {
        if (this.idOpcao != opcaoUsuario) {
            return fila;
        }
        return acao(fila);
    }

    protected abstract Fila acao(Fila fila);

    protected static void agenteDeErro(NumberFormatException e) {
        JOptionPane.showMessageDialog(null,
                "ERRO AO TENTAR CONVERTER UM VALOR\nFAVOR VERIRIFICAR\nMENSAGEM ORIGINAL: " + e.getMessage(),
                "AGENTE DE ERRO", JOptionPane.CLOSED_OPTION);
    }

    protected static String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }
}
