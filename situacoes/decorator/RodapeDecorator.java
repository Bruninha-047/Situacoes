package situacoes.decorator;

public class RodapeDecorator implements Relatorio{
    private Relatorio relatorio;

    public RodapeDecorator(Relatorio relatorio) {
        this.relatorio = relatorio;
    }

    @Override
    public String gerar() {
        return relatorio.gerar() + "Rodapé do relatório: ";
    }
}
