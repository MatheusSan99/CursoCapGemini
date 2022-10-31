package LojaDeSuprimentos;

public class Invoice {
    int codigoDoPedido;
    String descricaoDoProduto;
    int quantidade;
    float precoUnitario;

    public int getCodigoDoPedido() {
        return codigoDoPedido;
    }

    public void setCodigoDoPedido(int codigoDoPedido) {
        this.codigoDoPedido = codigoDoPedido;
    }

    public String getDescricaoDoProduto() {
        return descricaoDoProduto;
    }

    public void setDescricaoDoProduto(String descricaoDoProduto) {
        this.descricaoDoProduto = descricaoDoProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public Invoice(int codigoDoPedido, String descricaoDoProduto, int quantidade, float precoUnitario) throws Exception {
        this.codigoDoPedido = codigoDoPedido;
        this.descricaoDoProduto = descricaoDoProduto;
        validacaoQuantidade(quantidade, precoUnitario);
    }

    public void validacaoQuantidade(int quantidade, float precoUnitario) throws Exception {
            if (quantidade > 0 && precoUnitario > 0) {
                this.quantidade = quantidade;
                this.precoUnitario = precoUnitario;
            }
                else {
                    this.quantidade = 0;
                    this.precoUnitario = 0;
                    throw new Exception("Valor Inválido");
            }
    }
    public double valorTotal(){
        return this.quantidade * this.precoUnitario;
    }
}
