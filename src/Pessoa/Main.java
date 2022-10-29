package Pessoa;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Matheus", LocalDate.of(1999,04,15), 1.75F);
        System.out.println(pessoa.calculoDeIdade(pessoa.getDataDeNascimento()));
    }
}
