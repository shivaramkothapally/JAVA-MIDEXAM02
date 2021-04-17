/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example9;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;

/**
 *
 * @author S542269
 */
public class libraryClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        //Create an object for Library
        Library libObj = new Library();
        
        //Calling To String Methods for both the classes
        System.out.println("To String of Library Study Rooms :" + libObj);
        System.out.println("To String of Library :"+libObj.toString());
    
    }
}
    

    
    

