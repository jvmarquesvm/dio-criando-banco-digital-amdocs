package bootcamp.amdocs.desafio;

import java.math.BigDecimal;

public abstract class Conta implements Iconta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected Integer agencia;
    protected Integer numero;
    protected BigDecimal saldo = new BigDecimal(0);
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public Integer getNumero() {
        return numero;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(BigDecimal valor) {
        this.saldo = saldo.subtract(valor);
    }

    @Override
    public void depositar(BigDecimal valor) {
        this.saldo = saldo.add((valor));
    }

    @Override
    public void transferir(BigDecimal valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void extracted() {
        System.out.println("== Cliente: " + this.cliente.getNome());
        System.out.println("== CPF: " + this.cliente.getCpf());
        System.out.println("== Agencia: " + this.agencia);
        System.out.println("== Conta: " + this.numero);
        System.out.println("== Saldo: R$" + this.saldo + "\n");
    }

    @Override
    public void debitarSeguro(Cliente cliente, Seguro seguro) {
        this.sacar(seguro.getValor());
    }
}
