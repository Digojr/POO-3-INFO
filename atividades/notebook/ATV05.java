public class ATV05 {
    public static void main(String[] args) {
        // Declaração e inicialização das variáveis de gastos mensais
        double gastosJaneiro = 30000.00;
        double gastosFevereiro = 33030.77;
        double gastosMarco = 23899.01;
        
        // Cálculo do gasto total no trimestre
        double gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
        // Cálculo da média mensal de gastos
        double mediaMensal = gastosTrimestre / 3;
        // Exibição do gasto total da média mensal
        System.out.println("Valor da média mensal: R$ " + mediaMensal);
    }
}
    

