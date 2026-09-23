//entrega econômica
public class PAC implements FreteStrategy {
    @Override
    public double calcularFrete(double peso) {
        return peso * 2 + 10;
    }
}
