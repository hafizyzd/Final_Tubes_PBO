
package Model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TabelNilai extends AbstractTableModel{
    List<Mahasiswa> list_mahasiswa;

    public TabelNilai(List<Mahasiswa> list_mahasiswa) {
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
                return "PBO";
            case 3:
                return "Basis Data";
            case 4:
                return "Enterprise";
            //case 5:
                //return "Rata Rata";
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
                return list_mahasiswa.get(row).getNilai_pbo();
            case 3:
                return list_mahasiswa.get(row).getNilai_bd();
            case 4:
                return list_mahasiswa.get(row).getNilai_jre();
            //case 5:
                //return list_mahasiswa.get(row).getNilai();
            default:
                return null;
        }
    }

    
}
