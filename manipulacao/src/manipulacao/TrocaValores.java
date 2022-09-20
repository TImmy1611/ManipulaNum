/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manipulacao;

class TrocaValores {

    static void mudaValoresVariaveis(int x, int y) {
        int z;
        System.out.println("Antes da troca x= "+x+" y= "+y);
        z=x;
        x=y;
        y=z;
        System.out.println("Depois da troca x= "+x+" y= "+y);
    }

}
