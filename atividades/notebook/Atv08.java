
//importação da classe Scanner do pacote java.util
import java.util.Scanner; 

public class Atv08
{

    final static Scanner le = new Scanner(System.in); //prepara a entrada de dados
    final static String nomes[] = new String[10]; //declaração e alocação do vetor assentos 
    final static boolean assentos[] = new boolean[10]; //declaração e alocação do vetor assentos 
    // 0 a 5 primeira classe
    // 6 a 10 classe economica
    // todos os assentos como false pois estão "vazios"



public static void main(String[] args) {

    System.out.println("\n");
    System.out.println("bem vindo a novo sistema automatizado de reservas. \n");
    
    for (int i = 0; i<10; i++){ // for que mostra os assentos disponivesis

        System.out.println("\n A seguir os assentos disponiveis ou não");
        System.out.println("primeira classe: ");
        for(int a = 0; a<10; a++){
            System.out.println(assentos[a]+ "\t"+ nomes[a]);
            if (a == 4){
            System.out.println("classe economica: ");
            }
    }

        CompraAssento();
    }

    System.out.println("Todas os assentos lotados, lamentamos.");
    System.out.println("Programa finalizado.");

}

public static void CompraAssento(){
    //mensagem de orientação
    System.out.println("Por favor digite 1 para Primeira Classe e digite 2 para Classe Econômica");

    //entrada para a classe de compra
    int entrada = le.nextInt();

    if (entrada == 1){ //se entrada == primeira classe
        int i = 0;
        boolean AssentoEncont = true;

        do{
            if (i == 5){ //apenas 5 assentos da primeira classe
                System.out.println("=====================================================\n");
                System.out.println("   Todos os assentos da primeira classe estão cheios");
                System.out.println("======================================================\n");

                for(int hj = 5; hj<11; hj++){// for para se caso não ouver assentos na classe economica ele apresentara se a na outra ou não 
                    if (assentos[hj] == false){
                        System.out.println("Possuem assentos disponiveis na classe economica");
                        System.out.println("deseja comprar assentos ? (digite:(1 para sim) (2 para não))");

                        int a = le.nextInt();

                        if (a == 1){
                            CompraAssento();
                        } else{
                            System.out.println("================================================\n");
                            System.out.println("  Pena que não sera possivel realizar a compra");
                            System.out.println("================================================\n");
                        }

                        break;

                    }
                }

                break;
            }

            if (assentos[i] == false){
                System.out.println("digite seu nome para comprar");
                String nomeCliente = le.next();
                nomes[i] = nomeCliente;
                assentos[i] = true;
                AssentoEncont = false;
            } else{
                i += 1;
            }

        }while(AssentoEncont);

    }
    if (entrada == 2){ //se entrada == classe economica
        int i = 5;
        boolean AssentoEncont = true;

        do{
            if (i == 10){ //apenas 5 assentos da classe economica
                System.out.println("================================================\n");
                System.out.println("  Todos os assentos da economica estão cheios");
                System.out.println("================================================\n");

                for(int hj = 0; hj<6; hj++){// for para se caso não ouver assentos na primeira classe ele apresentara se a na outra ou não 
                    if (assentos[hj] == false){
                        System.out.println("Possuem assentos disponiveis na primeira classe");
                        System.out.println("deseja comprar assentos ? (digite:(1 para sim) (2 para não))");

                        int a = le.nextInt();

                        if (a == 1){
                            CompraAssento();
                        } else{
                            System.out.println("================================================\n");
                            System.out.println("  Pena que não sera possivel realizar a compra");
                            System.out.println("================================================\n");
                        }

                        break;

                    }

                    System.out.println("===========================================\n");
                    System.out.println(" infelizmente não há assentos disponiveis");
                    System.out.println("===========================================\n");

                }

                System.out.println("===========================================\n");
                System.out.println(" infelizmente não há assentos disponiveis");
                System.out.println("===========================================\n");

                break;
            }

            if (assentos[i] == false){
                System.out.println("digite seu nome para comprar");
                String nomeCliente = le.next();
                nomes[i] = nomeCliente;
                assentos[i] = true;
                AssentoEncont = false;
            } else{
                i += 1;
            }

        }while(AssentoEncont);

    }

    
}
}