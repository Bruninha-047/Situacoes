package situacoes.decorator;

public class ExemploRelatorio {
    public static void main(String[] args) {
        Relatorio completo = new RelatorioSimples();
        completo = new RodapeDecorator(completo);
        completo = new AssinaturaDecorator(completo);

        System.out.println("Relatório completo: " + completo.gerar());

        Relatorio personalizado = new RelatorioSimples();
        personalizado = new AssinaturaDecorator(personalizado);

        System.out.println("Relatório personalizado: " + personalizado.gerar());
    }
}
