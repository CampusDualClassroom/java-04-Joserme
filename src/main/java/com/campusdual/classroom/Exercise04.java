package com.campusdual.classroom;

public class Exercise04 {
    public static void main(String[] args) {

        int suma;
        int sumaEven;
        int factor;
        int factorRef;

        suma = sumNum(5);
        sumaEven = sumEvenNum(20);
        factor = factorial(7);
        factorRef = recursiveFactorial(7);

        System.out.println(suma);
        System.out.println(sumaEven);
        System.out.println(factor);
        System.out.println(factorRef);

        System.out.println("Ejemplos de cálculos SIN estructuras de control:");
        System.out.println("Suma de los primeros 5 números: " + (1 + 2 + 3 + 4 + 5));
        System.out.println("Suma de los primeros 20 números pares: " + (2 + 4 + 6 + 8 + 10 + 12 + 14 + 16 + 18 + 20 + 22 + 24 + 26 + 28 + 30 + 32 + 34 + 36 + 38 + 40));
        System.out.println("Obtén el factorial del número 7 → (7!): " + (7 * 6 * 5 * 4 * 3 * 2 * 1));
        System.out.println("######################################################################");
        System.out.println("Ejemplos de cálculos CON estructuras de control:");
        System.out.println();
    }

    public static int sumNum(int num) {
        int resultado = 0;
        for(int i = 0;i< num+1;i++){
            resultado += i;
        }
        return resultado;
    }

    public static int sumEvenNum(int num) {

        int resultado = 0;
        int a =2;
        for(int i = 0;i< num;i++){
            resultado += a;
            a+=2;
        }
        return resultado;
    }

    public static int factorial(int num) {
        int factorial = num;
        int i=1;
        while (num>i){
            factorial *= num-i;
            i++;
        }
        return factorial;
    }

    public static int recursiveFactorial(int num) {
        if(num == 0){
            return 1;
        }
        else
            return num * recursiveFactorial(num-1);
    }

}
