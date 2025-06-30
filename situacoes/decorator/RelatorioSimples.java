package situacoes.decorator;

public class RelatorioSimples implements Relatorio {
    @Override
    public String gerar() {
        return "Conteúdo do Relatório";
    }
}