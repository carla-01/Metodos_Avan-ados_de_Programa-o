import java.util.Arrays;
import java.util.List;

// valida a query e, se for perigosa, NÃO chama o próximo executor
public class SecurityValidationDecorator extends QueryExecutorDecorator {
    private static final List<String> PALAVRAS_PERIGOSAS =
            Arrays.asList("DROP", "DELETE", "TRUNCATE", "ALTER");
    private static final List<String> PADROES_INJECTION =
            Arrays.asList("' OR '1'='1", "--", ";");

    public SecurityValidationDecorator(QueryExecutor wrapped) {
        super(wrapped);
    }

    @Override
    public void execute(String sql) {
        String motivo = validar(sql);
        if (motivo != null) {
            System.out.println("[SECURITY] Query bloqueada por validação de segurança.");
            System.out.println("Query bloqueada: " + motivo);
            return;
        }
        super.execute(sql);
    }

    // devolve o motivo do bloqueio, ou null se a query for segura
    private String validar(String sql) {
        String upper = sql.toUpperCase();
        for (String palavra : PALAVRAS_PERIGOSAS) {
            if (upper.matches("(?s).*\\b" + palavra + "\\b.*")) {
                return "palavra perigosa detectada.";
            }
        }
        for (String padrao : PADROES_INJECTION) {
            if (upper.contains(padrao)) {
                return "possível SQL Injection detectado.";
            }
        }
        return null;
    }
}
