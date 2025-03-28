public class Pedido {
    private Produto[] itens;

    public Produto[] getItens() {
        return itens;
    }

    public void setItens(Produto[] itens) {
        this.itens = itens;
    }
    public Double calcularValorTotal() {
        double valor = 0.0;
        for (Produto produto : itens) {
            valor += produto.getPreco();
        }
        return valor;
    }
}
