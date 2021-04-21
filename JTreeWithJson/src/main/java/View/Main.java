/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author MateyR
 */
public class Main {
    public static void main(String[] args){
        
        String[] prueba = {"A ","B","C","A ","S","S"};
        
        boolean ValorUnico = ValorUnico("C",prueba);
        boolean ValorUnico2 = ValorUnico("S",prueba);
        boolean ValorUnico3 = ValorUnico("A",prueba);
        
        if(ValorUnico){
            System.out.println(ValorUnico);
        }
        System.out.println(ValorUnico2);
        System.out.println(ValorUnico3);
    }

    private static boolean ValorUnico(String valor, String[] arreglo) {
        
        int cont = 0;
         for (int i = 0; i < arreglo.length; i++)
         {
           if (arreglo[i].equalsIgnoreCase(valor)){
               cont++;
           }
           
        }

        return cont == 1;
    }
    
    
    
    
    
}
