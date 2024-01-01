
package Model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class Tabel_Regis extends AbstractTableModel{
    List<ObjectRegister> listobject;
    
    public Tabel_Regis(List<ObjectRegister> object) {
        this.listobject = object;
    }
    
    @Override
    public int getRowCount() {
       return listobject.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }
    
        @Override
    public String getColumnName(int column) {
        switch (column){
            case 0:
                return "Nama";
            case 1:
                return "Username";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch(column){
            case 0:
                return listobject.get(row).getNama();
            case 1:
                return listobject.get(row).getUsername();
            default:
                return null;
        }
    }
    
}
