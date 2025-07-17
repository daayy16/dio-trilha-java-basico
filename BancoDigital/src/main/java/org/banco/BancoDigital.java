package org.banco;

import org.banco.cliente.Cliente;
import org.banco.conta.Conta;
import org.banco.conta.ContaCorrente;
import org.banco.conta.ContaPoupanca;

public class BancoDigital {
    public static void main(String[] args) {

        Cliente maria = new Cliente("Maria Silva",  "12345678900");
        Cliente antonio = new Cliente("Antonio Silva",  "12345678909");

        Conta cc = new ContaCorrente(antonio);
        Conta cp = new ContaPoupanca(maria);

        cc.depositar(1000);
        cc.sacar(1200);
        cc.depositar(1200);
        cc.sacar(200);
        cc.transferir(400, "12345");

        cp.depositar(2000);
        cp.sacar(300);
        cp.transferir(600, "12345");

        cc.exibirExtrato();
        cp.exibirExtrato();
    }
}