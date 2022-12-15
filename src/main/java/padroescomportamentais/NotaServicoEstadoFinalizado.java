package padroescomportamentais;

public class NotaServicoEstadoFinalizado extends NotaServicoEstado{
    @Override
    public String getEstado() {
        return null;
    }

    private NotaServicoEstadoFinalizado() {};
    private static NotaServicoEstadoFinalizado instance = new NotaServicoEstadoFinalizado();
    public static NotaServicoEstadoFinalizado getInstance() {
        return instance;
    }
}
