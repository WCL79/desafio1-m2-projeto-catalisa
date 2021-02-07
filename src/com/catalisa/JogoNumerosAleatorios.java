package com.catalisa;
/*
Jogo adivinha

Os alunos devem gerar um número aleatório e comparar com uma resposta vinda do usuário.
Caso seja o mesmo numero o usuario ganha 10 pontos, caso seja numero diferente do programa deve comparar para saber se o numero esta 1 acima ou 1 abaixo do numero sorteado, caso positivo o usuario ganha 5 pontos, caso negativo o usuario apenas perde. Nenhum fim deve ser aplicado a pontuação do usuário. Tudo via console.

Entrega mínima

Sistema sorteia o numero e realiza todas as comparações,
no final ele exibi uma pontuação correta

Entrega média

O Sistema permite Jogar Mais de Uma Vez e soma Todas as pontuações.

Entrega Máxima

O sistema permite adicionar nivel de dificuldade de alguma forma e exibi,
alem da pontuação, os numeros que o usuario errou e acertou.
 */


public class JogoNumerosAleatorios {


    public static void main(String[] args) {

        int numeroAleatorio = IO.random().nextInt(10);

        boolean errou = true;
        int pontos = 0;
        while (errou){

            IO.exibirDados("Você quer dar continuidade com o jogo? \nSe SIM basta digitar: 1 \nCaso NÃO, basta digitar: 0!");
            int resposta = IO.criarScanner().nextInt();

            if(resposta == 1){
                IO.exibirDados("Boa sorte! Adivinhe qual é o número!");
               int numDigitadoUsuario = IO.numDigitadoUsuario().nextInt();


                if (numeroAleatorio == numDigitadoUsuario) {
                    pontos += 10;
                    errou = false;
                    IO.exibirDados("Você acertou\n pontuação="+pontos);

                    //caso seja numero diferente do programa
                    //comparar para saber se o numero esta 1 acima ou 1 abaixo do numero sorteado
                } else if (numDigitadoUsuario + 1 == numeroAleatorio || numDigitadoUsuario - 1 == numeroAleatorio) {

                    pontos += 5;
                    IO.exibirDados("Você GANHOU 5 pontos!\n");

                } else if (numDigitadoUsuario != numeroAleatorio) {
                    IO.exibirDados("Você NÃO SOMOU PONTOS!");
                }

            }else if(resposta == 0){
                errou = false;
                IO.exibirDados("Pontuação = "+pontos);
                IO.exibirDados("Jogo ENCERRADO!");
            }
        }
    }
}
