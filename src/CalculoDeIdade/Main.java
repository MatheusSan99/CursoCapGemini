package CalculoDeIdade;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Matheus", LocalDate.of(1999,04,15), 1.75F);
        System.out.println(pessoa.calculoDeIdade(pessoa.getDataDeNascimento()));
    }
}
