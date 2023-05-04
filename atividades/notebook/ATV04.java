public class ATV04 {
    public static void main(String[] args) {
        // Declaração e inicialização das variáveis de gastos mensais
        double gastosJaneiro = 30000.00;
        double gastosFevereiro = 33030.77;
        double gastosMarco = 23899.01;
        
        // Cálculo do gasto total no trimestre
        double gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
        
        // Exibição do gasto total no trimestre
        System.out.println("Gasto total no trimestre: R$ " + gastosTrimestre);
    }
}

