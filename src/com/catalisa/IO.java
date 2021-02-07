package com.catalisa;

import java.util.Random;
import java.util.Scanner;

public class IO {

    public static Random random(){
        return new Random();
    }
    //Esse método é util para ser criar perguta ao jogador!
    public static Scanner criarScanner(){
        return new Scanner(System.in);
    }
    public static Scanner numDigitadoUsuario(){
        return new Scanner(System.in);
    }
    public static void exibirDados(String texto){
        System.out.println(texto);
    }
}
