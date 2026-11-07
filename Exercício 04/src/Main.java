public class Main {
    public static void main(String[] args) {
        GerenciadorMissoes[] gerenciadores = {
                new GerenciadorMissaoCombate(),
                new GerenciadorMissaoExploracao(),
                new GerenciadorMissaoResgate()
        };

        for (GerenciadorMissoes gerenciador : gerenciadores) {
            gerenciador.iniciarMissao();
            System.out.println();
        }
    }
}
