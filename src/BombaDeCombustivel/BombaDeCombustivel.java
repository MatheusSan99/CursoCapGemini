package BombaDeCombustivel;

public class BombaDeCombustivel {
    public static void main(String[] args) {
        Etanol etanol = new Etanol();
        Carro hb20 = new Carro();
        etanol.abastecerPorValor(50,hb20);
        System.out.println(hb20.getTanqueDeCombustivel());
    }
}
