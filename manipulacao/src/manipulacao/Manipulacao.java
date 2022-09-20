package manipulacao;

import java.util.Scanner;

public class Manipulacao {

//    public static void main(String[] args) {
    public static Scanner ler = new Scanner(System.in);
    public static int x, y;

    public static void main(String[] args) {
        int op;
        do {
            System.out.println("Menu de Operação com numeros");
            System.out.println("1- Maior de 2 numeros");
            System.out.println("2- Ordenar valores em decrescente");
            System.out.println("3- Soma Impares Multiplica Pares");
            System.out.println("4- Troca valores entre variáveis");
            System.out.println("5- Comparar Valores");
            System.out.println("6- Media Alunos");
            System.out.println("7- Calcular custo de carro");

            System.out.println("0.Sair");
            System.out.println("Selecione a opção pretendida");
            op = ler.nextInt();
            switch (op) {
                case 0:
                    break;
                case 1:
                    leValores("Insira um valor", "Insira outro valor");
                    MaiorNumero.maior2(x, y);
                    break;
                case 2:
                    do {
                        le1Valor("Insira um valor");

                        NumeroDecrescente.ordenaDecrescente(x);
                    } while (x <= 0);
                    break;
                case 3:
                    SomaImparesMultiplicaPares();
                    break;
                case 4:
                    leValores("Insira um valor", "Insira outro valor");
                    TrocaValores.mudaValoresVariaveis(x, y);
                    break;
                case 5:
                    leValores("Insira um valor", "Insira outro valor");
                    ComparaValores.compararvalores(x, y);
                    break;
                case 6:
                    MediaAluno.registanotas();
                    break;
                case 7:
                    Carro.custocarro();
                    break;
                default:
                    System.out.println("Insira opção Válida");
            }
        } while (op != 0);

    }

    public static void leValores(String s1, String s2) {
        System.out.println(s1);
        x = ler.nextInt();
        System.out.println(s2);
        y = ler.nextInt();
    }

    private static void le1Valor(String s1) {
        System.out.println(s1);
        x = ler.nextInt();
    }

    private static void SomaImparesMultiplicaPares() {
        int soma = 0;
        long multiplica = 1;
        x = 1;
        for (; x <= 30; x++) {
            if (x % 2 != 0) {
                soma = soma + x;
            } else {
                multiplica = multiplica * x;
            }
        }
        System.out.println(soma);
        System.out.println(multiplica);
    }
}
