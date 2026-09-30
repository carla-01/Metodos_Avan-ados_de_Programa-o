
public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(10, new Sedex());
        System.out.println("SEDEX: R$ " + pedido.calcularFrete());

        pedido.setEstrategiaFrete(new PAC());
        System.out.println("PAC: R$ " + pedido.calcularFrete());

        pedido.setEstrategiaFrete(new RetiradaNaLoja());
        System.out.println("Retirada: R$ " + pedido.calcularFrete());

        pedido.setEstrategiaFrete(new TransportadoraExpressa());
        System.out.println("Transportadora: R$ " + pedido.calcularFrete());

        // 5. Nova regra: Frete Internacional
        pedido.setEstrategiaFrete(new FreteInternacional());
        System.out.println("Internacional: R$ " + pedido.calcularFrete());

        // Desafio extra: frete grátis acima de R$ 399 aplicado sobre o Sedex
        pedido.setEstrategiaFrete(new PromocaoFreteGratis(new Sedex(), 450.0, 399.0));
        System.out.println("SEDEX com promoção (compra de R$ 450): R$ " + pedido.calcularFrete());

        pedido.setEstrategiaFrete(new PromocaoFreteGratis(new Sedex(), 200.0, 399.0));
        System.out.println("SEDEX com promoção (compra de R$ 200): R$ " + pedido.calcularFrete());
    }
}
