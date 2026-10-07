// componente concreto: quem realmente "executa" a query no banco
public class BasicQueryExecutor implements QueryExecutor {
    @Override
    public void execute(String sql) {
        System.out.println("Query executada no banco: " + sql);
    }
}
