// factory method: o gerenciador executa a missão sem conhecer a classe concreta,
// quem decide qual missão criar são as subclasses
public abstract class GerenciadorMissoes {

    protected abstract Missao criarMissao();

    public void iniciarMissao() {
        Missao missao = criarMissao();
        missao.executar();
    }
}
