// retirada na loja: sem custo
public class RetiradaNaLoja implements FreteStrategy {
    @Override
    public double calcularFrete(double peso) {
        return 0;
    }
}
