public class Curso {
    //#################################################################################################################
    // DECLARAÇÃO DE VARIÁVEIS
    //#################################################################################################################
    private String nome;
    private Integer codigo;
    private Aluno[] alunos;
    private Integer totalAlunos;
    //#################################################################################################################
    // GETTERS & SETTERS
    //#################################################################################################################
    public String getNome() {
        return nome;
    }
    //------------------------------------------------------------
    public void setNome(String nome) {
        this.nome = nome;
    }
    //------------------------------------------------------------
    public Integer getCodigo() {
        return codigo;
    }
    //------------------------------------------------------------
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    //------------------------------------------------------------
    public Aluno[] getAlunos() {
        return alunos;
    }
    //------------------------------------------------------------
    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
    //#################################################################################################################
    // CONSTRUTORES
    //#################################################################################################################
    public Curso(String nome, Integer codigo) {
        this.nome = nome;
        this.codigo = codigo;
        this.totalAlunos = 0;
        this.alunos = new Aluno[10];
    }
    //#################################################################################################################
    // MÉTODOS
    //#################################################################################################################
    public void matricularAluno(Aluno aluno) {
        alunos[totalAlunos] = aluno;
        totalAlunos++;
    }
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public void removerAluno(Integer matricula) {
        int idxRemoved = 0;
        for (int i = 0; i < totalAlunos; i++) {
            if (alunos[i].getMatricula().equals(matricula)) {
                alunos[i] = null;
                idxRemoved = i;
            }
        }
        for (int i = idxRemoved; i < totalAlunos - 1; i++) {
            alunos[i] = alunos[i+1];
        }
        alunos[totalAlunos - 1] = null;
        totalAlunos--;
    }
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public void relatorio() {
        System.out.println("O curso " + nome + " tem " + totalAlunos + " alunos:");
        for (int i = 0; i < totalAlunos; i++) {
            System.out.println(alunos[i].getNome());
        }
    }
}
