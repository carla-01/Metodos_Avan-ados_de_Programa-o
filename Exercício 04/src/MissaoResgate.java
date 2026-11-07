// 2ª parte: nova modalidade, só implementa as etapas que variam
public class MissaoResgate extends Missao {

    @Override
    protected void realizarAcao() {
        System.out.println("Resgatando personagem!");
    }

    @Override
    protected int getRecompensa() {
        return 150;
    }
}
