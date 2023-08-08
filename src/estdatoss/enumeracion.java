/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estdatoss;

/**
 *
 * @author SG702-09
 */
public class enumeracion {
enum DiaSemana {
    LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        DiaSemana dia = DiaSemana.SABADO;
        
        
        System.out.println("Hoy es " + dia);
        
       
        switch (dia) {
            case LUNES:
                System.out.println("Inicio de semana");
                break;
            case VIERNES:
                System.out.println("Final de semana");
                break;
            case SABADO:
            case DOMINGO:
                System.out.println("Es fin de semana");
                break;
            default:
                System.out.println("Dia de trabajo.");
                break;
        }
        
        
        System.out.println("Días de la semana:");
        for (DiaSemana d : DiaSemana.values()) {
            System.out.println(d);
        }
    }
}