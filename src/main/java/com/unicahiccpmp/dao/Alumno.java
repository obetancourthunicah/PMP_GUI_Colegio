/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicahiccpmp.dao;
/*

Alumnos
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
/**   POJO  -->  Plain old Java Object
 * 
 * @author obetancourth
 */
public class Alumno {

    /**
     * @return the _ID
     */
    public double getID() {
        return _ID;
    }

    /**
     * @param _ID the _ID to set
     */
    public void setID(double _ID) {
        this._ID = _ID;
    }

    /**
     * @return the _NOMBRES
     */
    public String getNOMBRES() {
        return _NOMBRES;
    }

    /**
     * @param _NOMBRES the _NOMBRES to set
     */
    public void setNOMBRES(String _NOMBRES) {
        this._NOMBRES = _NOMBRES;
    }

    /**
     * @return the _APELLIDOS
     */
    public String getAPELLIDOS() {
        return _APELLIDOS;
    }

    /**
     * @param _APELLIDOS the _APELLIDOS to set
     */
    public void setAPELLIDOS(String _APELLIDOS) {
        this._APELLIDOS = _APELLIDOS;
    }

    /**
     * @return the _IDENTIDAD
     */
    public String getIDENTIDAD() {
        return _IDENTIDAD;
    }

    /**
     * @param _IDENTIDAD the _IDENTIDAD to set
     */
    public void setIDENTIDAD(String _IDENTIDAD) {
        this._IDENTIDAD = _IDENTIDAD;
    }

    /**
     * @return the _TELEFONO
     */
    public String getTELEFONO() {
        return _TELEFONO;
    }

    /**
     * @param _TELEFONO the _TELEFONO to set
     */
    public void setTELEFONO(String _TELEFONO) {
        this._TELEFONO = _TELEFONO;
    }

    /**
     * @return the _CORREO
     */
    public String getCORREO() {
        return _CORREO;
    }

    /**
     * @param _CORREO the _CORREO to set
     */
    public void setCORREO(String _CORREO) {
        this._CORREO = _CORREO;
    }

    /**
     * @return the _GENERO
     */
    public String getGENERO() {
        return _GENERO;
    }

    /**
     * @param _GENERO the _GENERO to set
     */
    public void setGENERO(String _GENERO) {
        this._GENERO = _GENERO;
    }

    /**
     * @return the _FCHINGRESO
     */
    public String getFCHINGRESO() {
        return _FCHINGRESO;
    }

    /**
     * @param _FCHINGRESO the _FCHINGRESO to set
     */
    public void setFCHINGRESO(String _FCHINGRESO) {
        this._FCHINGRESO = _FCHINGRESO;
    }

    /**
     * @return the _FCHNAC
     */
    public String getFCHNAC() {
        return _FCHNAC;
    }

    /**
     * @param _FCHNAC the _FCHNAC to set
     */
    public void setFCHNAC(String _FCHNAC) {
        this._FCHNAC = _FCHNAC;
    }

    /**
     * @return the _GRADO
     */
    public String getGRADO() {
        return _GRADO;
    }

    /**
     * @param _GRADO the _GRADO to set
     */
    public void setGRADO(String _GRADO) {
        this._GRADO = _GRADO;
    }

    /**
     * @return the _SECCION
     */
    public String getSECCION() {
        return _SECCION;
    }

    /**
     * @param _SECCION the _SECCION to set
     */
    public void setSECCION(String _SECCION) {
        this._SECCION = _SECCION;
    }

    /**
     * @return the _ESTADO
     */
    public String getESTADO() {
        return _ESTADO;
    }

    /**
     * @param _ESTADO the _ESTADO to set
     */
    public void setESTADO(String _ESTADO) {
        this._ESTADO = _ESTADO;
    }
    
    public String getNOMBRECOMPLETO(){
        return String.format("%s %s", this._NOMBRES, this._APELLIDOS);
    }
    
    private double _ID;
    private String _NOMBRES;
    private String _APELLIDOS;
    private String _IDENTIDAD;
    private String _TELEFONO;
    private String _CORREO;
    private String _GENERO;
    private String _FCHINGRESO;
    private String _FCHNAC;
    private String _GRADO;
    private String _SECCION;
    private String _ESTADO;
    
}
