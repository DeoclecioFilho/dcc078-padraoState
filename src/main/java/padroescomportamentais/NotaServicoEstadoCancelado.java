package padroescomportamentais;

public class NotaServicoEstadoCancelado extends NotaServicoEstado{
    @Override
    public String getEstado() {
        return null;
    }

    private NotaServicoEstadoCancelado() {};
    private static NotaServicoEstadoCancelado instance = new NotaServicoEstadoCancelado();
    public static NotaServicoEstadoCancelado getInstance() {
        return instance;
    }
}
