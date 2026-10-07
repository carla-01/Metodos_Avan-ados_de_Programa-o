// mede o tempo total da operação, envolvendo a chamada ao próximo executor
public class MetricsDecorator extends QueryExecutorDecorator {
    public MetricsDecorator(QueryExecutor wrapped) {
        super(wrapped);
    }

    @Override
    public void execute(String sql) {
        long inicio = System.nanoTime();
        try {
            super.execute(sql);
        } finally {
            long ms = (System.nanoTime() - inicio) / 1_000_000;
            System.out.println("[METRICS] Tempo de execução: " + ms + "ms");
        }
    }
}
