package padroescomportamentais;

public class NotaServicoEstadoPendente extends NotaServicoEstado{
    @Override
    public String getEstado() {
        return null;
    }

    private NotaServicoEstadoPendente() {};
    private static NotaServicoEstadoPendente instance = new NotaServicoEstadoPendente();
    public static NotaServicoEstadoPendente getInstance() {
        return instance;
    }

    public boolean Programar(NotaServico notaServico) {
        notaServico.setEstado(NotaServicoEstadoProgramado.getInstance());
        return true;
    }

    public boolean Cancelar(NotaServico notaServico) {
        notaServico.setEstado(NotaServicoEstadoCancelado.getInstance());
        return true;
    }
}
