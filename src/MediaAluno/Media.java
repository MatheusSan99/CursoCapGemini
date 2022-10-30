package MediaAluno;

public class Media {
    private  Aluno aluno;

    public Media(Aluno aluno) {
        this.aluno = aluno;
    }
    public String calculoMedia() {
        if ((this.aluno.getNotaProva1() + this.aluno.getNotaProva2() + this.aluno.getNotaTrabalho()/3) < 7) {
           return "Aluno Reprovado";
        }
        else return "Aluno Aprovado";
    }
}
