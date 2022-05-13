//Algoritmo feito por Kauê Andrade dos Santos

import java.util.ArrayList; //Importa java.util.ArrayList
import java.util.Scanner; //Importa java.util.Scanner

public class Exemplo2 {
    public static void main(String[] args){

        int posicaoVetor = 0; //posicaoVetor recebe 0

        Scanner ler = new Scanner(System.in); //Criamos um scanner

        // O array serve para armazenar vários valores do mesmo tipo
        // tipo[] nomeVariavel = new tipo[5]

        //Uma escola quer armazenar 4 nomes, para isso iremos criar um array, armazenar, consultar, alterar e deletar dados dele

        ArrayList<String> nomes = new ArrayList<String>(); //Cria um array com o tipo String que dá a possibilidade de armazenar 5 nomes
        //Lembrando: começa da posição 0. 0, 1, 2, 3


        //Utilizamos arrays comuns dessa forma:

        //nomes[0] = "Kauê"; //Armazena o nome Breno Araújo na posição 0
        //nomes[1] = "Breno Araújo"; //Armazena o nome Kauê na posição 1
        //nomes[2] = "João"; //Armazena o nome João na posição 2
        //nomes[3] = "Maria"; //Armazena o nome Maria na posição 3

        //Vamos utilizar os benefícios do ArrayList

        nomes.add(0, "Kauê"); //Armazena o nome Breno Araújo na posição 0
        nomes.add(1, "Breno Araújo"); //Armazena o nome Kauê na posição 1
        nomes.add(2, "João"); //Armazena o nome João na posição 2
        nomes.add(3, "Maria"); //Armazena o nome Maria na posição 3

        System.out.println("\nArray versão inicial: " + nomes); //Imprime a array nomes

        //Estrutura básica para realizar o input

        System.out.print("\nPrimeira posição que deseja consultar: "); //Imprime a mensagem
        int primeiraposi = ler.nextInt();

        System.out.println("\nNome na posição " + primeiraposi + ": " + nomes.get(primeiraposi) + "\n"); //Consulta o nome na posição desejada pelo usuário

        //Estrutura básica para realizar o input

        System.out.print("Segunda posição que deseja consultar: "); //Imprime a mensagem
        int segundaposi = ler.nextInt();

        System.out.println("Nome na posição " + segundaposi + ": " + nomes.get(segundaposi) + "\n"); //Consulta o nome na posição desejada pelo usuário

        nomes.set(2, "José"); //Altera o nome do índice 2 para José

        nomes.remove(3); //Remove o nome no índice 3

        System.out.println("\nArray versão final: " + nomes + "\n"); //Imprime a array nomes

        //for (int posicaoVetor = 0; posicaoVetor < 5; posicaoVetor++) { //Usa o laço de repetição for e cria a variável do tipo int denominada posicaoVetor
        //System.out.println("Nome na posição" + posicaoVetor + " : " + nomes.get(posicaoVetor) + " "); //Imprime o nome correspondente a posicaoVetor
        //}

        //posicaoVetor < 3 porque temos 2 números

        while (posicaoVetor < 3){ //Usa o laço de repetição while (enquanto) e cria a variável do tipo int denominada posicaoVetor
            System.out.println("Nome na posição " + posicaoVetor + ": " + nomes.get(posicaoVetor) + " "); //Imprime o nome correspondente a posicaoVetor
            posicaoVetor++; //posicaoVetor recebe + 1
        }
    }
}
