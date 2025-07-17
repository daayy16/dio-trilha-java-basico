package org.banco.conta;

public interface IOperacaoBancaria {
    void depositar(double valor);
    void sacar(double valor);
    void transferir(double valor, String contaTransferencia);
    void exibirExtrato();
}
