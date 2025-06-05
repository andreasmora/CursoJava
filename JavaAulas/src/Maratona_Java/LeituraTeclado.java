package Maratona_Java;

import java.util.Scanner;

public class LeituraTeclado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu primeiro nome: ");
        String primeiroNome = scan.nextLine();
        System.out.println("Seu nome é: " + primeiroNome);

        System.out.println("Digite seu sobrenome: ");
        String sobreNome = scan.next();
        System.out.println("Seu sobrenme é: " +sobreNome);
        System.out.println(primeiroNome + sobreNome);

        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Sua idade é: " + idade);

        System.out.println("Digite sua altura: ");
        double altura = scan.nextDouble();
        System.out.println("Sua altura é: " + altura);

    }
}
