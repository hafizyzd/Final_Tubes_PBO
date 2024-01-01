/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class Tabel_Nilai extends AbstractTableModel{
    List<Mahasiswa> list_mahasiswa;

    public Tabel_Nilai(List<Mahasiswa> list_mahasiswa) {
        this.list_mahasiswa = list_mahasiswa;
    }
    
    @Override
    public int getRowCount() {
        return list_mahasiswa.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }
    
        @Override
    public String getColumnName(int column) {
        switch (column){
            case 0:
                return "PBO";
            case 1:
                return "Basis Data";
            case 2:
                return "Jaringan Enterprise";
            //case 3:
                //return "Rata Rata";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch(column){
            case 0:
                return list_mahasiswa.get(row).getNilai_pbo();
            case 1:
                return list_mahasiswa.get(row).getNilai_bd();
            case 2:
                return list_mahasiswa.get(row).getNilai_jre();
            //case 3:
                //return list_mahasiswa.get(row).getNilai();
            default:
                return null;
        }
    }
    
}
