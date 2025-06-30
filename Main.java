import situacoes.adapter.AdapterPagamento;
import situacoes.adapter.PagamentoAntigo;
import situacoes.adapter.PagamentoModerno;

public class Main {
    public static void main(String[] args) {
        PagamentoAntigo sistemaAntigo = new PagamentoAntigo();

        PagamentoModerno adapter = new AdapterPagamento(sistemaAntigo);

        adapter.pagar(100.00);
    }
}
