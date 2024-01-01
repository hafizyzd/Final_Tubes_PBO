package Controller;

import DAOListener.Listener_Register;
import DataAccessObject.DAO_ObjectRegister;
import Model.ObjectRegister;
import View.RegisterView;
import javax.swing.JOptionPane;

public class RegisterController {

    RegisterView regis;
    Listener_Register listener;

    public RegisterController(RegisterView regis) {
        this.regis = regis;
        listener = new DAO_ObjectRegister();
    }
    
    public void aksiRegister() {
    try {
        String nama = regis.getTxtnama().getText();
        String username = regis.getTxtusername().getText();
        String passwordText = regis.getTxtpassword().getText();
        String konfirmasiText = regis.getTxtkonfirmasi().getText();

        if (!nama.isEmpty() && !username.isEmpty() && !passwordText.isEmpty() && !konfirmasiText.isEmpty()) {
            try {
                int pass = Integer.parseInt(passwordText);
                int konfir = Integer.parseInt(konfirmasiText);

                if (pass == konfir) {
                    ObjectRegister b = new ObjectRegister();
                    b.setNama(nama);
                    b.setPassword(pass);
                    b.setUsername(username);
                    listener.tambah(b);
                    JOptionPane.showMessageDialog(null, "Berhasil Regis");
                } else {
                    JOptionPane.showMessageDialog(regis, "Pastikan password sama");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(regis, "Password harus bilangan bulat");
            }
        } else {
            JOptionPane.showMessageDialog(regis, "Pastikan semua data lengkap");
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(regis, "Pastikan password bilangan bulat");
    }
}

//    public void aksiRegister() {
//        try {
//            String nama = regis.getTxtnama().getText();
//            String username = regis.getTxtusername().getText();
//            Integer pass = Integer.parseInt(regis.getTxtpassword().getText());
//            Integer konfir = Integer.parseInt(regis.getTxtkonfirmasi().getText());
//            if (!regis.getTxtnama().getText().isEmpty() & !regis.getTxtusername().getText().isEmpty() & !regis.getTxtpassword().getText().isEmpty() & !regis.getTxtkonfirmasi().getText().isEmpty()) {
//                try {
//                    int cekpass = Integer.parseInt(regis.getTxtpassword().getText());
//                    int cekkonfir = Integer.parseInt(regis.getTxtkonfirmasi().getText());
//                    if (pass.equals(konfir)) {
//                        ObjectRegister b = new ObjectRegister();
//                        b.setNama(nama);
//                        b.setPassword(pass);
//                        b.setUsername(username);
//                        listener.tambah(b);
//                        JOptionPane.showMessageDialog(null, "Berhasil Regis");
//                    }else{
//                        JOptionPane.showMessageDialog(regis, "Pastikan password sama");
//                    }
//                } catch (NumberFormatException e) {
//                    JOptionPane.showMessageDialog(regis, "Password harus integer");
//                }
//            } else {
//                JOptionPane.showMessageDialog(regis, "Isi dengan Lengkap");
//            }
//        } catch (NumberFormatException e) {
//            JOptionPane.showMessageDialog(regis, "Pastikan password bilangan bulat");
//        }
//    }

}
