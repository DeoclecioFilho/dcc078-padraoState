package padroescomportamentais;

public class NotaServicoEstadoExecutado extends NotaServicoEstado{
    @Override
    public String getEstado() {
        return "Executado";
    }

    private NotaServicoEstadoExecutado() {};
    private static NotaServicoEstadoExecutado instance = new NotaServicoEstadoExecutado();
    public static NotaServicoEstadoExecutado getInstance() {
        return instance;
    }

    public boolean Programar(NotaServico notaServico) {
        notaServico.setEstado(NotaServicoEstadoProgramado.getInstance());
        return true;
    }
    public boolean Finalizar(NotaServico notaServico) {
        notaServico.setEstado(NotaServicoEstadoFinalizado.getInstance());
        return true;
    }
}
