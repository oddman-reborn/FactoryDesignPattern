/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorydesignpattern;

import demo.Country;
import demo.ObjectFactory;
import java.util.Scanner;

/**
 *
 * @author Monirul Islam
 */
public class FactoryResult {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        String country=scan.nextLine();
        
        ObjectFactory obj=new ObjectFactory();
        Country cntry= obj.getCitizen(country);
        cntry.showDetails(country);
    }
    
}
