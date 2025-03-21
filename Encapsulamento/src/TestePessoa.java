public class TestePessoa {
    public static void main (String[] args) {
        Pessoa pessoa = new Pessoa("Daniel Augusto", 21);
        var irma = new Pessoa("Itamara Campos");
        var p = new Pessoa();

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        System.out.println(irma.getNome());
        System.out.println(irma.getIdade());
        System.out.println(p.getNome());
        System.out.println(p.getIdade());

    }
}
