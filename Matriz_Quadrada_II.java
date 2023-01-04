package EX;
import java.io.IOException;
import java.util.Scanner;

/**
    beecrowd | 1478

    Matriz Quadrada II
    ==================================================

        Escreva um algoritmo que leia um inteiro N (0 ≤ N ≤ 100), correspondente a ordem de uma matriz M de inteiros, e construa a matriz de acordo com o exemplo abaixo.

    # Entrada

        A entrada consiste de vários inteiros, um valor por linha, correspondentes as ordens das matrizes a serem construídas. O final da entrada é marcado por um valor de ordem igual a zero (0).

    # Saída

        Para cada inteiro da entrada imprima a matriz correspondente, de acordo com o exemplo. (os valores das matrizes devem ser formatados em um campo de tamanho 3 justificados à direita e separados por espaço. Após o último caractere de cada linha da matriz não deve haver espaços em branco. Após a impressão de cada matriz deve ser deixada uma linha em branco.

    # Exemplo de Entrada	
        1
        2
        3
        4
        5
        0
    ============================================
    # Exemplo de Saída
        1

        1   2
        2   1

        1   2   3
        2   1   2
        3   2   1

        1   2   3   4
        2   1   2   3
        3   2   1   2
        4   3   2   1

        1   2   3   4   5
        2   1   2   3   4
        3   2   1   2   3
        4   3   2   1   2
        5   4   3   2   1

    
    */
public class Matriz_Quadrada_II {
 
    public static void main(String[] args) throws IOException {
    
        Scanner ler = new Scanner(System.in);
        
        int n, cont=0,qntMatrizes=0;//quantidade de matrizes a ser printadas
        int[] numerosUser = new int[100];//armazena os números válidos digitados pelo usuário
        
        System.out.println("Digite os números: *OBS Digite '0' e  veja o resultado");
        do{
            n = ler.nextInt();
            if(n > 0 && n <= 100){//validação de números entre 1 e 100, os validos são armazenados em um vetor
                numerosUser[qntMatrizes] = n;
                qntMatrizes++;
                
            }
            
        }while( n !=0);//enquanto o usuário não digitar 0, não se encerra o loop

        System.out.println("numero de matrizes: "+qntMatrizes);
        int[] listaUser = new int[qntMatrizes];

        for (int i : numerosUser) {//vetor tratado com apenas os valores válidos digitados pelo usuário
            if(i != 0){
                listaUser[cont] = i;
                cont++;
            }
        }
        //Percorre a lista de numeros válidos que o usuario digitou
        for (int i : listaUser) {
            
            int aux = i;

            //Formação da matriz #Coluna1 ascendente 
            for(int j = 1; j<=i; j++){

                //impressão da primeira linha
                if(j==1){
                    for(int q = 1; q <= i; q++ ){
                        System.out.printf("%3d",q);// printa primeira linha de 1 até o tamanho da matriz 
                        //
                        if(q == i){
                            System.out.println();
                        }
                    }
                }else{//Caso a primeira linha ja tenha sido impressa
                    //após pular pra linha de baixo, imprime o valor do j(coluna 1) até o número 2(descendente)
                    for(int k = j; k!=1; k--){
                        System.out.printf("%3d",k);
                    }
                    //imprime ascendentemente do 1 até o número aux   //#aux é uma variável criada incialmente na linha 84 com o valor de i(número passado pelo usuário), a cada iteração ela perde 1 de seu valor inicial como vemos na linha 107
                    for(int g = 1; g != aux; g++ ){
                        System.out.printf("%3d",g);
                    }
                    aux--;
                    System.out.println();
                }
                
            }
            System.out.println();

            
        }
        

        
    }
 
}