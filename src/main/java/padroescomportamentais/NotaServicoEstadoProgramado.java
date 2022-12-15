package padroescomportamentais;

public class NotaServicoEstadoProgramado extends NotaServicoEstado{
    @Override
    public String getEstado() {
        return null;
    }

    private NotaServicoEstadoProgramado() {};
    private static NotaServicoEstadoProgramado instance = new NotaServicoEstadoProgramado();
    public static NotaServicoEstadoProgramado getInstance() {
        return instance;
    }

    public boolean Pedenciar(NotaServico notaServico) {
        notaServico.setEstado(NotaServicoEstadoPendente.getInstance());
        return true;
    }

    public boolean Executar(NotaServico notaServico) {
        notaServico.setEstado(NotaServicoEstadoExecutado.getInstance());
        return true;
    }
}
