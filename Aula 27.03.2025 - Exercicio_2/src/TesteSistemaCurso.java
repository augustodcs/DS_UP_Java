public class TesteSistemaCurso {
    public static void main(String[] args) {
        var curso1 = new Curso("Curso 1", 1);
        var curso2 = new Curso("Curso 2", 2);

        var aluno1 = new Aluno("Aluno 1", 123, null);
        var aluno2 = new Aluno("Aluno 2", 223, null);
        var aluno3 = new Aluno("Aluno 3", 323, null);
        var aluno4 = new Aluno("Aluno 4", 423, null);

        curso1.matricularAluno(aluno1);
        curso1.matricularAluno(aluno2);
        curso1.matricularAluno(aluno3);
        curso1.relatorio();

        curso2.matricularAluno(aluno4);
        curso2.relatorio();
    }
}
