public class GerenciadorMissaoExploracao extends GerenciadorMissoes {

    @Override
    protected Missao criarMissao() {
        return new MissaoExploracao();
    }
}
