/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proy_github;

/**
 *
 * @author Paco Moreno
 */
public class Proy_GitHub {

    /**
     * 
     * @param valor1 la nota que queremos sacar
     * @param valor2 la nota que vamos a sacar
     * @return devuelve el veredicto
     */
    private static String Proy_GitHub(String valor1, String valor2) {
        if (valor1.equals(valor2)) {
            return "Perfecto. Has tenido buen criterio.";
        }
        if (Integer.valueOf(valor1) < Integer.valueOf(valor2)) {
            return "Has mejorado, o te ha llegado el éxito inesperado.";
        }
        return "Te has confiado. Falta realismo.";
    }

    public static void main(String[] args) {
        System.out.println("La calificación de " + args[0] + " : ");
        Proy_GitHub(args[3], args[4]);
    }

}
