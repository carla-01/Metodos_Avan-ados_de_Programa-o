// componente: contrato comum entre o executor real e os decorators
public interface QueryExecutor {
    void execute(String sql);
}
