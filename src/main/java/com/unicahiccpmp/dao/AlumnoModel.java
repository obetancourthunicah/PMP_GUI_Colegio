/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicahiccpmp.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author obetancourth
 */
public class AlumnoModel {
    /*
    ID * AU
    NOMBRES
    APELLIDOS
    IDENTIDAD
    TELEFONO
    CORREO
    GENERO
    FCHINGRESO
    FCHNAC
    GRADO
    SECCION
    ESTADO CHAR(3)
    
    */
    
    public static void verificarTablaAlumnos(){
        try{
             Connection conn = Conn.obtenerConexion();
        
             String SQLCrearTabla = "CREATE TABLE IF NOT EXISTS alumnos"
                        + " (ID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,"
                        + " NOMBRES TEXT NOT NULL,"
                        + " APELLIDOS TEXT NOT NULL,"
                        + " IDENTIDAD TEXT NOT NULL,"
                        + " TELEFONO TEXT NOT NULL,"
                        + " CORREO TEXT NOT NULL,"
                        + " GENERO TEXT NOT NULL,"
                        + " FCHINGRESO TEXT NOT NULL,"
                        + " FCHNAC TEXT NOT NULL,"
                        + " GRADO TEXT NOT NULL,"
                        + " SECCION TEXT NOT NULL,"
                        + " ESTADO TEXT NOT NULL"
                        + ")";
                Statement comandoSql = conn.createStatement();
                comandoSql.executeUpdate(SQLCrearTabla);
                comandoSql.close();
        }catch(Exception ex){
            //
            System.err.println(ex.getMessage());
        }
    }
    
    public static ArrayList<Alumno> getAlumnos(){
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
        
        // Todo obtener de la base de datos
        /* Alumno _miAlumno = new Alumno();
        _miAlumno.setID(1);
        _miAlumno.setNOMBRES("Orlando");
        _miAlumno.setAPELLIDOS("Betancourth");
        _miAlumno.setIDENTIDAD("0801198412349");
        _miAlumno.setCORREO("obetancourthunicah@gmail.com");
        alumnos.add(_miAlumno);
        */
        try {
            Connection conn = Conn.obtenerConexion();

            String SQLGetAlumnos = "Select * FROM alumnos;";
            Statement comandoSql = conn.createStatement();
            ResultSet cursorAlumnos = comandoSql.executeQuery(SQLGetAlumnos);
            while( cursorAlumnos.next() ){
                Alumno _miAlumno = new Alumno();
                _miAlumno.setID(cursorAlumnos.getInt("ID"));
                _miAlumno.setNOMBRES(cursorAlumnos.getString("NOMBRES"));
                _miAlumno.setAPELLIDOS(cursorAlumnos.getString("APELLIDOS"));
                _miAlumno.setIDENTIDAD(cursorAlumnos.getString("IDENTIDAD"));
                _miAlumno.setCORREO(cursorAlumnos.getString("CORREO"));
                alumnos.add(_miAlumno);
            }
            comandoSql.close();

            return alumnos;
        
        } catch (Exception ex) {
            System.err.print(ex.getMessage());
            return alumnos;
        }
    }
    
    public static Alumno getAlumnosById(double Id){
        Alumno _miAlumno = new Alumno();
        
        // Todo obtener de la base de datos
        /* Alumno _miAlumno = new Alumno();
        _miAlumno.setID(1);
        _miAlumno.setNOMBRES("Orlando");
        _miAlumno.setAPELLIDOS("Betancourth");
        _miAlumno.setIDENTIDAD("0801198412349");
        _miAlumno.setCORREO("obetancourthunicah@gmail.com");
        alumnos.add(_miAlumno);
        */
        try {
            Connection conn = Conn.obtenerConexion();

            String SQLGetAlumnos = String.format("Select * FROM alumnos where ID=%s;", String.valueOf(Id));
            System.out.println(SQLGetAlumnos);
            Statement comandoSql = conn.createStatement();
            ResultSet cursorAlumnos = comandoSql.executeQuery(SQLGetAlumnos);
            while( cursorAlumnos.next() ){
                _miAlumno.setID(cursorAlumnos.getInt("ID"));
                _miAlumno.setNOMBRES(cursorAlumnos.getString("NOMBRES"));
                _miAlumno.setAPELLIDOS(cursorAlumnos.getString("APELLIDOS"));
                _miAlumno.setIDENTIDAD(cursorAlumnos.getString("IDENTIDAD"));
                _miAlumno.setCORREO(cursorAlumnos.getString("CORREO"));
                _miAlumno.setGENERO(cursorAlumnos.getString("GENERO"));
                _miAlumno.setFCHNAC(cursorAlumnos.getString("FCHNAC"));
                _miAlumno.setTELEFONO(cursorAlumnos.getString("TELEFONO"));
                _miAlumno.setGRADO(cursorAlumnos.getString("GRADO"));
                _miAlumno.setESTADO(cursorAlumnos.getString("ESTADO"));
                _miAlumno.setSECCION(cursorAlumnos.getString("SECCION"));
            }
            comandoSql.close();

            return _miAlumno;
        
        } catch (Exception ex) {
            System.err.print(ex.getMessage());
            return _miAlumno;
        }
    }
    
