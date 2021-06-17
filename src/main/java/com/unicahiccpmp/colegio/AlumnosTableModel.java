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
    public AlumnosTableModel(){
        super( Arrays.asList(new Object[]{"Código", "Nombre Completo", "Identidad", "Correo"}) );
    }
    
     @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch(columnIndex) {
            case 0: return Double.class;
            case 1: return String.class;
            case 2: return String.class;
            case 3: return String.class;
        }
        throw new ArrayIndexOutOfBoundsException(columnIndex);
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Alumno item = getDomainObject(rowIndex);
        switch(columnIndex) {
            case 0: return item.getID();
            case 1: return item.getNOMBRECOMPLETO();
            case 2: return item.getIDENTIDAD();
            case 3: return item.getCORREO();
                default: throw new ArrayIndexOutOfBoundsException(columnIndex);
        }
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Alumno item = getDomainObject(rowIndex);
        switch(columnIndex) {
            case 0: /*item.setNombre((String)aValue);*/ break;
            //case 1: persona.setFechaDeNacimiento((Date)aValue); break;
            //case 2: persona.setDocumento((Long)aValue); break;
                default: throw new ArrayIndexOutOfBoundsException(columnIndex);
        }
        notifyTableCellUpdated(rowIndex, columnIndex); // NO olvidar!!!
    }
    
    
}
