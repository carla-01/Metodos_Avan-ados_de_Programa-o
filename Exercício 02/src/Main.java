public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        Observer cliente = new ClienteApp();
        Observer restaurante = new RestaurantePainel();
        Observer entregador = new EntregadorApp();

        pedido.registerObserver(cliente);
        pedido.registerObserver(restaurante);
        pedido.registerObserver(entregador);

        pedido.setStatus(StatusPedido.PREPARANDO);
        System.out.println();
        pedido.setStatus(StatusPedido.SAIU_PARA_ENTREGA);
        System.out.println();
        pedido.setStatus(StatusPedido.ENTREGUE);
    }
}
