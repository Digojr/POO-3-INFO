import java.util.Scanner;
public class ATV02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe um inteiro: "); // Exibe a mensagem "Informe um inteiro: " com o cursor na mesma linha
        int inteiro = scanner.nextInt(); // Lê um valor inteiro informado pelo usuário
        
        int a; // Declaração da variável a
        int b = 5; // Declaração e atribuição da variável b com valor 5
        int c = 10; // Declaração e atribuição da variável c com valor 10
        
        a = b * c; // Atribuição do produto de b e c para a
        
        // O próximo trecho de código realiza um cálculo de exemplo de folha de pagamento
        // utilizando variáveis para armazenar os valores dos salários e das deduções
        double salarioBruto = 5000.0; // Salário bruto do funcionário
        double deducaoINSS = 0.1 * salarioBruto; // Dedução do INSS (10% do salário bruto)
        double deducaoIRPF = 0.2 * salarioBruto; // Dedução do IRPF (20% do salário bruto)
        double salarioLiquido = salarioBruto - deducaoINSS - deducaoIRPF; // Salário líquido do funcionário
        
        // Exibe a mensagem com o resultado do cálculo de exemplo da folha de pagamento
        System.out.println("Salário Bruto: " + salarioBruto);
        System.out.println("Dedução INSS: " + deducaoINSS);
        System.out.println("Dedução IRPF: " + deducaoIRPF);
        System.out.println("Salário Líquido: " + salarioLiquido);
        
        scanner.close();
    }
}


