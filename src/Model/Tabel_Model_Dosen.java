
package Model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class Tabel_Model_Dosen extends AbstractTableModel{
    
    List<Dosen> list_dosen;

    public Tabel_Model_Dosen(List<Dosen> list_dosen) {
        this.list_dosen = list_dosen;
    }
    
    @Override
    public int getRowCount() {
         return list_dosen.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column){
            case 0:
                return "NIP";
            case 1:
                return "NAMA";
            case 2:
                return "USERNAME";
            case 3:
                return "EMAIL";
            case 4:
                return "ROLE";
            default:
                return null;
        }
    }
    
    @Override
    public Object getValueAt(int row, int column) {
        switch(column){
            case 0:
                return list_dosen.get(row).getNip();
            case 1:
                return list_dosen.get(row).getNama();
            case 2:
                return list_dosen.get(row).getUsername();
            case 3:
                return list_dosen.get(row).getEmail();
            case 4:
                return list_dosen.get(row).getRole();
            default:
                return null;
        }
    }
    
}
