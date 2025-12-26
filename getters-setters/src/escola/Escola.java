package escola;

public class Escola {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "João";
        aluno.idade = 20;

        System.out.println("Nome: " + aluno.nome);
        System.out.println("Idade: " + aluno.idade);
    }
}
