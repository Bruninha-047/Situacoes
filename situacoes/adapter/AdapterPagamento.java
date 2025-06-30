package situacoes.adapter;
public class AdapterPagamento implements PagamentoModerno {
    private PagamentoAntigo pagamentoAntigo;

    public AdapterPagamento(PagamentoAntigo pagamentoAntigo) {
        this.pagamentoAntigo = pagamentoAntigo;
    }

    @Override
    public void pagar(double valor) {
        pagamentoAntigo.pagarAntigo(valor);
    }
}
