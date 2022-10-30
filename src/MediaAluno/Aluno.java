package MediaAluno;

public class Aluno {
    private String nomeAluno;
    private int codMatricula;
    private float notaProva1;
    private float notaProva2;
    private float notaTrabalho;

    public Aluno(float notaProva1, float notaProva2, float notaTrabalho) {
        this.notaProva1 = notaProva1;
        this.notaProva2 = notaProva2;
        this.notaTrabalho = notaTrabalho;
    }
    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public int getCodMatricula() {
        return codMatricula;
    }

    public void setCodMatricula(int codMatricula) {
        this.codMatricula = codMatricula;
    }

    public float getNotaProva1() {
        return notaProva1;
    }

    public void setNotaProva1(int notaProva1) {
        this.notaProva1 = notaProva1;
    }

    public float getNotaProva2() {
        return notaProva2;
    }

    public void setNotaProva2(int notaProva2) {
        this.notaProva2 = notaProva2;
    }

    public float getNotaTrabalho() {
        return notaTrabalho;
    }

    public void setNotaTrabalho(int notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }
}
