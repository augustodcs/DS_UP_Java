import java.lang.ref.Cleaner;

public class TesteSistemaVendas {
    public static void main(String[] args) {
        var p1 = new Produto("Produto 1", 10.00);
        var p2 = new Produto("Produto 2", 12.00);
        var p3 = new Produto("Produto 3", 1.99);
        var p4 = new Produto("Produto 4", 7.59);

        Produto[] lista1 = {p1,p3};
        Produto[] lista2 = {p2,p4};

        var pedido1 = new Pedido();
        var pedido2 = new Pedido();
        pedido1.setItens(lista1);
        pedido2.setItens(lista2);

        var joao  = new Cliente("João", "111.111.111-11");
        var maria = new Cliente("Maria", "222.222.222-22");

        System.out.println("Pedidos do João:");
        joao.adicionarPedido(pedido1);
        joao.adicionarPedido(pedido2);
        joao.relatorio();

        System.out.println("Pedidos da Maria:");
        maria.adicionarPedido(pedido2);
        maria.relatorio();
    }
}
