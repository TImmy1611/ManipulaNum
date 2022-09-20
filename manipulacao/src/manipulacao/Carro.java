/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manipulacao;

class Carro {
    static void custocarro() {
        System.out.println("Custo de Fabrica?");
        int custoF =Manipulacao.ler.nextInt();
        float Dist = (float) (0.28*custoF);
        float Imp = (float) (0.45*custoF);
        System.out.println("Imposto de Fábrica (45%): "+Imp+"€");
        System.out.println("Percentagem ao Distribuidor (28%): "+Dist+"€");
        System.out.println("Valor do carro "+(custoF+Dist+Imp)+"€");
        

    }

}
