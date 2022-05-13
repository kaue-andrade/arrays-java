import java.util.ArrayList;

public class Exemplo1 {
    public static void main(String[] args){

        //Uma empresa nos solicitou o armazenamento de 9 números inteiros que representa os códigos de documentos

        ArrayList<Integer> numeros = new ArrayList<Integer>();; //Cria um array do tipo inteiro
        //0, 1, 2, 3, 4, 5, 6, 7, 8, 9
        //


        //Utilizamos arrays comuns dessa forma:

        //nomes[0] = "Kauê"; //Armazena o nome Breno Araújo na posição 0
        //nomes[1] = "Breno Araújo"; //Armazena o nome Kauê na posição 1
        //nomes[2] = "João"; //Armazena o nome João na posição 2
        //nomes[3] = "Maria"; //Armazena o nome Maria na posição 3

        //Vamos utilizar os benefícios do ArrayList

        numeros.add(0, 5689); //Armazena 5689 na posição 0
        numeros.add(1, 7895); //Armazena 7895 na posição 1
        numeros.add(2, 9876); //Armazena 9876 na posição 2
        numeros.add(3, 3256); //Armazena 3256 na posição 3
        numeros.add(4, 4596); //Armazena 4596 na posição 4
        numeros.add(5, 6874); //Armazena 6874 na posição 5
        numeros.add(6, 1259); //Armazena 1259 na posição 6
        numeros.add(7, 3256); //Armazena 3256 na posição 7
        numeros.add(8, 7531); //Armazena 7531 na posição 8
        numeros.add(9, 1593); //Armazena 1593 na posição 9

        System.out.println("\nArray versão inicial: " + numeros); //Imprime a array numeros

        System.out.println("\nNúmero na posição 5: " + numeros.get(5)); //Consulta o nome na posição 1 no array
        System.out.println("Número na posição 9: " + numeros.get(9)); //Consulta o nome na posição 3 do array

        numeros.set(4, 7589); //Altera o número do índice 4 para 7589

        numeros.remove(6); //Remove o número no índice 6

        System.out.println("\nArray versão final: " + numeros + "\n"); //Imprime a array numeros

        //posicaoVetor < 9 porque temos 8 números (retiramos um)

        for (int posicaoVetor = 0; posicaoVetor < 9; posicaoVetor++) { //Usa o laço de repetição for e cria a variável do tipo int denominada posicaoVetor
            System.out.println("Documento " + posicaoVetor + ": " + numeros.get(posicaoVetor) + " "); //Imprime o nome correspondente a posicaoVetor
        }

        System.out.println("\nPerceba que a ordem foi alterada porque removemos um dado.");

    }
}
