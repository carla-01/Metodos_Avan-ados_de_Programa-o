//usa  estratégia de frete que pode ser trocada em tempo de execução
public class Pedido {
    private double peso;
    private FreteStrategy estrategiaFrete;

    public Pedido(double peso, FreteStrategy estrategiaFrete) {
        this.peso = peso;
        this.estrategiaFrete = estrategiaFrete;
    }

    public void setEstrategiaFrete(FreteStrategy estrategiaFrete) {
        this.estrategiaFrete = estrategiaFrete;
    }

    public double calcularFrete() {
        return estrategiaFrete.calcularFrete(peso);
    }

    public double getPeso() {
        return peso;
    }
}
