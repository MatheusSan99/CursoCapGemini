package BombaDeCombustivel;

public class TipoDeCombustivel {
    String nomeCombustivel;
    float precoCombustivel;
    float litrosNaBomba = 1000;

    public TipoDeCombustivel(String nomeCombustivel,float precoCombustivel) {
        this.nomeCombustivel = nomeCombustivel;
        this.precoCombustivel = precoCombustivel;
    }

    protected String getNomeCombustivel() {
        return nomeCombustivel;
    }

    protected void setNomeCombustivel(String nomeCombustivel) {
        this.nomeCombustivel = nomeCombustivel;
    }

    protected float getPrecoCombustivel() {
        return precoCombustivel;
    }

    protected void setPrecoCombustivel(float precoCombustivel) {
        this.precoCombustivel = precoCombustivel;
    }

    protected float getLitrosNaBomba() {
        return litrosNaBomba;
    }

    protected void setLitrosNaBomba(float litrosNaBomba) {
        this.litrosNaBomba = litrosNaBomba;
    }
    protected void abastecerPorValor(float valor, Carro carro) {
        float litros = valor/precoCombustivel;
        float tanque = carro.getTanqueDeCombustivel();
        carro.setTanqueDeCombustivel(litros + tanque);
    }

    protected void abastecerPorLitros(float litros, Carro carro) {
        float tanque = carro.getTanqueDeCombustivel();
        carro.setTanqueDeCombustivel(litros + tanque);
    }
}
