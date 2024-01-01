package Model;

import java.util.List;
import javax.swing.table.AbstractTableModel;


public class Tabel_Model_Mahasiswa extends AbstractTableModel{
    List<Mahasiswa> list_mahasiswa;

    public Tabel_Model_Mahasiswa(List<Mahasiswa> list_mahasiswa) {
        this.list_mahasiswa = list_mahasiswa;
    }
    

    @Override
    public int getRowCount() {
        return list_mahasiswa.size();
    }
    
    @Override
    public int getColumnCount() {
        return 5;
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column){
            case 0:
                return "NIM";
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
                return list_mahasiswa.get(row).getNim();
            case 1:
                return list_mahasiswa.get(row).getNama();
            case 2:
                return list_mahasiswa.get(row).getUsername();
            case 3:
                return list_mahasiswa.get(row).getEmail();
            case 4:
                return list_mahasiswa.get(row).getRole();
            default:
                return null;
        }
    }
    
}
