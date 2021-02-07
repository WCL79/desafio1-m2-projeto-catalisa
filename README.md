# desafio1-m2-projeto-catalisa
Desafio referente treinamento Back end com Linguagem Java

Esse programa é referente ao treinamento das aulas de Linguagem Java. Conforme se pode notar pelo nome do Repositório: desafio1-m2-projeto-catalisa; esse é o 1° desfio do Módulo 2 do Projeto Catalisa cuja empresa ZUP está propiciando aos PCD (Pessoas Com Deficiência) ao mundo da programação ao desenvolvimento de software.

No 2° Módulo foi introduzido os conceitos da Linguagem Estrutural e a Linguagem Orientada Objeto. Naquele, foram apresentados os procedimentos para desenvolver um programa cuja sintaxe à implementação.

O desafio era para ser entregue na data: 02/02/21, porém o Vinicius Ferreira Raymundo disponibilizou nova data a qual ficou estabelecida para 08/02/2020. Entretanto, mesmo que o desafio em questão não foi entregue no tempo determinado; cujo programa desafio deveria ser entregue na Linguagem Java Estruturada conforme se pode verificar abaixo, porém, esse desafio foi desenvolvido com os Princípios da Linguagem Java com Paradigma Orientado Objeto, até porque semana que se passou 01/02 a 05/02 foi introduzido os conceitos ao POO: package com.catalisa.desafio; /* Jogo adivinha

Os alunos devem gerar um número aleatório e comparar com uma resposta vinda do usuário. Caso seja o mesmo numero o usuario ganha 10 pontos, caso seja numero diferente do programa deve comparar para saber se o numero esta 1 acima ou 1 abaixo do numero sorteado, caso positivo o usuario ganha 5 pontos, caso negativo o usuario apenas perde. Nenhum fim deve ser aplicado a pontuação do usuário. Tudo via console.

Entrega mínima

Sistema sorteia o numero e realiza todas as comparações, no final ele exibi uma pontuação correta

Entrega mídia

O Sistema permite Jogar Mais de Uma Vez e soma Todas as pontuações. Entrega Máxima

O sistema permite adicionar nivel de dificuldade de alguma forma e exibi, alem da pontuação, os numeros que o usuario errou e acertou. */

import java.util.Random; import java.util.Scanner;

public class JogoNumerosAleatorios {

public static Scanner criarScanner(){

   return new Scanner(System.in);
} public static void main(String[] args) {

   Random random = new Random();
   int numeroAleatorio = random.nextInt(10);


   boolean errou = true;
   int pontos = 0;
   while (errou){
       System.out.println("Você quer dar continuidade com o jogo? \nSe SIM basta digitar: 1 \nCaso NÃO, basta digitar: 0!");
       int resposta = criarScanner().nextInt();
       if(resposta == 1){
           System.out.println("Boa sorte! Adivinhe qual é o número!");
           int numDigitadoUsuario = new Scanner(System.in).nextInt();
           if (numeroAleatorio == numDigitadoUsuario) {
               pontos += 10;
               errou = false;
               System.out.println("Você acertou\n pontuação="+pontos);
           } else if (numDigitadoUsuario + 1 == numeroAleatorio || numDigitadoUsuario - 1 == numeroAleatorio) {//caso seja numero diferente do programa
               //comparar para saber se o numero esta 1 acima ou 1 abaixo do numero sorteado
               pontos += 5;
               System.out.println("Você GANHOU 5 pontos!\n");
           } else if (numDigitadoUsuario != numeroAleatorio) {
               System.out.println("Você NÃO SOMOU PONTOS!");
           }
       }else if(resposta == 0){
       errou = false;
       System.out.println("Pontuação = "+pontos);
       System.out.println("Jogo ENCERRADO!");
       }
   }
} }
