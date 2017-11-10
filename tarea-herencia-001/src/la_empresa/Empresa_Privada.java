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
public class Empresa_Privada extends Empresa {

    private int ventas_mensual_fijo;
    private int numero_sucursales;

    public Empresa_Privada(String nom, String no_si, String ciu_tra, int ventas_mensual_fijo, int numero_sucursales,
            Trabajador[] lis_tra) {
        super(nom, no_si, ciu_tra, lis_tra);
        this.ventas_mensual_fijo = ventas_mensual_fijo;
        this.numero_sucursales = numero_sucursales;
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
        this.numero_sucursales = nu_su;
    }

    @Override
    public String toString() {
        return String.format("DATOS DE LA EMPRESA\n"+"Empresa: %s\nSiglas: %s\nCiudad: %s\n"
                + "Ventas: $ %d\nSucursales: %d\nLista trabajadores: %s",
                 super.getNombre(), super.getNombre_siglas(), super.getCiudad_trabajadores(),
                 getVentas_mensual_fijo(), getNumero_sucursales(), super.obtener_lista_trabajadores());
    }

}
