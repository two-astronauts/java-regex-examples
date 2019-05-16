/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaRegexExamples;
import javax.swing.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 *
 * @author sala203
 */
public class JavaRegexExamples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String cadena;
        Pattern p;
        Matcher mat;
        
        cadena = JOptionPane.showInputDialog(" Ingrese Cadena");
        p = Pattern.compile("(es)[a-z]");
        mat = p.matcher(cadena);
        
//        if(mat.find()){
//            System.out.println("Válido");
//        }else{
//            System.out.println("No Válido");
//        }
        
//        if(mat.matches()){
//            System.out.println("Válido");
//        }else{
//            System.out.println("No Válido");
//        }
        
        while(mat.find()){
            System.out.println("Empieza "+mat.start()+"-"+mat.end());
            System.out.println(cadena.substring(mat.start(),mat.end()));
        }
        
        p = Pattern.compile("es");
        mat = p.matcher(cadena);
//        String[] items = p.split(cadena);
//        
//        for( int k = 0; k < items.length; k ++ ){
//            System.out.println(items[k]);
//        }
//        
        String R = mat.replaceFirst("ayz");
        System.out.println(R);
    }
    
}
