package com.mycompany.ejercicio12;
public class Ejercicio12 {

    public static void main(String[] args) {
        double horas_de_trabajo, costo_hora, retencion_fuente, porcentaje_retencion, salario_bruto, salario_neto;
        horas_de_trabajo=48;
        costo_hora=5000;
        porcentaje_retencion = 12.5/100;
        salario_bruto = horas_de_trabajo*costo_hora;
        retencion_fuente= salario_bruto*porcentaje_retencion;
        salario_neto=salario_bruto-retencion_fuente;
        
        System.out.println("Las horas de trabajo fueron: " +horas_de_trabajo);
        System.out.println("El costo de la hora es: " +costo_hora);
        System.out.println("El salario bruto es: " +salario_bruto);
        System.out.println("La retención en la funete es: " +retencion_fuente);
        System.out.println("El salario neto es: " +salario_neto);
    }
}
