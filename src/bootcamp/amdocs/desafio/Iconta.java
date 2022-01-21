package bootcamp.amdocs.desafio;

import java.math.BigDecimal;

public interface Iconta {

    public void sacar(BigDecimal valor);
    public void depositar(BigDecimal valor);
    public void transferir(BigDecimal valor, Conta contaDestino);
    public void extrato();
    public void debitarSeguro(Cliente cliente, Seguro seguro);

}
