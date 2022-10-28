package Banco;

public class ContaPoupanca  extends Conta{

    public ContaPoupanca(String cpfTitular, String nomeTitular) {
        super(cpfTitular, nomeTitular);
    }

    protected void jurosSobreSaldo(){
        float juros = (float) (this.getSaldo() * 0.1);
        this.setSaldo((this.getSaldo() + juros));
    }
}
