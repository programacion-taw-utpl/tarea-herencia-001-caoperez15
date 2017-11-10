/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package la_empresa;

import paquete_personal.Persona;
import paquete_personal.Trabajador;

/**
 *
 * @author Chris
 */
public class Principal {

    public static void main(String[] args) {

        Trabajador t = new Trabajador("Ana Luisa", "Velez Alcivar", 30, "12903939", 100, 40, 10);

        Trabajador t1 = new Trabajador("Mario Anibal", "Velez Alcivar", 35, "212889", 100, 50, 10);
        Trabajador t2 = new Trabajador("Mario Anibal", "Velez Alcivar", 35, "212889", 100, 50, 10);

        Trabajador[] lista_trabajadores = new Trabajador[2];
        lista_trabajadores[0] = t;
        lista_trabajadores[1] = t1;
      

        Empresa em_pv = new Empresa_Privada("Soluciones Software", "SS's", "Loja",2000,12, lista_trabajadores);

        System.out.println(em_pv);
    }

}