    public static boolean agregarAlumno(Alumno alumnoAAgregar){
        try{
            String sqlStr = "INSERT INTO alumnos (NOMBRES, APELLIDOS, IDENTIDAD, TELEFONO, CORREO, GENERO, FCHINGRESO, FCHNAC, GRADO, SECCION , ESTADO) VALUES ('%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s' , '%s')";
            
            Connection conn = Conn.obtenerConexion();
            Statement comandoSQL = conn.createStatement();
            int registroAfectados = comandoSQL.executeUpdate(
                    String.format(sqlStr,
                       alumnoAAgregar.getNOMBRES(), 
                       alumnoAAgregar.getAPELLIDOS(), 
                       alumnoAAgregar.getIDENTIDAD(), 
                       alumnoAAgregar.getTELEFONO(), 
                       alumnoAAgregar.getCORREO(), 
                       alumnoAAgregar.getGENERO(), 
                       alumnoAAgregar.getFCHINGRESO(), 
                       alumnoAAgregar.getFCHNAC(), 
                       alumnoAAgregar.getGRADO(), 
                       alumnoAAgregar.getSECCION(), 
                       alumnoAAgregar.getESTADO()
                    )
            );
            return registroAfectados > 0;
        }catch(Exception ex){
            System.err.println(ex.getMessage());
            return false;
        }
    }
    
    public static boolean editarAlumno(Alumno alumnoAEditar){
        try{
            String sqlStr = "UPDATE  alumnos set NOMBRES = '%s', APELLIDOS = '%s', IDENTIDAD = '%s', TELEFONO = '%s', CORREO = '%s', GENERO = '%s', FCHNAC =  '%s', GRADO =  '%s', SECCION =  '%s', ESTADO =  '%s' where ID=%f;";
            
            Connection conn = Conn.obtenerConexion();
            Statement comandoSQL = conn.createStatement();
            int registroAfectados = comandoSQL.executeUpdate(
                    String.format(sqlStr,
                       alumnoAEditar.getNOMBRES(), 
                       alumnoAEditar.getAPELLIDOS(), 
                       alumnoAEditar.getIDENTIDAD(), 
                       alumnoAEditar.getTELEFONO(), 
                       alumnoAEditar.getCORREO(), 
                       alumnoAEditar.getGENERO(), 
                       alumnoAEditar.getFCHNAC(), 
                       alumnoAEditar.getGRADO(), 
                       alumnoAEditar.getSECCION(), 
                       alumnoAEditar.getESTADO(),
                       alumnoAEditar.getID()
                    )
            );
            return registroAfectados > 0;
        }catch(Exception ex){
            System.err.println(ex.getMessage());
            return false;
        }
    }
    
    public static boolean eliminarAlumno(Alumno alumnoAEliminar){
        try{
            String sqlStr = "DELETE FROM  alumnos where ID=%f;";
            
            Connection conn = Conn.obtenerConexion();
            Statement comandoSQL = conn.createStatement();
            int registroAfectados = comandoSQL.executeUpdate(
                    String.format(sqlStr,
                       alumnoAEliminar.getID()
                    )
            );
            return registroAfectados > 0;
        }catch(Exception ex){
            System.err.println(ex.getMessage());
            return false;
        }
    }
    
}
