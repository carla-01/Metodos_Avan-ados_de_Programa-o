public class GerenciadorMissaoResgate extends GerenciadorMissoes {

    @Override
    protected Missao criarMissao() {
        return new MissaoResgate();
    }
}
