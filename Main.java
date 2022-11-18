import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calc calc = new Calc();
        int N1;
        int N2;
        System.out.println("DIGITE: 1 - SOMA, 2 - SUBTRACAO, 3 - MULTIPLICACAO, 4 - DIVISAO, 5 PARA SAIR");
        int op = sc.nextInt();
        while (op != 5) {
            if (op == 1) {
                System.out.print("Digite o primeiro numero: ");
                N1 = sc.nextInt();
                System.out.print("Digite o segundo numero: ");
                N2 = sc.nextInt();
                calc.setNumbers(N1, N2);
                System.out.println("Soma: " + calc.soma());
            } else if (op == 2) {
                System.out.print("Digite o primeiro numero: ");
                N1 = sc.nextInt();
                System.out.print("Digite o segundo numero: ");
                N2 = sc.nextInt();
                calc.setNumbers(N1, N2);
                System.out.println("Subtração: " + calc.subs());
            } else if (op == 3) {
                System.out.print("Digite o primeiro numero: ");
                N1 = sc.nextInt();
                System.out.print("Digite o segundo numero: ");
                N2 = sc.nextInt();
                calc.setNumbers(N1, N2);
                System.out.println("Multiplicação: " + calc.mult());
            } else if (op == 4) {
                System.out.print("Digite o primeiro numero: ");
                N1 = sc.nextInt();
                System.out.print("Digite o segundo numero: ");
                N2 = sc.nextInt();
                calc.setNumbers(N1, N2);
                System.out.println("Divisão: " + calc.div());
            }
            System.out.println("DIGITE: 1 - SOMA, 2 - SUBTRACAO, 3 - MULTIPLICACAO, 4 - DIVISAO, 5 PARA SAIR");
            op = sc.nextInt();

        }
        System.out.println("Obrigado por utilizar nossa calculadora :)");
    }
}