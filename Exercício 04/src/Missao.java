// template method: define a sequência fixa de execução e deixa as etapas específicas para as subclasses
public abstract class Missao {

    public final void executar() {
        preparar();
        verificarEquipamentos();
        realizarAcao();
        exibirRecompensa();
        finalizar();
    }

    private void preparar() {
        System.out.println("Preparando missão...");
    }

    private void verificarEquipamentos() {
        System.out.println("Verificando equipamentos...");
    }

    private void exibirRecompensa() {
        System.out.println("Recompensa: " + getRecompensa());
    }

    private void finalizar() {
        System.out.println("Missão finalizada!");
    }

    // etapas que variam de uma modalidade para outra
    protected abstract void realizarAcao();

    protected abstract int getRecompensa();
}
