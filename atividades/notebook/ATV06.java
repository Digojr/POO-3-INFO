import java.util.Scanner;
public class ATV06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe o montante desejado: ");
        double montanteDesejado = scanner.nextDouble();
        
        System.out.print("Informe o valor do depósito fixo mensal: ");
        double depositoFixoMensal = scanner.nextDouble();
        
        double taxaJurosMensais = 0.005; // Taxa de juros mensais (0,5%)
        
        int meses = 0; // Número de meses necessários para acumular o montante desejado
        double saldo = 0.0; // Saldo atual do depósito fixo
        
        while (saldo < montanteDesejado) {
            // Atualiza o saldo com o depósito fixo mensal
            saldo += depositoFixoMensal;
            
            // Calcula os juros mensais e atualiza o saldo
            saldo += saldo * taxaJurosMensais;
            
            // Incrementa o número de meses
            meses++;
        }
        
        // Exibe o resultado
        System.out.println("Número de meses necessários: " + meses);
        
        scanner.close();
    }
}    