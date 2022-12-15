package padroescomportamentais;

public class NotaServico {

    private String numNS;
    private NotaServicoEstado estado;

    public NotaServico() {
        this.estado = NotaServicoEstadoPendente.getInstance();
    }

    public String getNumNS() {
        return numNS;
    }

    public void setNumNS(String numNS) {
        this.numNS = numNS;
    }

    public NotaServicoEstado getEstado() {
        return estado;
    }

    public void setEstado(NotaServicoEstado estado) {
        this.estado = estado;
    }

    public boolean Pedenciar() {
        return estado.Pedenciar(this);
    }

    public boolean Programar() {
        return estado.Programar(this);
    }

    public boolean Executar() {
        return estado.Executar(this);
    }

    public boolean Finalizar() {
        return estado.Finalizar(this);
    }

    public boolean Cancelar() {
        return estado.Cancelar(this);
    }
}
