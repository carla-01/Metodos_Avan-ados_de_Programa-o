// simula o aplicativo do cliente
public class ClienteApp implements Observer {
    @Override
    public void update(Pedido pedido) {
        System.out.println("Cliente recebeu notificação: Pedido está " + pedido.getStatus());
    }
}
