package org.banco.conta;

import lombok.Getter;
import org.banco.cliente.Cliente;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Getter
public abstract class Conta implements IOperacaoBancaria {
    private  static int SEQUENCIAL = 1;
    protected int numeroConta;
    protected Cliente cliente;
    protected double saldo;
    protected List<String> historico;

    public Conta( Cliente cliente) {
        this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;
        this.historico = new ArrayList<>();
    }

    public abstract String getTipoConta();


    @Override
    public void depositar(double valor) {
        saldo += valor;
        historico.add("Deposito: R$" + valor + " Data/hora: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
    }

    @Override
    public void sacar(double valor) {
        if(saldo >= valor){
            saldo -= valor;
            historico.add("Saque: R$" + valor + " Data/hora: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
        } else {
            historico.add("Saldo insuficente para a saque." + " Data/hora: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
        }
    }

    @Override
    public void transferir(double valor, String contaTransferencia) {
        if(saldo >= valor){
            saldo -= valor;
            historico.add("Transferencia: R$ " + valor  + " para conta " + contaTransferencia + " Data/hora: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")) );
        } else {
            historico.add("Saldo insuficente para a transferencia, no valor " + valor  + " Data/hora: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
        }
    }

    @Override
    public void exibirExtrato() {
        System.out.println("\nExtrato da Conta " + numeroConta + " - " + cliente.getNome());
        historico.forEach(System.out::println);
        System.out.println("Saldo atual: R$" + saldo + " Data/hora: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
    }


}
