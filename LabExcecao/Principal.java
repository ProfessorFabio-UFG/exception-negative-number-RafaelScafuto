package LabExcecao;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;

        try {
            System.out.println("Digite o primeiro numero inteiro:");
            numero1 = scanner.nextInt();
            if (numero1<0){
                throw new NumeroNegativo("Numero 1 é negativo!");
            }

            System.out.println("Digite o segundo numero inteiro:");
            numero2 = scanner.nextInt();
            if(numero2<0){
                throw new NumeroNegativo("Numero 2 é negativo!");
            }

            Calculadora calc = new Calculadora(numero1, numero2);
            System.out.println("Soma: " + calc.somar());
            System.out.println("Subtração: " + calc.subtrair());
            System.out.println("Multiplicação: " + calc.multiplicar());
            System.out.println("Divisão: " + calc.dividir());

        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Digite apenas números inteiros.");
        } catch (NumeroNegativo e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
