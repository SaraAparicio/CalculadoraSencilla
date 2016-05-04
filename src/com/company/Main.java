package com.company;

import java.util.Scanner;

public class Main {
    int opc = 0;
    double a = 0, b = 0;
    double resultado;
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Main m  = new Main();
        m.menu();

    }
    void menu(){
          System.out.println("1.Sumar \n2.Restar \n3.Multiplicar \n4.Dividir \n5.Salir");
          opc = scanner.nextInt();
          numeros();
      }

    void numeros(){
        while (opc != 5) {
            System.out.println("Primer digito:");
            a = scanner.nextDouble();
            System.out.println("Segundo digito:");
            b = scanner.nextDouble();
            calculo();
        }
        calculo();
    }

    void calculo(){
         switch (opc){
            case 1: resultado = a + b;break;
            case 2: resultado = a - b;break;
            case 3: resultado = a * b;break;
            case 4: resultado = a / b;break;
            case 5: System.exit(0);
            default:
                System.out.println("Elige entre las cuatro opciones.");
                menu();
        }
        resultado();
    }

    void resultado() {
        System.out.println("Resultado:"+ resultado);
        menu();


    }


}
