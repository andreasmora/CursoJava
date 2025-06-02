package Maratona_Java;

import java.util.Scanner;

public class LeituraTeclado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scan.next();
        System.out.println("Bem vindo!!! " + nome);


    }
}
