package MediaAluno;

public class Main {
    public static void main(String[] args) {
        Aluno matheus = new Aluno(8,7,6);
        Media media = new Media(matheus);
        System.out.println(media.calculoMedia());
    }
}
