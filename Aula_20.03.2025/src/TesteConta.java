import java.time.LocalDate;

public class TesteConta {
    public static void main(String [] args) {
        Conta contaAluno = new Conta();
        contaAluno.nome = "João";
        contaAluno.numero = 3557;
        contaAluno.agencia = 7553;
        contaAluno.saldo = 0.0;
        contaAluno.dataCriacao = LocalDate.now();

        Conta contaProfessor = new Conta();
        contaProfessor.nome = "Ana";
        contaProfessor.numero = 8559;
        contaProfessor.agencia = 9558;
        contaProfessor.saldo = 0.0;
        contaProfessor.dataCriacao = LocalDate.now();

        Conta contaTerceiro = contaAluno;
        contaAluno.nome = "Maria";

        contaAluno.depositar( 100);
        contaAluno.calcularRendimento();
        contaAluno.sacar(150);
        System.out.println(contaAluno.recuperaDadosParaImpressao());

        if (contaAluno == contaProfessor) {
            System.out.println("Sim são iguais!");
        }else {
            System.out.println("Elas não são iguais!");
        }

        if (contaAluno.equals(contaProfessor)) {
            System.out.println("Sim são iguais!");
        }else {
            System.out.println("Elas não são iguais!");
        }
    }
}
