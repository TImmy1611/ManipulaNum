/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manipulacao;

/**
 *
 * @author ftimoteo
 */
class MediaAluno {

    public static int[] notas;

    static void registanotas() {
        int n;
        System.out.println("Quantas notas pretende introduzir?");
        n = Manipulacao.ler.nextInt();
        notas = new int[n];
        for (int x = 0; x < n; x++) {
            System.out.println("Insira nota" + (x + 1));
            notas[x] = Manipulacao.ler.nextInt();
        }
        mediaAluno();
    }

    private static void mediaAluno() {
        int tam = notas.length;
        int soma = 0;
        for(int x=0;x<tam;x++)
            soma+=notas[x];
        System.out.println("Media do aluno: "+(1.0*soma/tam));
    }

}
