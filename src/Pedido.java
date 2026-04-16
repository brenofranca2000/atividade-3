import java.util.ArrayList;

public class Pedido {

    private Cliente cliente;
    private ArrayList<ItemPedido> itens;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public double calcularTotal() {
        double total = 0;

        for (ItemPedido item : itens) {
            total += item.calcularSubtotal();
        }

        return total;
    }

    public void fecharPedido() {

        double total = calcularTotal();
        double frete;

        if (total > 250) {
            frete = 0;
        } else {
            frete = 25;
        }

        double totalFinal = total + frete;

        System.out.println("\n===== RECIBO =====");
        System.out.println("Cliente: " + cliente.getNome());

        for (ItemPedido item : itens) {
            System.out.println(item.getNomeProduto() +
                    " | Qtd: " + item.getQuantidade() +
                    " | Preço: R$ " + item.getPrecoUnitario() +
                    " | Subtotal: R$ " + item.calcularSubtotal());
        }
