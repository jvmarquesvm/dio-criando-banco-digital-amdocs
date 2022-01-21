package bootcamp.amdocs.desafio;

import java.math.BigDecimal;

public class Application {

    public static void main(String[] args) {
        //Criação do Cliente
        Cliente cliente = new Cliente();
        cliente.setCpf("87643287218");
        cliente.setNome("João Victor");

        //Depósito de R$ 100,00
        Conta contacorrente = new ContaCorrente(cliente);
        contacorrente.depositar(new BigDecimal(100));
        contacorrente.extrato();

        //Transferencia de R$ 43,00 para conta poupança
        Conta contapoupanca = new ContaPoupanca(cliente);
        contacorrente.transferir(new BigDecimal(43), contapoupanca);

        contacorrente.extrato();
        contapoupanca.extrato();

        //Contratação de Seguro de Vida - R$ 30,00
        Seguro seguroVida = new Seguro(cliente);
        contacorrente.debitarSeguro(cliente, seguroVida );
        seguroVida.extrato();

        //Extrato Final
        contacorrente.extrato();
    }

}
