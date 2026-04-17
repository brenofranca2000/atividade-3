public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Breno", "breno@email.com");

        Pedido pedido = new Pedido(cliente);

        pedido.adicionarItem(new ItemPedido("Mouse", 2, 50.0));
        pedido.adicionarItem(new ItemPedido("Teclado", 1, 150.0));
        pedido.adicionarItem(new ItemPedido("Monitor", 1, 300.0));

        pedido.fecharPedido();
    }
}