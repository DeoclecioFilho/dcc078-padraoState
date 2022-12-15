package padroescomportamentais;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class  NotaServicoTest {

    NotaServico notaServico;

    @BeforeEach
    void  setUp() {
        notaServico = new NotaServico();
    }

    /** Nota de serviço PENDENTE */

    @Test
    void naoDevePedenciarNotaServicoPendente(){
        notaServico.setEstado(NotaServicoEstadoPendente.getInstance());
        assertFalse(notaServico.Pedenciar());
    }
    @Test
    void deveProgramarNotaServicoPendente(){
        notaServico.setEstado(NotaServicoEstadoPendente.getInstance());
        assertTrue(notaServico.Programar());
    }

    @Test
    void deveCancelarNotaServicoPendente(){
        notaServico.setEstado(NotaServicoEstadoPendente.getInstance());
        assertTrue(notaServico.Cancelar());
    }

    @Test
    void naoDeveExecutarNotaServicoPendente(){
        notaServico.setEstado(NotaServicoEstadoPendente.getInstance());
        assertFalse(notaServico.Executar());
    }

    @Test
    void naoDeveFinalizarNotaServicoPendente(){
        notaServico.setEstado(NotaServicoEstadoPendente.getInstance());
        assertFalse(notaServico.Finalizar());
    }

    /** Nota de serviço PROGRAMADO */

    @Test
    void devePedenciarNotaServicoProgramado(){
        notaServico.setEstado(NotaServicoEstadoProgramado.getInstance());
        assertTrue(notaServico.Pedenciar());
    }
    @Test
    void naodeveProgramarNotaServicoProgramado(){
        notaServico.setEstado(NotaServicoEstadoProgramado.getInstance());
        assertFalse(notaServico.Programar());
    }

    @Test
    void naoDeveCancelarNotaServicoProgramado(){
        notaServico.setEstado(NotaServicoEstadoProgramado.getInstance());
        assertFalse(notaServico.Cancelar());
    }

    @Test
    void deveExecutarNotaServicoProgramado(){
        notaServico.setEstado(NotaServicoEstadoProgramado.getInstance());
        assertTrue(notaServico.Executar());
    }

    @Test
    void naoDeveFinalizarNotaServicoProgramado(){
        notaServico.setEstado(NotaServicoEstadoProgramado.getInstance());
        assertFalse(notaServico.Finalizar());
    }

    /** Nota de serviço EXECUTADO */

    @Test
    void naoDevePedenciarNotaServicoExecutado(){
        notaServico.setEstado(NotaServicoEstadoExecutado.getInstance());
        assertFalse(notaServico.Pedenciar());
    }
    @Test
    void deveProgramarNotaServicoExecutado(){
        notaServico.setEstado(NotaServicoEstadoExecutado.getInstance());
        assertTrue(notaServico.Programar());
    }

    @Test
    void naoDeveCancelarNotaServicoExecutado(){
        notaServico.setEstado(NotaServicoEstadoExecutado.getInstance());
        assertFalse(notaServico.Cancelar());
    }

    @Test
    void naoDeveExecutarNotaServicoExecutado(){
        notaServico.setEstado(NotaServicoEstadoExecutado.getInstance());
        assertFalse(notaServico.Executar());
    }

    @Test
    void deveFinalizarNotaServicoExecutado(){
        notaServico.setEstado(NotaServicoEstadoExecutado.getInstance());
        assertTrue(notaServico.Finalizar());
    }

    /** Nota de serviço FINALIZADO */

    @Test
    void naoDevePedenciarNotaServicoFinalizado(){
        notaServico.setEstado(NotaServicoEstadoFinalizado.getInstance());
        assertFalse(notaServico.Pedenciar());
    }
    @Test
    void naoDeveProgramarNotaServicoFinalizado(){
        notaServico.setEstado(NotaServicoEstadoFinalizado.getInstance());
        assertFalse(notaServico.Programar());
    }

    @Test
    void naoDeveCancelarNotaServicoFinalizado(){
        notaServico.setEstado(NotaServicoEstadoFinalizado.getInstance());
        assertFalse(notaServico.Cancelar());
    }

    @Test
    void naoDeveExecutarNotaServicoFinalizado(){
        notaServico.setEstado(NotaServicoEstadoFinalizado.getInstance());
        assertFalse(notaServico.Executar());
    }

    @Test
    void naoDeveFinalizarNotaServicoFinalizado(){
        notaServico.setEstado(NotaServicoEstadoFinalizado.getInstance());
        assertFalse(notaServico.Finalizar());
    }

    /** Nota de serviço CANCELADO */

    @Test
    void naoDevePedenciarNotaServicoCancelado(){
        notaServico.setEstado(NotaServicoEstadoCancelado.getInstance());
        assertFalse(notaServico.Pedenciar());
    }
    @Test
    void naoDeveProgramarNotaServicoCancelado(){
        notaServico.setEstado(NotaServicoEstadoCancelado.getInstance());
        assertFalse(notaServico.Programar());
    }

    @Test
    void naoDeveCancelarNotaServicoCancelado(){
        notaServico.setEstado(NotaServicoEstadoCancelado.getInstance());
        assertFalse(notaServico.Cancelar());
    }

    @Test
    void naoDeveExecutarNotaServicoCancelado(){
        notaServico.setEstado(NotaServicoEstadoCancelado.getInstance());
        assertFalse(notaServico.Executar());
    }

    @Test
    void naoDeveFinalizarNotaServicoCancelado(){
        notaServico.setEstado(NotaServicoEstadoCancelado.getInstance());
        assertFalse(notaServico.Finalizar());
    }
}