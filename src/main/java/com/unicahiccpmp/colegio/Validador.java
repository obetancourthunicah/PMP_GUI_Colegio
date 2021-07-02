/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicahiccpmp.colegio;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author obetancourth
 */
public class Validador {
    
    public static boolean esCadenaVacia(String cadena){
        Pattern regex = Pattern.compile("^\\s*$");
        Matcher validador = regex.matcher(cadena);
        return validador.find();
    }
    public static boolean esCorreoValido(String cadena){
        Pattern regex = Pattern.compile("^([\\w-]+(?:\\.[\\w-]+)*)@((?:[\\w-]+\\.)*\\w[\\w-]{0,66})\\.([a-z]{2,6}(?:\\.[a-z]{2})?)$");
        Matcher validador = regex.matcher(cadena);
        return validador.find();
    }
    public static boolean esTelefonoValido(String cadena){
        Pattern regex = Pattern.compile("^\\+?\\(?\\d{0,3}\\)?\\s?\\d{4}[-\\s]?\\d{4}$");
        Matcher validador =  regex.matcher(cadena);
        return validador.find();
    }
    // regular expression   reg ex
}
