package org.banco.conta;

import org.banco.cliente.Cliente;

public class ContaCorrente extends Conta{
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public String getTipoConta() {
        return "Conta Corrente";
    }
}
