//Algoritmo feito por Kauê Andrade dos Santos

import java.util.ArrayList; //Importa java.util.ArrayList

public class Exemplo3 {
    public static void main(String[] args){

        //int posicaoVetor = 0; //posicaoVetor recebe 0

        // O array serve para armazenar vários valores do mesmo tipo
        // tipo[] nomeVariavel = new tipo[5]

        //Uma escola quer armazenar 10 nomes, para isso iremos criar um array, armazenar, consultar, alterar e deletar dados dele

        ArrayList<String> nomes = new ArrayList<String>(); //Cria um array com o tipo String que dá a possibilidade de armazenar 5 nomes
        //0, 1, 2, 3...

        nomes.add(0, "Adalberto"); //Armazena o nome Adalberto na posição 0
        nomes.add(1, "Antônio"); //Armazena o nome Antônio na posição 1
        nomes.add(2, "Ruth"); //Armazena o nome Ruth na posição 2
        nomes.add(3, "Isabela"); //Armazena o nome Isabela na posição 3
        nomes.add(4, "Ana"); //Armazena o nome Ana na posição 4
        nomes.add(5, "Carol"); //Armazena o nome Carol na posição 5
        nomes.add(6, "Breno Araújo"); //Armazena o nome Breno Araújo na posição 6
        nomes.add(7, "Adalberto"); //Armazena o nome Adalberto na posição 7
        nomes.add(8, "Ruth"); //Armazena o nome Ruth na posição 8
        nomes.add(9, "Olívia"); //Armazena o nome Olívia na posição 9

        System.out.println("\nArray versão inicial: " + nomes); //Imprime a array nomes

        System.out.println("\nNome na posição 1: " + nomes.get(1)); //Consulta o nome na posição 1 no array
        System.out.println("Nome na posição 3: " + nomes.get(3)); //Consulta o nome na posição 3 do array

        nomes.set(8, "Ritonelton"); //Altera o nome do índice 2 para Ritonelton

        nomes.remove(5); //Remove o nome no índice 3

        System.out.println("\nArray versão final: " + nomes + "\n"); //Imprime a array nomes

        //posicaoVetor < 8 porque temos 7 números

        for (int posicaoVetor = 0; posicaoVetor < 8; posicaoVetor++) { //Usa o laço de repetição for e cria a variável do tipo int denominada posicaoVetor
            System.out.println("Nome na posição " + posicaoVetor + ": " + nomes.get(posicaoVetor) + " "); //Imprime o nome correspondente a posicaoVetor
        }
        System.out.println("\nPercebemos que os nomes iguais foram repetidos na array");
    }
}
