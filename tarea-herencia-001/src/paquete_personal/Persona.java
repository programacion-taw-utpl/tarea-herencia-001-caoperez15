/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_personal;

/**
 *
 * @author Chris
 */
public class Persona {

    private String nombres;
    private String apellidos;
    private int edad;
    private String cedula;

    public Persona(String n, String ap, int e, String c) {
        setNombres(n);
        setApellidos(ap);
        setEdad(e);
        setCedula(c);

    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String n) {
        nombres = n;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String a) {
        apellidos = a;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int e) {
        edad = e;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String c) {
        cedula = c;
    }

    @Override
    public String toString() {
        return String.format("\t%s "
                + "%s\n"
                + "\t\t%daños de edad\n"
                + "\t\tCI: %s",
                getNombres(),
                getApellidos(),
                getEdad(),
                getCedula());
    }

}
