import java.util.ArrayList;
import java.util.List;

public class ContaBancaria {
    
    private double saldo = 0;
    private int conta;
    private int agencia;
    private List<String> historico;

    public ContaBancaria(int conta, int agencia) {
        this.conta = conta;
        this.agencia = agencia;
        this.historico = new ArrayList<>();
        historico.add("Conta criada.");
    }

    public void depositar(double valor)
    {
        saldo += valor;
        historico.add("Valor depoistado: " + valor + " , saldo após o depósito: " + saldo); 
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            historico.add("Valor sacado: " + valor + ", saldo restante após o saque: " + saldo);
        } else {
            System.out.println("\nNão há saldo suficiente para realizar essa operação.");
        }
    }

    public void imprimirHistorico() {
        System.out.println("Histórico de transações:");
        for (String transacao : historico) {
            System.out.println(transacao);
        }
    }

    public double getSaldo()
    {
        return this.saldo;
    }

    public void detalhesConta() {
        System.out.println( "ContaBancaria [saldo=" + saldo + ", conta=" + conta + ", agencia=" + agencia + ", historico="
        + historico + "]");
    }
}
