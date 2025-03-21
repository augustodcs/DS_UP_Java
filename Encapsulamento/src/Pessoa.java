public class Pessoa {
    private String nome;
    private Integer idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() > 10) {
            this.nome = nome;
        }
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Pessoa() { } // Construtor Default (Não faz nada)

    public Pessoa(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(String nome) {
        this(nome, 0);
    }
}
