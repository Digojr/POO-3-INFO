import javax.swing.JOptionPane;
public class ATV03 {

    public static void main(String[] args) {
        // Solicita ao usuário as notas das duas provas e do trabalho
        String nota1Str = JOptionPane.showInputDialog("Informe a nota da primeira prova:");
        String nota2Str = JOptionPane.showInputDialog("Informe a nota da segunda prova:");
        String notaTrabalhoStr = JOptionPane.showInputDialog("Informe a nota do trabalho:");
        
        // Converte as notas de string para double
        double nota1 = Double.parseDouble(nota1Str);
        double nota2 = Double.parseDouble(nota2Str);
        double notaTrabalho = Double.parseDouble(notaTrabalhoStr);
        
        // Calcula a média das notas
        double media = (nota1 + nota2 + notaTrabalho) / 3;
        
        // Exibe a média das notas em uma mensagem de diálogo
        JOptionPane.showMessageDialog(null, "A média das notas é: " + media);
    }
}


