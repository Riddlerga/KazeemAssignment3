/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package energycalculator;

import java.util.Scanner;

/**
 *
 * @author 070005313
 */
public class EnergyCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        System.out.print("Customer name: ");
        Scanner cust = new Scanner(System.in);
        String cust_name = cust.nextLine();
        
        System.out.print("Average daily electricity usage (in KWh): ");
        Scanner e_usage = new Scanner(System.in);
        String elec_usage = e_usage.nextLine();
        
        System.out.print("Average daily gas usage (in cubic meters): ");
        Scanner g_usage = new Scanner(System.in);
        String gas_usage = g_usage.nextLine();       
        
        
        System.out.print("Hello: " );
        System.out.println(cust_name);
        
        
    
    
    }
    
}
