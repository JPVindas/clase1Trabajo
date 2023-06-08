/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;

import javax.swing.JOptionPane;

/**
 *
 * @author LABORATORIO 04
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String employees= JOptionPane.showInputDialog("Ingrese la cantidad de empleados");
        int employee_cont = Integer.parseInt(employees);
        
        int sal_cont =0;
        for (int i = 0; i < employee_cont; i++) {
            String salary = JOptionPane.showInputDialog("Ingrese el salario del empleado"+(i+1)+"en colones.");
            int sal= Integer.parseInt(salary);
            
            int SEM = (int) (sal*0.00925);
            int IVM = (int)(sal*0.0508);
            
            sal_cont= sal_cont + sal -SEM -IVM;
            
            
        }
        System.out.println("Laa empresa deberia abonara la CCSS el monto de "+sal_cont+" colones por concespto ");
    }
    
}
