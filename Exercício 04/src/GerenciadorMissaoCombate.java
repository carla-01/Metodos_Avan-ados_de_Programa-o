public class GerenciadorMissaoCombate extends GerenciadorMissoes {

    @Override
    protected Missao criarMissao() {
        return new MissaoCombate();
    }
}
