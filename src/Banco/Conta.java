package Banco;

public class Conta {
    private float saldo;
    private String cpfTitular;
    private String nomeTitular;

    public Conta(String cpfTitular, String nomeTitular) {
        this.saldo = 0;
        this.cpfTitular = cpfTitular;
        this.nomeTitular = nomeTitular;
    }

    protected float getSaldo() {
        return saldo;
    }
    protected float setSaldo(float saldo) {
        this.saldo = saldo;
        return saldo;
    }
    public String getCpfTitular() {
        return cpfTitular;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    protected void depositar(float valorDeposito) {
        saldo = this.saldo + valorDeposito;
    }

    protected void sacar(float valorSaque) {
        saldo = this.saldo - valorSaque;
    }

    protected void transferenciaEntreContas(Conta contaDestino, float valorTransferencia) {
        this.setSaldo(getSaldo() - valorTransferencia);
        contaDestino.setSaldo(contaDestino.getSaldo() + valorTransferencia);
    }
}
