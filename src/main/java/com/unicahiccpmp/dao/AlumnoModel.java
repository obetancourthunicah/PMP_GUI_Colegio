/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicahiccpmp.dao;

import java.util.ArrayList;

/**
 *
 * @author obetancourth
 */
public class AlumnoModel {
    public static ArrayList<Alumno> getAlumnos(){
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
        // Todo obtener de la base de datos
        Alumno _miAlumno = new Alumno();
        _miAlumno.setID(1);
        _miAlumno.setNOMBRES("Orlando");
        _miAlumno.setAPELLIDOS("Betancourth");
        _miAlumno.setIDENTIDAD("0801198412349");
        _miAlumno.setCORREO("obetancourthunicah@gmail.com");
        alumnos.add(_miAlumno);
        return alumnos;
    }
    
}
