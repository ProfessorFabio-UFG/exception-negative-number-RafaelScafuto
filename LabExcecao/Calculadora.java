package LabExcecao;

public class Calculadora {

    private int num1;
    private int num2;

    public Calculadora(int num1,int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public int somar(){
        return num1+num2;
    }

    public int subtrair(){
        return num1-num2;
    }

    public int multiplicar(){
        return num1*num2;
    }

    public int dividir(){
        if(num2==0){
            throw new ArithmeticException("Divisão por 0 não é permitido");
        }
        return num1/num2;
    }
}
