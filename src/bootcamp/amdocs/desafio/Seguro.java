package bootcamp.amdocs.desafio;

import java.math.BigDecimal;

public class Seguro {

    private static final String NOME_APOLICE = "Seguro de Vida";

    private String apolice;
    private BigDecimal valor;
    private Cliente cliente;

    public Seguro(Cliente cliente){
        this.cliente = cliente;
        this.apolice = NOME_APOLICE;
        this.valor = new BigDecimal(30);
    }

    public String getApolice() {
        return apolice;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setApolice(String apolice) {
        this.apolice = apolice;
    }

    public void extrato(){
        System.out.println("== Seguro de Vida ==");
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Seguro contratado com sucesso no valor de R$" + this.getValor() + "\n");
    }

}
