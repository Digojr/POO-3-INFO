import java.util.Scanner;

public class ATV01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe a quantidade de argumentos: ");
        int quantidade = scanner.nextInt(); // Lê a quantidade de argumentos informada pelo usuário
        
        Object[] argumentos = new Object[quantidade]; // Cria um array para armazenar os argumentos
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Informe o argumento " + (i + 1) + ": ");
            if (scanner.hasNextInt()) { // Verifica se o próximo valor informado é um inteiro
                argumentos[i] = scanner.nextInt(); // Armazena o valor como um inteiro
            } else if (scanner.hasNextDouble()) { // Verifica se o próximo valor informado é um número real
                argumentos[i] = scanner.nextDouble(); // Armazena o valor como um número real
            } else { // Se não for um número válido, lê a entrada como uma String
                argumentos[i] = scanner.next(); // Armazena o valor como uma String
            }
        }
        
        double soma = somarArgumentos(argumentos); // Chama o método somarArgumentos com os argumentos informados
        System.out.println("Soma dos argumentos: " + soma); // Exibe a soma dos argumentos no console
        
        scanner.close();
    }

    public static double somarArgumentos(Object... args) {
        double soma = 0;
        for (Object arg : args) {
            if (arg instanceof Number) { // Verifica se o argumento é um número
                soma += ((Number) arg).doubleValue(); // Converte e soma o valor do argumento
            }
        }
        return soma;
    }
}
