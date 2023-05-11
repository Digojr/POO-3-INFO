//importando o JOptionPane
import javax.swing.JOptionPane;

public class ATv07 // Declaração da classe atv
{
    // Início da classe Main 
    // Declaracao do método main que inicia a execução do programa  
	public static void main(String[] args) {

		String aux; // str axuliar para o JOptionPane
        double array[] = new double[5]; //declaração e alocação do array

        
        for (int i = 0; i < 5; i++){ //iniciando um for para repetir 5 vezes a entrada da nota

            //entrada dos dados com a classe JOptionPane
            aux = JOptionPane.showInputDialog("Entre com a nota da primeira prova");
            //conversao dos dados para float e armazenando o dado no array
            array[i] = Float.parseFloat(aux); 

        } //fim do for 

        // organizando o array do maior para o menor (decrescente)

        boolean repetir; //variavel boleana para se repetir o while
        do {
            repetir = false; //atribuindo false para a variavel repetir
             
            for (int i = 1; i < array.length; i++) {
                //se array[anterior] for maior que array[na posição i]
                if (array[i - 1] > array[i]) {
                    //se verdadeiro troca a ordem dos dois valores com ajuda da variavel temp
                    double temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    repetir = true; //repetir recebe true pois deve se comparar novamente 
                }
            }
        } while (repetir);

        double media_aritimetica; //alocando a variavel para ser a media das notas
        //alocando e inicializando a variavel soma_notas
        double soma_notas = 0; // antes de criar a media vamos somar todas as notas do array

        String notas_ordenadas = ""; // string para ir adicionando as notas ja ordenadas

        //for para somar todas as notas do array e colocar na variavel em String as notas ja ordenadas 
        for (int i = 0; i < array.length; i++){ 

            notas_ordenadas +=  array[i] + ", "; // adicionando a nota na variavel notas_ordenadas
            soma_notas += array[i]; // adicionando a nota da posinçao i do array

        } //fim do for

        media_aritimetica = soma_notas / array.length; //fazendo a divisao pelo numero de notas (tamanho do array)

        //mostrando na tela oque se pede
        JOptionPane.showMessageDialog(null, "Notas organizadas = " + notas_ordenadas + " \n " + " Media das notas = " + media_aritimetica);
        
	}
}// fim da classe atv

