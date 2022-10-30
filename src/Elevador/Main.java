package Elevador;

public class Main {
    public static void main(String[] args) {
        Pessoa matheus = new Pessoa("Matheus", 5);
        Pessoa jose = new Pessoa("José", 15);
        Elevador elevador = new Elevador();
        elevador.setPessoasNoElevador(matheus);
        elevador.setPessoasNoElevador(jose);
        elevador.subirDeAndar();
        elevador.descerDeAndar();
        elevador.descerDeAndar();
        System.out.println(elevador.andarAtual);


    }
}
