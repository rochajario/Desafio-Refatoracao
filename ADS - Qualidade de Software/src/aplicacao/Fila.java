package aplicacao;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    private Queue<Pessoa> filaDePessoas = new LinkedList<>();
    private boolean recebendoClientes;

    public Fila() {
        this.recebendoClientes = true;
    }

    public void setRecebendoClientes(boolean status) {
        this.recebendoClientes = status;
    }

    public boolean estaRecebendoClientes() {
        return this.recebendoClientes;
    }

    public void adicionaPessoa(Pessoa pessoa) {
        if (this.recebendoClientes) {
            this.filaDePessoas.add(pessoa);
        }
    }

    public Pessoa proximo() {
        Pessoa proximo = this.filaDePessoas.element();
        this.filaDePessoas.remove();
        return proximo;
    }

    public Pessoa[] toArray() {
        return this.filaDePessoas.toArray(new Pessoa[filaDePessoas.size()]);
    }

}
