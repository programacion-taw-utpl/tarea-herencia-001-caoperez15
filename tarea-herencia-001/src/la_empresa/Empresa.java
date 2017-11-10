/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package la_empresa;

import paquete_personal.Trabajador;

/**
 *
 * @author Chris
 */
public class Empresa {
    private String nombre;
    private String nombre_siglas;  
    private String ciudad_trabajadores; 
    private Trabajador [] lista_trabajadores;

    public Empresa(String nom,String no_si, String ciu_tra, Trabajador[] lis_tra) {
        setNombre(nom);
        setNombre_siglas(no_si);
        setCiudad_trabajadores(ciu_tra);
        setLista_trabajadores(lis_tra);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String no) {
        nombre = no;
    }
    
    

    public String getNombre_siglas() {
        return nombre_siglas;
    }

    public void setNombre_siglas(String nom_si) {
        nombre_siglas = nom_si;
    }

    public String getCiudad_trabajadores() {
        return ciudad_trabajadores;
    }

    public void setCiudad_trabajadores(String ciu_tra) {
        ciudad_trabajadores = ciu_tra;
    }

    public Trabajador[] getLista_trabajadores() {
        return lista_trabajadores;
    }

    public void setLista_trabajadores(Trabajador[] lis_tra) {
        lista_trabajadores = lis_tra;
    }
    
    public String obtener_lista_trabajadores() {
        String cadena = "";
        Trabajador[] arrayTrabajor = getLista_trabajadores();
        for (int i = 0; i < arrayTrabajor.length; i++) {
            cadena += "\n\t"+(i +1) + ")" + String.format("%s",
                    arrayTrabajor[i].toString()
                    
            );
         
        }

        return cadena;
    }
    
    @Override
    public String toString() {
        return String.format("Empresa: %s\nSiglas: %s\nCiudad: %s\nLista Trabajadores: %s"
                ,getNombre(),getNombre_siglas(),getCiudad_trabajadores(),obtener_lista_trabajadores());
    }
    
}
