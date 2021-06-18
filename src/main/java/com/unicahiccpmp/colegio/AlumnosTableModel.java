/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicahiccpmp.colegio;

import com.unicahiccpmp.dao.Alumno;
import java.util.Arrays;
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
/**
 *
 * @author obetancourth
 */
public class AlumnosTableModel extends GenericDomainTableModel<Alumno>{
    //Estamos definiendo los titulos del JTable
    public AlumnosTableModel(){
        super( Arrays.asList( new Object[]{"Código", "Nombre Completo", "Identidad", "Correo"} ));
    }
    
    @Override
    public Class<?> getColumnClass(int colIndex){
        switch(colIndex){
            case 0:
                return Double.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
        }
        throw new ArrayIndexOutOfBoundsException(colIndex);
    }
    
    
    @Override
    public Object getValueAt(int rowIndex, int colIndex) {
        Alumno item = getDomainObject(rowIndex);
        switch(colIndex){
            case 0:
                return item.getID();
            case 1:
                return item.getNOMBRECOMPLETO();
            case 2:
                return item.getIDENTIDAD();
            case 3:
                return item.getCORREO();
        }
        throw new ArrayIndexOutOfBoundsException(colIndex);
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int colIndex){
       // return rowIndex>0 && colIndex > 1;
       return false;
    }
   
    @Override
    public void setValueAt(Object valor, int rowIndex, int colIndex){
        ///Implementación
        
        //Dispanara un Evento de Notificacion
        notifyTableCellUpdated(rowIndex, colIndex);
    } 
}
