package situacoes.decorator;

public class AssinaturaDecorator implements Relatorio{
    private Relatorio relatorio;

    public AssinaturaDecorator(Relatorio relatorio) {
        this.relatorio = relatorio;
    }

    @Override
    public String gerar() {
        return relatorio.gerar() + "Assinado por: Euu";
    }
}
