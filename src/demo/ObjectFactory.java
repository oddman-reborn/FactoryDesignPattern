/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author Monirul Islam
 */
public class ObjectFactory {
    
    public Country getCitizen(String countryName)
    {
          if(countryName.equalsIgnoreCase("B"))
              return new Bangladesh();
          else if(countryName.equalsIgnoreCase("I"))
              return new Indian();
          else if(countryName.equalsIgnoreCase("P"))
              return new Pakistan();
          else
              return new Error();
    }
    
}
