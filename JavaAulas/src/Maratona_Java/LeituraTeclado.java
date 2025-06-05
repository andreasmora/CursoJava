package Maratona_Java;

import java.util.Scanner;

public class LeituraTeclado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*System.out.println("Digite seu primeiro nome: ");
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
        System.out.println("Sua altura é: " + altura); */

        System.out.println("Entre com seu nome, sua idade, sua altura, seu peso e se tem filhos: ");
        String nome = scan.next();
        int idade = scan.nextInt();
        double altura = scan.nextDouble();
        float peso = scan.nextFloat();
        boolean filhos = scan.nextBoolean();


        System.out.println("Seu nome é: " + nome);
        System.out.println("Sua idade é: " + idade);
        System.out.println("Sua altura é: " + altura);
        System.out.println("Seu peso é: " + peso);
        System.out.println("Tem filhos? " + filhos);
    }
}
