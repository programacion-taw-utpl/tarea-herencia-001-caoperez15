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
public class Trabajador extends Persona {

    private int costo_seguro;
    private int horas_trabajadas;
    private int costo_por_hora;

    public Trabajador(String n, String ap, int e, String c, int cos_se,
                      int ho_tra, int cos_x_h ) {
        super(n, ap, e, c);
        costo_seguro=cos_se;
        horas_trabajadas=ho_tra;
        costo_por_hora=cos_x_h;
    }

    public int getCosto_seguro() {
        return costo_seguro;
    }

    public void setCosto_seguro(int cos_se) {
        costo_seguro = cos_se;
    }

    public int getHoras_trabajadas() {
        return horas_trabajadas;
    }

    public void setHoras_trabajadas(int ho_tra) {
        horas_trabajadas = ho_tra;
    }

    public int getCosto_por_hora() {
        return costo_por_hora;
    }

    public void setCosto_por_hora(int cos_p_h) {
        costo_por_hora = cos_p_h;
    }
    
    public double obtener_sueldo(){
    double sueldo =0.0;
    sueldo+=(getHoras_trabajadas()*getCosto_por_hora()+getCosto_seguro());
        
        
    return sueldo;
    }
    
    @Override
    public String toString() {
        return String.format("%s"
                + "\t\tSeguro: $%d\n\t\tHoras Trabajadas: %dh\n\t\tValor por hora: $%d\n\t\tSueldo: $%.0f"
                ,super.toString()
                ,getCosto_seguro(),getHoras_trabajadas(),getCosto_por_hora(),obtener_sueldo()
                 );
    }

}
