package CalculoDeIdade;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Pessoa {
    private String nome;
    private LocalDate dataDeNascimento;
    private float altura;

    public Pessoa(String nome, LocalDate dataDeNascimento, float altura) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.altura = altura;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    public Object calculoDeIdade(LocalDate dataDeNascimento){
        LocalDate hoje = LocalDate.now();
        Period p = Period.between(dataDeNascimento, hoje);
        long p2 = ChronoUnit.DAYS.between(dataDeNascimento, hoje);

        return "Você tem " + p.getYears() + " Anos, " + p.getMonths() +
                " Meses, e " + p.getDays() +
                " dias de idade. (" + p2 + " dias no total)";
    }

}
