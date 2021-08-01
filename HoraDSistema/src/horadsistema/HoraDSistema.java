

package horadsistema;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class HoraDSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Locale.setDefault(Locale.US);
     Scanner teclado = new Scanner(System.in);
     //int idade = 30;
       // String valor = Integer.toString(idade); 
       
    String valor= "30";
    int idade = Integer.parseInt(valor);
        System.out.println(idade + 0xa);

}
}
