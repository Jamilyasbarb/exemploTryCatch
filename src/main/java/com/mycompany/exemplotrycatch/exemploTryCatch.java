package com.mycompany.exemplotrycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exemploTryCatch {
     public static int quociente(int numerador, int denominador) throws ArithmeticException{
        return numerador / denominador;
    }
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        boolean continueLoop = true;
        
        do{
            try{
                int num;
                int den;
                int result;

                System.out.println("Digite um numero INTEIRO: ");
                num = t.nextInt();

                System.out.println("Digite outro numero INTEIRO: ");
                den = t.nextInt();

                result = quociente(num, den);
                System.out.printf("%d / %d = %d", num, den, result);
                continueLoop = false;
            } 
            catch(InputMismatchException inputMismatchException){
                System.err.printf("\nException: %s%n", inputMismatchException);
                t.nextLine();
                System.out.println("TIPO INVÁLIDO! Tente Novamente com um número INTEIRO\n\n");
                System.out.println("----------------------------------------------------------------");
            }

            catch(ArithmeticException arithmeticException){
                System.err.printf("\nException: %s \n ", arithmeticException);
                System.out.println("DIVISÃO INCORRETA! Digite um número DIFERENTE de ZERO.\n\n");
                System.out.println("----------------------------------------------------------------");
            }
        }while(continueLoop);
    }
}
