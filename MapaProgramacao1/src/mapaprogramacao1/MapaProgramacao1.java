/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapaprogramacao1;

import java.util.Scanner;

/**
 *
 * @author cesar
 */
public class MapaProgramacao1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int op = 0;
        do {
            System.out.println("**************************************MAMU**************************************");
            System.out.println("1 - CADASTRO DE PRODUTOS\n"
                    + "2 - MOVIMENTAÇÃO\n"
                    + "3 - REAJUSTE DE PREÇOS\n"
                    + "4 - RELATÓRIOS\n"
                    + "0 - FINALIZAR\n"
                    + "OPÇÃO: _");
            switch (op) {
                case 1:
                    break;
                default:
                    System.out.println("Opção invalida digite novamente");
                    break;
            }
            
        }
        while (op != 0);

    }}