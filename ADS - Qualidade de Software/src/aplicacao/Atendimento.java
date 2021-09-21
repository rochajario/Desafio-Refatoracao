package aplicacao;

import java.util.logging.Logger;

import javax.swing.JOptionPane;

import opcoes.Opcao1;
import opcoes.Opcao10;
import opcoes.Opcao11;
import opcoes.Opcao12;
import opcoes.Opcao13;
import opcoes.Opcao2;
import opcoes.Opcao3;
import opcoes.Opcao4;
import opcoes.Opcao5;
import opcoes.Opcao6;
import opcoes.Opcao7;
import opcoes.Opcao8;
import opcoes.Opcao9;
import opcoes.OpcaoMenu;

public class Atendimento {

    public static final Logger LOGGER = Logger.getLogger(Atendimento.class.getName());

    public static void main(String[] args) {

        var filaDeAtendimento = new Fila();
        OpcaoMenu[] acaoMenu = cadeiaDeResponsabilidadeMenu();

        do {

            int opcaoUsuario = menu();

            for (int i = 0; i < acaoMenu.length; i++) {
                filaDeAtendimento = acaoMenu[i].executa(opcaoUsuario, filaDeAtendimento);
            }

        } while (filaDeAtendimento.estaRecebendoClientes());

    }

    private static OpcaoMenu[] cadeiaDeResponsabilidadeMenu() {
        return new OpcaoMenu[] { new Opcao1(), new Opcao2(), new Opcao3(), new Opcao4(), new Opcao5(), new Opcao6(),
                new Opcao7(), new Opcao8(), new Opcao9(), new Opcao10(), new Opcao11(), new Opcao12(), new Opcao13() };
    }

    private static int menu() {

        int opcaoSelecionada = 0;
        try {

            String texto = "\nMENU DE OPÇÕES\n" + "\n1  - Recepcionar cliente"
                    + "\n2  - Consultar clientes a serem atendidos" + "\n3  - Atender cliente"
                    + "\n4  - Liberar todos os clientes" + "\n5  - Verificar quantidade de clientes a atender"
                    + "\n6  - Localizar cliente por número" + "\n7  - Localizar cliente por nome"
                    + "\n8  - Emitir relatório de clientes" + "\n9  - Ver relatório de clientes"
                    + "\n10 - Filtrar clientes por valor" + "\n11 - Ver endereços hash" + "\n12 - Sobre"
                    + "\n13 - Sair\n";

            opcaoSelecionada = Integer.parseInt(JOptionPane.showInputDialog(texto, "1"));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "A tecla <<Cancelar>> foi acionada!\nEscolha a opção 6 para encerrar.",
                    "Mensagem", JOptionPane.CLOSED_OPTION);
        }
        if (opcaoSelecionada < 1 || opcaoSelecionada > 13) {
            LOGGER.warning("Opção Inválida!!");
        }
        return opcaoSelecionada;
    }
}