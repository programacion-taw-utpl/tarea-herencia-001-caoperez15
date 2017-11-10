/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_laempresa;

import paquete_personal.Trabajador;

/**
 *
 * @author Chris
 */
public class Empresa_Privada extends Empresa {

    private int ventas_mensual_fijo;
    private int numero_sucursales;

    public Empresa_Privada(String nom, String no_si, String ciu_tra, int ven_men_fi, int num_suc,
            Trabajador lis_tra[]) {
        super(nom, no_si, ciu_tra, lis_tra);
        setVentas_mensual_fijo(ven_men_fi);
        setNumero_sucursales(num_suc);
    }

    public int getVentas_mensual_fijo() {
        return ventas_mensual_fijo;
    }

    public void setVentas_mensual_fijo(int ven_me_f) {
        ventas_mensual_fijo = ven_me_f;
    }

    public int getNumero_sucursales() {
        return numero_sucursales;
    }

    public void setNumero_sucursales(int nu_su) {
        numero_sucursales = nu_su;
    }

    @Override
    public Trabajador[] getLista_trabajadores() {

        return lista_trabajadores;
    }

    public String obtener_lista_trabajadores() {
        String cadena = "";
        Trabajador[] arrayTrabajor = getLista_trabajadores();
        for (int i = 0; i < arrayTrabajor.length; i++) {
            cadena += "\n\n\t" + (i + 1) + ")"
                    + arrayTrabajor[i].toString();

        }

        return cadena;
    }

    @Override
    public String toString() {

        return String.format("%sVentas: $%d\n"
                + "Sucursales: %d\n"
                + "Lista Trabajadores: %s",
                super.toString(),
                getVentas_mensual_fijo(),
                getNumero_sucursales(),
                obtener_lista_trabajadores());

    }
}
