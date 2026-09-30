// desafio extra: promoção aplicada sobre uma estratégia existente (padrão Decorator).
// se o valor da compra for acima do limite o frete é grátis, senão, usa à estratégia original.
public class PromocaoFreteGratis implements FreteStrategy {
    private final FreteStrategy estrategiaBase;
    private final double valorCompra;
    private final double valorMinimo;

    public PromocaoFreteGratis(FreteStrategy estrategiaBase, double valorCompra, double valorMinimo) {
        this.estrategiaBase = estrategiaBase;
        this.valorCompra = valorCompra;
        this.valorMinimo = valorMinimo;
    }

    @Override
    public double calcularFrete(double peso) {
        if (valorCompra > valorMinimo) {
            return 0;
        }
        return estrategiaBase.calcularFrete(peso);
    }
}
