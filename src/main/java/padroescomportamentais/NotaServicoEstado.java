package padroescomportamentais;

public abstract class NotaServicoEstado {

    public abstract String getEstado();

    public boolean Pedenciar(NotaServico notaServico) {
        return false;
    }

    public boolean Programar(NotaServico notaServico) {
        return false;
    }

    public boolean Executar(NotaServico notaServico) {
        return false;
    }

    public boolean Finalizar(NotaServico notaServico) {
        return false;
    }

    public boolean Cancelar(NotaServico notaServico) {
        return false;
    }

}
