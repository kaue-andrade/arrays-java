//Algoritmo feito por Kauê Andrade dos Santos

import java.util.ArrayList; //Importa a biblioteca java.util.ArrayList

public class Exemplo2 {
    public static void main(String[] args){

        // O array serve para armazenar vários valores do mesmo tipo
        // Comumente usamos tipo[] nomeVariavel = new tipo[5]

        //Uma escola quer armazenar 4 nomes e depois mostrar no

        ArrayList<Integer> numeros = new ArrayList<Integer>(); //Cria um array com o tipo int que dá a possibilidade de armazenar 5 números inteiros
        //Lembrando: começa da posição 0. 0, 1, 2, 3

        numeros.add(0, 5); //Armazena o número 5 na posição 0
        numeros.add(1, 6); //Armazena o número 6 na posição 1
        numeros.add(2, 8); //Armazena o número 8 na posição 2
        numeros.add(3, 10); //Armazena o número 10 na posição 3

        System.out.println("\nArray versão inicial: " + numeros); //Imprime a array nomes

        System.out.println("\nNome na posição 1: " + numeros.get(1)); //Consulta o nome na posição 1 no array
        System.out.println("Nome na posição 3: " + numeros.get(3)); //Consulta o nome na posição 3 do array

        numeros.set(2, 15); //Altera o número do índice 2 para 15

        numeros.remove(4); //Remove o número no índice 3

        System.out.println("\nArray versão final: " + numeros + "\n"); //Imprime a array numeros

        for (int posicaoVetor = 0; posicaoVetor < 5; posicaoVetor++) { //Usa o laço de repetição for (para) e cria a variável do tipo int denominada posicaoVetor
            System.out.println("Nome na posição" + posicaoVetor + " : " + numeros.get(posicaoVetor) + " "); //Imprime o número correspondente a posicaoVetor
        }
    }
}
